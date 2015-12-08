package com.example.user.sampledatabase;

import com.example.user.sampledatabase.R;


public class Product {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Product[] product = {
            new Product("Mac Book", "With the new MacBook, we set out to do the impossible: engineer a full-size experience into the lightest and most compact Mac notebook ever. That meant reimagining every element to make it not only lighter and thinner but also better. The result is more than just a new notebook. It’s the future of the notebook.", R.drawable.a),
            new Product("Mac Book Pro", "Now with the Force Touch Trackpad, longer battery life, and faster flash storage", R.drawable.b),
            new Product("Mac Book Air", "The 11-inch MacBook Air lasts up to nine hours between charges and the 13-inch model lasts up to an incredible 12 hours. So from your morning coffee till your evening commute, you can work unplugged. When it’s time to kick back and relax, you can get up to 10 hours of iTunes movie playback on the 11-inch model and up to 12 hours on the 13-inch model. And with up to 30 days of standby time, you can go away for weeks and pick up right where you left off.", R.drawable.c)
    };

    private Product(String name, String description, int imageResourceId)
    {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription()
    {
        return description;
    }

    public String getName()
    {
        return name;
    }

    public int getImageResourceId()
    {
        return imageResourceId;
    }

    public String toString()
    {
        return this.name;
    }
}
