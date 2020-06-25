package com.dicoding.picodiploma.infoplanet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dicoding.picodiploma.infoplanet.adapter.ListPlanetAdapter;
import com.dicoding.picodiploma.infoplanet.model.Planet;

import java.util.ArrayList;

public class moveDetail extends AppCompatActivity {
    private TextView namex;
    private TextView detailx;
    private String name, detail;
    private int photo;
    private ImageView photox;

    private ArrayList<Planet> listPlanet;

    public static final String EXTRA_PHOTO = "extra_photo";
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_DETAIL = "extra_detail";

    @NonNull
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView photox = findViewById(R.id.img_item_photo);
        TextView namex = findViewById(R.id.tv_item_name);
        TextView detailx = findViewById(R.id.tv_item_detail);

        Glide.with(this).load(getIntent().getIntExtra(EXTRA_PHOTO,0)).into(photox);
        namex.setText(getIntent().getStringExtra(EXTRA_NAME));
        detailx.setText(getIntent().getStringExtra(EXTRA_DETAIL));

//        Integer photo = getIntent().getIntExtra(EXTRA_PHOTO, 0);
//        String name = getIntent().getStringExtra(EXTRA_NAME);
//        String detail = getIntent().getStringExtra(EXTRA_DETAIL);

//        photox.setImageResource(photo);
//        namex.setText(name);
//        detailx.setText(detail);
    }


//    public void onBindViewHolder(@NonNull final DetailViewHolder holder, int position) {
//
//        Planet planet = listPlanet.get(position);
//        Glide.with(holder.itemView.getContext())
//                .load(planet.getPhoto())
//                .apply(new RequestOptions().override(550, 550))
//                .into(holder.imgPhoto);
//        holder.tvName.setText(planet.getName());
//        holder.tvDetail.setText(planet.getDetail());
//    }

    class DetailViewHolder{
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        DetailViewHolder(View itemView) {
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
