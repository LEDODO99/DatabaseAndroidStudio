package com.example.ledod.databasesideas;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Monsters> monsterList=new ArrayList<>();

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createMonsterList();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListAdapter adapter = new AdapterMonstersList(this,monsterList);
        ListView myListView= (ListView) findViewById(R.id.ListMonsters);
        myListView.setAdapter(adapter);

        myListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                        final Monsters monsterInfo=(Monsters)(adapterView.getItemAtPosition(position));
                        Intent i = new Intent(MainActivity.this,MonsterInfo.class);
                        i.putExtra("Monster",monsterInfo);
                        startActivity(i);
                        Monsters monster=(Monsters) (adapterView.getItemAtPosition(position));
                    }
                }
        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void createMonsterList(){
        monsterList.add(new Monsters(1,"Anjanath","Brute Wyvern","A t-rex type creature that breathes fire. Becareful since it will attackeverything in its path."));
        monsterList.add(new Monsters(2,"Rathian","Flying wyvern","Female of the wyvern royals. Althoug there are many along its partners Rathalos they rule over the Ancient Forrest"));
        monsterList.add(new Monsters(3,"Jyuratodus","Piscine Wyvern","A teritorial monster with fishlike characteristics, able to breathe in the water and land. It slithers its way through the rivers and ponds of the Wildspire Waste"));
    }
}
