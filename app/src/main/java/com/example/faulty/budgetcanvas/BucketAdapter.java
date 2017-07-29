package com.example.faulty.budgetcanvas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by faulty on 7/29/17.
 */

public class BucketAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<Bucket> mBuckets;

    public BucketAdapter(Context context, ArrayList<Bucket> buckets) {
        mContext = context;
        mBuckets = buckets;
    }

    @Override
    public int getCount() {
        return mBuckets.size();
    }

    @Override
    public Object getItem(int i) {
        return mBuckets.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0; // not actually using this. Can be used to tag items for easy reference.
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        ViewHolder holder;

        if (convertView == null) {
            // brand new view
            // LayoutInflater takes xml layouts and turns them into views in code
            // we can then use.
            // Get the view from the context
            convertView = LayoutInflater.from(mContext).inflate(R.layout.slider_list_item_layout, null);
            // null above is a ViewGroup root. It's not needed in this situation

            // initialize holder variable
            holder = new ViewHolder();

            // Set holder just like setting views in an Activity onCreate() method.
            holder.bucketLabelTextView = (TextView) convertView.findViewById(R.id.bucketLabelTextView);
            holder.seekBar = (SeekBar) convertView.findViewById(R.id.seekBar);

            convertView.setTag(holder); // sets a tag for the view that we will reuse
        }else{
            // views are already set up, so set ViewHolder based on the tag set above.
            // Because ViewHolder is associated with the View, and we called setTag() when
            // setting up the views for the items when creating them above, then we just
            // need to cast it as a ViewHolder class (declared as embedded class below).
            holder = (ViewHolder) convertView.getTag();
        }

        Bucket bucket = mBuckets.get(position);

        holder.bucketLabelTextView.setText(bucket.getmBucketName());
        holder.seekBar.setProgress(5);


        return convertView;
    }

    private static class ViewHolder {
        TextView bucketLabelTextView;
        SeekBar seekBar;

    }
}
