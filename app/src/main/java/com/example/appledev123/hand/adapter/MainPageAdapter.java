package com.example.appledev123.hand.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.appledev123.hand.R;

/**
 * Created by appledev123 on 2017/1/9.
 */

public class MainPageAdapter extends RecyclerView.Adapter<MainPageAdapter.CardViewHolder> {

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_recycler_view_item01,parent,false);
        CardViewHolder vh = new CardViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    static class CardViewHolder extends RecyclerView.ViewHolder {

        private final TextView mTextView,mTextContent;
        private final ImageView mImageTitle;

        public CardViewHolder(View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(R.id.tv_title);
            mTextContent = (TextView) itemView.findViewById(R.id.tv_content);
            mImageTitle = (ImageView) itemView.findViewById(R.id.iv_title);
        }
    }

    }

