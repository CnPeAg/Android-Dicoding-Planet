package com.dicoding.picodiploma.infoplanet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dicoding.picodiploma.infoplanet.adapter.ListPlanetAdapter;
import com.dicoding.picodiploma.infoplanet.model.Planet;
import com.dicoding.picodiploma.infoplanet.model.PlanetsData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
    private RecyclerView rvPlanets;
    private ArrayList<Planet> list = new ArrayList<>();


    private void showSelectedPlanet(Planet data){
//        Intent moveDetail = new Intent(MainActivity.this, moveDetail.class);
////        moveDetail.putExtra(moveDetail.EXTRA_NAME, "Helloo");
////        moveDetail.putExtra(moveDetail.EXTRA_DETAIL, "Apa");
//        startActivity(moveDetail);

        Intent intent = new Intent(MainActivity.this, moveDetail.class);
        intent.putExtra(moveDetail.EXTRA_NAME, data.getName());
        intent.putExtra(moveDetail.EXTRA_DETAIL, data.getDetail());
        intent.putExtra(moveDetail.EXTRA_PHOTO, data.getPhoto());
        startActivity(intent);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPlanets =  findViewById(R.id.rv_planet);
        rvPlanets.setHasFixedSize(true);

        list.addAll(PlanetsData.getListData());
        showRecyclerList();

//        Planet planet = listPlanet.get(position);
//        Glide.with(holder.itemView.getContext())
//                .load(planet.getPhoto())
//                .apply(new RequestOptions().override(550, 550))
//                .into(holder.imgPhoto);
//        holder.tvName.setText(planet.getName());
//        holder.tvDetail.setText(planet.getDetail());
    }

    private void showRecyclerList(){
        rvPlanets.setLayoutManager(new LinearLayoutManager(this));
        ListPlanetAdapter listPlanetAdapter = new ListPlanetAdapter(list);
        rvPlanets.setAdapter(listPlanetAdapter);

        listPlanetAdapter.setOnItemClickCallback(new ListPlanetAdapter.OnItemClickCallback(){
            @Override
            public void onItemClicked(Planet data){
                showSelectedPlanet(data);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode){
        switch (selectedMode){
            case R.id.action_list:
                showRecyclerList();
                break;
            case R.id.action_about:
                Intent moveIntent = new Intent(MainActivity.this, About.class);
                startActivity(moveIntent);
                break;
        }
    }

//    @Override
//    public void onClick(View v) {
//        switch (v.getId()) {
//            case R.id.tv_item_detail:
//                Intent moveDetail = new Intent(MainActivity.this, MoveWithDataActivity.class);
//                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "DicodingAcademy Boy");
//                moveWithDataIntent.putExtra(moveDetail.EXTRA_AGE, 5);
//                startActivity(moveWithDataIntent);
//                break;
//    }

    private void moveDetail(Planet data) {
        Intent intent = new Intent(MainActivity.this, moveDetail.class);
        intent.putExtra(moveDetail.EXTRA_NAME, data.getName());
        intent.putExtra(moveDetail.EXTRA_DETAIL, data.getDetail());
        intent.putExtra(moveDetail.EXTRA_PHOTO, data.getPhoto());
        startActivity(intent);
    }
}
