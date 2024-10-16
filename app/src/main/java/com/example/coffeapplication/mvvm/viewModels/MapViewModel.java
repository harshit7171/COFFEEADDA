package com.example.coffeapplication.mvvm.viewModels;

import androidx.lifecycle.ViewModel;

import com.example.coffeapplication.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapViewModel extends ViewModel {

    public void getMap(SupportMapFragment mapFragment) {

        MarkerOptions markerOptions = new MarkerOptions();
        MarkerOptions markerOptions1 = new MarkerOptions();
        LatLng CoffeeOne = new LatLng(29.969513, 76.878281);
        LatLng CoffeeTwo = new LatLng(29.969513, 76.878281);
        LatLng Kurukshetra = new LatLng(29.969513, 76.878281);
        markerOptions.position(CoffeeOne).title("found Point").snippet("as path: 6:00 - 22:00");
        markerOptions1.position(CoffeeTwo).title("found Point").snippet("as path: 7:30 - 23:30");

        mapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap googleMap) {
                googleMap.addMarker(markerOptions);
                googleMap.addMarker(markerOptions1);
                googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Kurukshetra,12));
            }
        });
    }
}
