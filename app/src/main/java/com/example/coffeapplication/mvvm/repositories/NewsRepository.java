package com.example.coffeapplication.mvvm.repositories;

import com.example.coffeapplication.R;
import com.example.coffeapplication.mvvm.models.News;

import java.util.ArrayList;
import java.util.Collections;

public class NewsRepository {
    ArrayList<News> holder;

    public NewsRepository() {
        holder = new ArrayList<>();

        News n1 = new News(R.drawable.coffee1, "McSteamy over McDreamy any day!", "1.11.2022");
        holder.add(n1);
        News n2 = new News(R.drawable.coffee2, "There’s nothing sweeter than a cup of bitter coffee", "31.10.2022");
        holder.add(n2);
        News n3 = new News(R.drawable.coffee3, "The day of freshness by new coffee", "30.10.2022");
        holder.add(n3);
        News n4 = new News(R.drawable.coffee5, "Hot day, cold brew", "29.10.2022");
        holder.add(n4);
        News n5 = new News(R.drawable.coffeesweets, "A cup of coffee with sweets", "28.10.2022");
        holder.add(n5);
        News n6 = new News(R.drawable.coffeegf, "A cup of coffee may brings closer", "27.10.2022");
        holder.add(n6);


    }

    public ArrayList<News> getHolder() {
        Collections.reverse(holder);
        return holder;
    }
}
