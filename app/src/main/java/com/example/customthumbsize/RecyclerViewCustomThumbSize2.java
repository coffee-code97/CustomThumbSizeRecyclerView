package com.example.customthumbsize;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;

import androidx.core.view.ScrollingView;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewCustomThumbSize2 extends RecyclerView implements ScrollingView {
    int trackLength = -1;
    int thumbSize = dpToPx(64);
    int totalLength = -1;

    public RecyclerViewCustomThumbSize2(Context context) {
        super(context);
    }

    public RecyclerViewCustomThumbSize2(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RecyclerViewCustomThumbSize2(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override
    public int computeVerticalScrollRange() {
        if (trackLength == -1) {
            trackLength = this.getHeight();
        }
        return trackLength;
    }

    @Override
    public int computeVerticalScrollOffset() {
        computeSizes();
        int highestVisiblePixel = super.computeVerticalScrollOffset();
        int invisiblePartOfRecyclerView = totalLength - trackLength;
        int scrollAmountRemaining = invisiblePartOfRecyclerView - highestVisiblePixel;
        if (invisiblePartOfRecyclerView == scrollAmountRemaining) {
            return 0;
        } else if (scrollAmountRemaining > 0) {
            return Math.round((trackLength - thumbSize) / ((float) invisiblePartOfRecyclerView / highestVisiblePixel));
        } else {
            return trackLength - thumbSize;
        }
    }

    @Override
    public int computeVerticalScrollExtent() {
        return thumbSize;
    }

    private void computeSizes() {
            /*if (recyclerView == null) {
                recyclerView = (CustomThumbSizeRecyclerView) tuningDialog.findViewById(R.id.tuningsRecyclerView);
                int rec = recyclerView.getMeasuredHeight();
                trackLength = rec;
                recyclerView.measure(
                        MeasureSpec.makeMeasureSpec(recyclerView.getMeasuredWidth(), MeasureSpec.EXACTLY),
                        MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED));
                totalLength = recyclerView.getMeasuredHeight();
                recyclerView.measure(
                        MeasureSpec.makeMeasureSpec(recyclerView.getMeasuredWidth(), MeasureSpec.EXACTLY),
                        MeasureSpec.makeMeasureSpec(rec, MeasureSpec.UNSPECIFIED));
            }*/
        if (totalLength == -1) {
            int rec = this.getMeasuredHeight();
            trackLength = rec;
            this.measure(
                    MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), MeasureSpec.EXACTLY),
                    MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED));
            totalLength = this.getMeasuredHeight();
            this.measure(
                    MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), MeasureSpec.EXACTLY),
                    MeasureSpec.makeMeasureSpec(rec, MeasureSpec.AT_MOST));
        }
    }


    public static int dpToPx(int dp) {
        return (int) (dp * Resources.getSystem().getDisplayMetrics().density);
    }
}