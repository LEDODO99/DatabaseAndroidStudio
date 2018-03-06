package com.example.ledod.databasesideas;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
/**
 * Created by ledod on 01/03/2018.
 */

public class AdapterMonsterDescriptor extends ArrayAdapter<Monsters> {
public AdapterMonsterDescriptor(@NonNull Context context, ArrayList<Monsters> resource) {
        super(context, R.layout.custom_row ,resource);
        }

@NonNull
@Override
public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater mLInflater = LayoutInflater.from(getContext());
        View customView=mLInflater.inflate(R.layout.layout_monster_descriptor,parent,false);

        Monsters monster = getItem(position);
        TextView monsterName=(TextView) customView.findViewById(R.id.monsterName);
        TextView monsterType=(TextView) customView.findViewById(R.id.monsterType);
        TextView monsterDescription=(TextView) customView.findViewById(R.id.monsterDescription);


        monsterName.setText(monster.getName());
        monsterType.setText(monster.getType());
        monsterDescription.setText(monster.getDescription());

        return customView;
        }
        }