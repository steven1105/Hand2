package com.example.appledev123.hand.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.appledev123.hand.R;

import java.util.List;

/**
 * Created by appledev123 on 2017/1/9.
 */

public class MainPageAdapter extends RecyclerView.Adapter<MainPageAdapter.CardViewHolder> {
    private MyItemClickListener mItemClickListener;

    public MainPageAdapter(Context context, List<String> datas) {

    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_recycler_view_item01, parent, false);
        CardViewHolder vh = new CardViewHolder(view);
        return vh;
    }
    public void setOnItemClickListener(MyItemClickListener listener){
        this.mItemClickListener = listener;
    }
    
    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {

    }

    public interface MyItemClickListener {
        public void onItemClick(View view);
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    static class CardViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private final TextView mTextView, mTextContent;
        private final ImageView mImageTitle;
        private MyItemClickListener mListener;

        public CardViewHolder(View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(R.id.tv_title);
            mTextContent = (TextView) itemView.findViewById(R.id.tv_content);
            mImageTitle = (ImageView) itemView.findViewById(R.id.iv_title);
            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View view) {
            if (mListener != null) {
                mListener.onItemClick(view);
            }
        }
    }

}

