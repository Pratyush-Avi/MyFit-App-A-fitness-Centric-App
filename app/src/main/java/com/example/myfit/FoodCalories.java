package com.example.myfit;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class FoodCalories  extends AppCompatActivity {
    private HashMap _$_findCachedViewById;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_food_calories);
        ListView listview = this.findViewById(R.id.listView);
        boolean var4 = false;
        List list = (List) (new ArrayList());
        TextView calorieText = this.findViewById(R.id.calorieText);
        Button reset = this.findViewById(R.id.reset);
        final TextView value = this.findViewById(R.id.valueCal);
        list.add(new model("Rice", "Plain Rice : 200 cal", R.drawable.rice_bowl));
        list.add(new model("Chapati", " 2 Plain chapati : 100 cal", R.drawable.roti_canai));
        list.add(new model("Dal", "Plain dal : 50 cal", R.drawable.dal2));
        list.add(new model("Salad", "Mix salad : 50 cal", R.drawable.salad));
        list.add(new model("Noodles", "Noodles : 140 cal", R.drawable.noodles));
        list.add(new model("Burger", "Burger: 200 cal", R.drawable.hamburger));
        list.add(new model("Pizza", " Pizza : 250 cal", R.drawable.pizza));
        list.add(new model("cold drink", "Carbonated cold drink :140 cal", R.drawable.soft_drink));
        list.add(new model("Apple", "Apple : 114 cal", R.drawable.apple));
        list.add(new model("Bread", "4-bread Slice :65 cal", R.drawable.baguette));
        list.add(new model("Cake", "1- Cake Slice : 132 cal", R.drawable.cake));
        list.add(new model("Muffin", "muffin : 47 cal", R.drawable.cupcake));
        list.add(new model("Carrot", " carrot: 30 cal", R.drawable.carrot));
        list.add(new model("Chicken", " chicken : 220 cal", R.drawable.chicken_leg));
        list.add(new model("Chocolate", "Chocolate bar : 200 cal", R.drawable.chocolate));
        list.add(new model("Donut", "donut : 110 cal", R.drawable.donut));
        list.add(new model("Laddu", "Laddu : 170  cal", R.drawable.fazuelos));
        list.add(new model("French fries", "French Fries medium : 110 cal", R.drawable.french_fries));
        list.add(new model("Orange", " Orange : 52 cal", R.drawable.fruit));
        list.add(new model("Hot dog", "Hot Dog: 95  cal", R.drawable.hot_dog));
        list.add(new model("Rolls", " Roll : 68 cal", R.drawable.kebab));
        list.add(new model("Potato Chips", "Potato chips : 155 cal", R.drawable.potato_chips));
        list.add(new model("Sundae", "Sundae : 110 cal", R.drawable.sundae));
        list.add(new model("Ice Cream", " Ice Cream : 100 cal", R.drawable.parfait));
        list.add(new model("Strawberry", "Strawberry : 110 cal", R.drawable.strawberry));
        list.add(new model("meat", "250 g red meat : 300 cal", R.drawable.meat));
        list.add(new model("Khichidi", "Khichidi : 70 cal", R.drawable.vegan_food));

        listview.setAdapter(new food_adapter(this, R.layout.listview_row, list));
        ((ListView)this.findViewById(R.id.listView)).setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public final void onItemClick(@NotNull AdapterView parent, @NotNull View view, int position, long id) {
                TextView var10000;
                TextView var10001;
                String var6;
                boolean var7;

                if (position == 0) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 200));
                }

                if (position == 1) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 100));
                }

                if (position == 2) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 50));
                }

                if (position == 3) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 50));
                }

                if (position == 4) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 140));
                }

                if (position == 5) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 200));
                }

                if (position == 6) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 250));
                }

                if (position == 7) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 140));
                }

                if (position == 8) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 110));
                }

                if (position == 9) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 200));
                }

                if (position == 10) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 114));
                }

                if (position == 11) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 65));
                }


                if (position == 12) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 132));
                }

                if (position == 13) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 47));
                }

                if (position == 14) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 30));
                }

                if (position == 15) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 220));
                }

                if (position == 16) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 200));
                }

                if (position == 17) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 110));
                }

                if (position == 18) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 170));
                }

                if (position == 19) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 110));
                }

                if (position == 20) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 52));
                }

                if (position == 21) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 95));
                }

                if (position == 22) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 68));
                }

                if (position == 23) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 115));
                }


                if (position == 24) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 110));
                }

                if (position == 25) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 100));
                }

                if (position == 26) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 110));
                }

                if (position == 27) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 300));
                }

                if (position == 28) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 70));
                }

            }

        });
        reset.setOnClickListener(new OnClickListener() {
            public final void onClick(View it) {
                value.setText("0");
            }
        });
    }

}