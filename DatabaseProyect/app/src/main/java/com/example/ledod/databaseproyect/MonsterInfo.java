package com.example.ledod.databasesideas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by ledod on 01/03/2018.
 */

public class MonsterInfo extends AppCompatActivity {
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_monster_descriptor);

        Intent intent=getIntent();
        Monsters monster=intent.getParcelableExtra("Monster");

        String name=monster.getName();
        String type=monster.getType();
        String description=monster.getDescription();

        TextView textName=findViewById(R.id.monsterName);
        TextView textType=findViewById(R.id.monsterType);
        TextView textDesc=findViewById(R.id.monsterDescription);

        textName.setText(name);
        textType.setText(type);
        textDesc.setText(description);
    }
}
