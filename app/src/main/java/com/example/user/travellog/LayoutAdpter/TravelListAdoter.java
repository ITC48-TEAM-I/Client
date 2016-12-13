package com.example.user.travellog.LayoutAdpter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.user.travellog.Entry.Travel;
import com.example.user.travellog.MainActivity;
import com.example.user.travellog.MapTestActivity;
import com.example.user.travellog.R;
import com.example.user.travellog.TravelListActivity;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by 44 on 2016/12/12.
 */

public class TravelListAdoter extends BaseAdapter {
    Context context;
    LayoutInflater layoutInflater = null;
    ArrayList<Travel> travels;

    public TravelListAdoter(Context context){
        this.context = context;
        this.layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void setTravels(ArrayList<Travel> travels){
        this.travels = travels;
    }

    @Override
    public  int getCount(){
        return this.travels.size();
    }

    @Override
    public Object getItem(int position){
        return travels.get(position);
    }

    @Override
    public  long getItemId(int position){
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent){
        convertView = layoutInflater.inflate(R.layout.travel_list_item, parent, false);

        ((TextView)convertView.findViewById(R.id.travel_date)).setText(travels.get(position).getTravelDate());
        ((TextView)convertView.findViewById(R.id.travel_name)).setText(travels.get(position).getCountryName() + " : " + travels.get(position).getAreaName());
        ((Button)convertView.findViewById(R.id.toMap)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MapTestActivity.class);
                intent.putExtra("travel",  (Travel)getItem(position));
                context.startActivity(intent);
            }
        });
        return convertView;
    }


}
