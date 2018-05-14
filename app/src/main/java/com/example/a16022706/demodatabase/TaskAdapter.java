package com.example.a16022706.demodatabase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TaskAdapter extends ArrayAdapter {

    int resource;
    private ArrayList<Task> task;
    private Context context;
    private TextView tvID;
    private TextView tvDesc;
    private TextView tvDate;

    public TaskAdapter(Context context, int resource, ArrayList<Task> objects) {
        super(context,resource,objects);
        this.context = context;
        this.task = objects;
        this.resource = resource;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowVIew = inflater.inflate(R.layout.activity_row, parent, false);
        tvID = (TextView) rowVIew.findViewById(R.id.tvID);
        tvDesc = (TextView) rowVIew.findViewById(R.id.tvDesc);
        tvDate = (TextView) rowVIew.findViewById(R.id.tvDate);
        Task data = task.get(position);
        tvID.setText(""+data.getId());
        tvDesc.setText(data.getDescription());
        tvDate.setText(data.getDate());


        return rowVIew;
    }

}
