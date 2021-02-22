package edu.temple.myapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ImageAdapter extends BaseAdapter {

    Context context;
    String[] items;
    String[] descriptions;
    int[] imageResources;

    public ImageAdapter (Context context, String[] items, String[] descriptions, int[] imageResources) {
        this.context = context;
        this.items = items;
        this.descriptions = descriptions;
        this.imageResources = imageResources;
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int position) {
        return items[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView = new TextView(context);
        textView.setText(items[position]);
        return textView;
    }
}
