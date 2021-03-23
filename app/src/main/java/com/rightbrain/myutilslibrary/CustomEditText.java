package com.rightbrain.myutilslibrary;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

public class CustomEditText extends androidx.appcompat.widget.AppCompatEditText{
    Typeface tf;
    public CustomEditText(@NonNull Context context) {
        super(context);

        tf = ResourcesCompat.getFont(context, R.font.montserrat);
        this.setTypeface(tf);
        int padding = (int) getResources().getDimension(R.dimen.text_padding);
        this.setTextSize( getResources().getDimension(R.dimen.text_size));
        this.setTextColor(Color.parseColor("#1a1a1a"));
        this.setBackground(ContextCompat.getDrawable(context, R.drawable.edittextstyle));


        this.setPadding(
                padding,
                padding,
                padding,
                padding
        );

    }

    public CustomEditText(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        tf = ResourcesCompat.getFont(context, R.font.montserrat);
        this.setTypeface(tf);
        int padding = (int) getResources().getDimension(R.dimen.text_padding);
        this.setTextSize( getResources().getDimension(R.dimen.text_size));
        this.setTextColor(Color.parseColor("#1a1a1a"));
        this.setBackground(ContextCompat.getDrawable(context, R.drawable.edittextstyle));
        this.setPadding(
                padding,
                padding,
                padding,
                padding
        );
    }

    public CustomEditText(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        tf = ResourcesCompat.getFont(context, R.font.montserrat);
        this.setTypeface(tf);
        int padding = (int) getResources().getDimension(R.dimen.text_padding);
        this.setTextSize( getResources().getDimension(R.dimen.text_size));
        this.setTextColor(Color.parseColor("#1a1a1a"));
        this.setBackground(ContextCompat.getDrawable(context, R.drawable.edittextstyle));
        this.setPadding(
                padding,
                padding,
                padding,
                padding
        );


    }
}
