package com.example.coffeapplication.mvvm.repositories;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.coffeapplication.R;
import com.example.coffeapplication.mvvm.models.Cart;
import com.example.coffeapplication.mvvm.models.MenuItem;
import com.example.coffeapplication.mvvm.models.News;
import com.example.coffeapplication.mvvm.models.Orders;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Collections;

public class MenusRepository {
    ArrayList<MenuItem> holder = new ArrayList<>();
    ArrayList<MenuItem> standartHolder = new ArrayList<>();
    ArrayList<MenuItem> seasonHolder = new ArrayList<>();
    ArrayList<MenuItem> bakeHolder = new ArrayList<>();

    public MenusRepository() {
        holder = new ArrayList<>();
        standartHolder = new ArrayList<>();
        seasonHolder = new ArrayList<>();
        bakeHolder = new ArrayList<>();
        createMenu();

        MenuItem item;
        for (int i=0; i < holder.size(); i++) {
            item = holder.get(i);
            if (item.getId().equals("standart")) {
                standartHolder.add(item);
            } else if (item.getId().equals("bake")) {
                bakeHolder.add(item);
            }
            if (item.isSeason()) {
                seasonHolder.add(item);
            }
        }
    }

    private void createMenu() {
        MenuItem m1 = new MenuItem("Cappuccino", "100 Rs", "standart", R.drawable.coffee1, false);
        holder.add(m1);

        MenuItem m2 = new MenuItem("Latte", "200 Rs", "standart", R.drawable.coffee2, false);
        holder.add(m2);

        MenuItem m3 = new MenuItem("Espresso", "300 Rs", "standart", R.drawable.coffee5, false);
        holder.add(m3);

        MenuItem m4 = new MenuItem("Roll ", "15 Rs", "season-bake", R.drawable.croissant, true);
        holder.add(m4);

        MenuItem m5 = new MenuItem("Barfi ", "10 Rs", "season-bake", R.drawable.barfi, true);
        holder.add(m5);
        MenuItem m6 = new MenuItem("Jellebi ", "5 Rs", "season-bake", R.drawable.jellebi, true);
        holder.add(m6);
        MenuItem m7 = new MenuItem("Laddu ", "10 Rs", "season-bake", R.drawable.laddu, true);
        holder.add(m7);
        MenuItem m8 = new MenuItem("Biscuit", "50 Rs", "season-bake", R.drawable.biscuit, true);
        holder.add(m8);
        MenuItem m9 = new MenuItem("Gulab Jamun", "50 Rs", "season-bake", R.drawable.gulabjamun, true);
        holder.add(m9);
        MenuItem m10 = new MenuItem("Cookies", "40 Rs", "season-bake", R.drawable.cookies, true);
        holder.add(m10);
        MenuItem m11 = new MenuItem("Rasmalai", "40 Rs", "season-bake", R.drawable.rasmalai, true);
        holder.add(m11);
        MenuItem m12 = new MenuItem("Samosa", "40 Rs", "season-bake", R.drawable.samosa, true);
        holder.add(m12);
        MenuItem m13 = new MenuItem("Rosgulla", "40 Rs", "season-bake", R.drawable.rosgulla, true);
        holder.add(m13);
        MenuItem m14 = new MenuItem("Pastry", "40 Rs", "season-bake", R.drawable.pastry, true);
        holder.add(m14);

        MenuItem m15 = new MenuItem("Blackpepper", "10 Rs", "bake", R.drawable.cbp, false);
        holder.add(m15);
        MenuItem m16 = new MenuItem("Elaichi", "20 Rs", "bake", R.drawable.cela, false);
        holder.add(m16);
        MenuItem m17 = new MenuItem("Ginger", "15 Rs", "bake", R.drawable.ginger, false);
        holder.add(m17);
        MenuItem m18 = new MenuItem("Extra milky cream", "40 Rs", "bake", R.drawable.cream, false);
        holder.add(m18);
        MenuItem m19 = new MenuItem("Clove", "5 Rs", "bake", R.drawable.clove, false);
        holder.add(m19);
        MenuItem m20 = new MenuItem("Extra Sugar", "5 Rs", "bake", R.drawable.sugar, false);
        holder.add(m20);
        MenuItem m21 = new MenuItem("Tej Patta", "5 Rs", "bake", R.drawable.tejpatta, false);
        holder.add(m21);
        MenuItem m22 = new MenuItem("Cinnamon", "5 Rs", "bake", R.drawable.cinnamon, false);
        holder.add(m22);
        MenuItem m23 = new MenuItem("Rock Salt", "5 Rs", "bake", R.drawable.rocksalt, false);
        holder.add(m23);
    }

    public ArrayList<MenuItem> getStandartHolder() {
        return standartHolder;
    }

    public ArrayList<MenuItem> getSeasonHolder() {
        return seasonHolder;
    }

    public ArrayList<MenuItem> getBakeHolder() {
        return bakeHolder;
    }

    public ArrayList<MenuItem> getHolder() {
        return holder;
    }
}
