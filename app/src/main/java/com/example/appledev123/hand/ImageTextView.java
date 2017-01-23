package com.example.appledev123.hand;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/**
 * Created by appledev123 on 2017/1/23.
 */

public class ImageTextView extends RelativeLayout {
    public ImageTextView(Context context) {
        super(context);
        init();
    }

    private void init() {
        
    }

    public ImageTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ImageTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public ImageTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

    }
}
