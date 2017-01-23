package com.example.appledev123.hand.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.example.appledev123.hand.R;
import com.example.appledev123.hand.adapter.MainPageAdapter;
import com.mancj.materialsearchbar.MaterialSearchBar;

import java.util.List;

import static com.example.appledev123.hand.R.id.searchBar;

public class MainActivity extends AppCompatActivity
        implements MaterialSearchBar.OnSearchActionListener, MainPageAdapter.MyItemClickListener {
    public MaterialSearchBar searchBar;
    private RecyclerView recyclerView;
    private List<String> data;
    private BottomNavigationBar mBottomNavigationBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        setSupportActionBar(toolbar);
        searchBar = (MaterialSearchBar) findViewById(R.id.searchBar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, QuestActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
        mBottomNavigationBar=(BottomNavigationBar)findViewById(R.id.bottom_navigation_bar);
        mBottomNavigationBar.addItem(new BottomNavigationItem(R.mipmap.ic_launcher_round, "repository"))
                .addItem(new BottomNavigationItem(R.mipmap.ic_launcher_round, "request"))
                .addItem(new BottomNavigationItem(R.mipmap.ic_launcher_round, "me"))
                .initialise();
        initSearchView(searchBar);
        initRecyclerView(recyclerView);
    }

    private void initRecyclerView(RecyclerView recyclerView) {
        MainPageAdapter mainPageAdapter = new MainPageAdapter(this, data);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//设置布局管理器
        recyclerView.setLayoutManager(layoutManager);

//设置Adapter
        recyclerView.setAdapter(mainPageAdapter);
        mainPageAdapter.setOnItemClickListener(this);
    }

    private void initSearchView(MaterialSearchBar searchBar) {
        searchBar.setHint("pls search tools");
        searchBar.setSpeechMode(true);
        //enable searchbar callbacks
        searchBar.setOnSearchActionListener(this);
        //restore last queries from disk
        //lastSearches = loadSearchSuggestionFromDisk();
        //searchBar.setLastSuggestions(list);
        //Inflate menu and setup OnMenuItemClickListener
        searchBar.inflateMenu(R.menu.main);
        //searchBar.getMenu().setOnMenuItemClickListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onSearchStateChanged(boolean b) {

    }

    @Override
    public void onSearchConfirmed(CharSequence charSequence) {

    }

    @Override
    public void onButtonClicked(int i) {

    }

    @Override
    public void onItemClick(View view) {

    }
}
