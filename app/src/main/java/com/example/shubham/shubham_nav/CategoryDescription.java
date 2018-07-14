package com.example.shubham.shubham_nav;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CategoryDescription extends AppCompatActivity {

    private TextView category_name,desc;
    private ImageView image;
    FragmentTransaction fragmentTransaction;

    private enum Category{
        Electronics,Toys,Gifts,Stationery,Printing,Mpc,Mobiles,Bakery,GeneralStore;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_description);



        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.category_frame,new ElectronicFragment());
        fragmentTransaction.commit();



        // Receive data
        Intent intent = getIntent();

        String category = intent.getExtras().getString("category");
        Toast.makeText(this,"Category chosen is "+category,Toast.LENGTH_LONG).show();

        Category input = Category.valueOf(category);

        switch (input){
            case Mpc:
                    break;
            case Toys:
                    break;
            case Gifts:
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.category_frame,new GiftsFragment());
                fragmentTransaction.commit();
                    break;
            case Bakery:
                    break;
            case Mobiles:
                    break;
            case Printing:
                    break;
            case Stationery:
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.category_frame,new StationeryFragment());
                fragmentTransaction.commit();
                    break;
            case Electronics:
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.category_frame,new ElectronicFragment());
                fragmentTransaction.commit();
                    break;
            case GeneralStore:
                    break;
            default:
                    break;
        }








    }
}
