package com.example.appledev123.hand.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

import com.example.appledev123.hand.R;

import java.util.ArrayList;


/**
 * Created by appledev123 on 2017/1/10.
 */

public class QuestActivity extends AppCompatActivity {
    private EditText mEditTextTitle, mEditTextDetail;
    private ArrayList textList;
    public String s;
    private FloatingActionButton mNextButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest);
        mEditTextTitle = (EditText) findViewById(R.id.et_question_title);
        mEditTextDetail = (EditText) findViewById(R.id.et_question_detail);
        mNextButton = (FloatingActionButton) findViewById(R.id.fab);
    }

    @Override
    protected void onResume() {
        super.onResume();
        final String title = this.addTextChange(mEditTextTitle);
        final String detail = this.addTextChange(mEditTextDetail);
        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (null != title && null != detail) {
                    Intent intent = new Intent();
                    intent.setClass(QuestActivity.this, AskedPageActivity.class);
                    QuestActivity.this.startActivity(intent);
                }
            }
        });
    }

    private String addTextChange(EditText... edittext) {
        for (final EditText item : edittext) {
            item.addTextChangedListener(new TextWatcher() {


                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable editable) {
                    s = editable.toString();
                }
            });
        }
        return s;
    }
}
