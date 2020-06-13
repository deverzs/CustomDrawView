package edu.miracostacollege.customdrawview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class CustomBoxView extends View {

    public static final int START_X = 200;
    public static final int START_Y = 200;
    public static final int EXTEND = 200;
    private Rect mRect;
    private Paint mPaint ;

    public CustomBoxView(Context context) {
        super(context);
        init(null);
    }

    public CustomBoxView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public CustomBoxView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    public CustomBoxView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);
    }

    private void init(@Nullable AttributeSet set){
        mRect = new Rect() ;
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setColor(Color.GREEN);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        mRect.left = START_X;
        mRect.top = START_Y;
        mRect.right = START_X + EXTEND;
        mRect.bottom = START_Y + EXTEND;

        canvas.drawRect(mRect, mPaint);
    }

    public void swapColor(){
        mPaint.setColor(mPaint.getColor() == Color.RED ? Color.GREEN : Color.RED);
        invalidate();
        //postInvalidate(); //used for complex UI
    }
}
