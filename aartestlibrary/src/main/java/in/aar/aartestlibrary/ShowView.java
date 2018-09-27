package in.aar.aartestlibrary;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Toast;


public class ShowView extends AppCompatImageView implements AppCompatImageView.OnClickListener{

    public Context mContext;

    public ShowView(Context context) {
        super(context);
        mContext = context;
        setCustomTypeface(context, null);
        setOnClickListener(this);
    }

    public ShowView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        setCustomTypeface(context, attrs);
        setOnClickListener(this);

    }

    public ShowView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
        setCustomTypeface(context, attrs);
        setOnClickListener(this);
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void setCustomTypeface(Context context, AttributeSet attrs)  {
        if(isInEditMode())
            return;
        TypedArray a = context.obtainStyledAttributes(attrs, android.support.v7.appcompat.R.styleable.TextAppearance);
        setBackground(ContextCompat.getDrawable(mContext, R.drawable.ic_launcher_background));
        a.recycle();

    }

    @Override
    public void onClick(View view) {
        try {
            Toast.makeText(mContext,"I am inside library",Toast.LENGTH_SHORT).show();
        }catch (Exception e){
        }
    }


}


