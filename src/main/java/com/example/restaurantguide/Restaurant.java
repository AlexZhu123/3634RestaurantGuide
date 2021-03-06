package com.example.restaurantguide;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private double rating;
    private String cuisine;
    private String location;
    private String price;
    private String recommendation;
    private int picture;

    public Restaurant(String name, double rating, String cuisine, String location, String price, String recommendation, int picture){
        this.name = name;
        this.rating = rating;
        this.cuisine = cuisine;
        this.location = location;
        this.price = price;
        this.recommendation = recommendation;
        this.picture = picture;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Double getRating(){
        return rating;
    }
    public void setRating(double rating){
        this.rating = rating;
    }
    public String getCuisine(){
        return cuisine;
    }
    public void setCuisine(String cuisine){
        this.cuisine = cuisine;
    }
    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public String getPrice(){
        return price;
    }
    public void setPrice(String price){
        this.price = price;
    }
    public String getRecommendation(){
        return recommendation;
    }
    public void setRecommendation(String recommendation){
        this.recommendation = recommendation;
    }
    public int getPicture(){ return picture; }
    public void setPicture(int picture) { this.picture = picture; }

    public static ArrayList<Restaurant> getRestaurant(){
        ArrayList<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("Lulu's Bakery", 4,"Lebanese","Kingsgrove 2208","$","Meat & Cheese Mixed Pizza ($7)",R.drawable.lulubakery));
        restaurants.add(new Restaurant("Sashimi Shinsengumi",5,"Japanese","Crows Nest 2065","$$$","Dinner Omakase ($85)",R.drawable.sashimi));
        restaurants.add(new Restaurant("Postcard From Napoli",4.5,"Italian","Oatley 2223","$$","Tartufo E Porcini ($24.50)",R.drawable.postcard));
        restaurants.add(new Restaurant("Mejico",3.8,"Mexican","Sydney CBD 2000","$$","Salmon Ceviche ($22)",R.drawable.mejico));
        restaurants.add(new Restaurant("Bavarian Bier Cafe",4.1,"German","Sydney CBD 2000","$$","Pepper & Garlic Kielbasa ($20)",R.drawable.bavarian));
        restaurants.add(new Restaurant("Blue Ocean Restaurant",4.8,"Chinese","Revesby 2212","$$","Wagyu Cubes with Wasabi Sauce ($20.80)",R.drawable.blueocean));
        restaurants.add(new Restaurant("La Favola",4.1,"Italian","Newtown 2042","$$","Carpaccio ($22)",R.drawable.favola));
        restaurants.add(new Restaurant("El Jannah",3.8,"Lebanese","Punchbowl 2196","$","Shawarma Plate ($15.90)",R.drawable.eljannah));
        restaurants.add(new Restaurant("Kasundi Indian Restaurant", 4,"Indian","Bexley North 2207","$","Paneer Sizzler Tikka ($13.99)",R.drawable.kasundi));
        restaurants.add(new Restaurant("Cirrus Dining",4.7,"Seafood","Barangaroo 2000","$$$","Grilled WA Marron ($42)",R.drawable.cirrus));
        return restaurants;
    }

}
