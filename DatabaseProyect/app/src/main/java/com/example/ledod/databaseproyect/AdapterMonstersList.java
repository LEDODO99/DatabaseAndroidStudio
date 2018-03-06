package com.example.ledod.databasesideas;

import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ledod on 28/02/2018.
 */

class AdapterMonstersList extends ArrayAdapter<Monsters> {
    public AdapterMonstersList(@NonNull Context context, ArrayList<Monsters> resource) {
        super(context, R.layout.custom_row ,resource);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater mLInflater = LayoutInflater.from(getContext());
        View customView=mLInflater.inflate(R.layout.custom_row,parent,false);

        Monsters monster = getItem(position);
        TextView monsterName=(TextView) customView.findViewById(R.id.monsterName);
        TextView monsterType=(TextView) customView.findViewById(R.id.monsterType);


        monsterName.setText(monster.getName());
        monsterType.setText(monster.getType());

        return customView;
    }
}
