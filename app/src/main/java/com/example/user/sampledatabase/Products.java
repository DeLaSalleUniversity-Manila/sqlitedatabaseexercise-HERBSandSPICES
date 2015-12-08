package com.example.user.sampledatabase;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.sampledatabase.R;

public class Products extends Activity
{
    public static final String EXTRA_PROD = "prodNo";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);

        int prodNo = (Integer)getIntent().getExtras().get(EXTRA_PROD);
        Product prod = Product.product[prodNo];

        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(prod.getImageResourceId());
        photo.setContentDescription(prod.getName());

        TextView name = (TextView)findViewById(R.id.name);
        name.setText(prod.getName());

        TextView description = (TextView)findViewById(R.id.description);
        description.setText(prod.getDescription());
    }
}
