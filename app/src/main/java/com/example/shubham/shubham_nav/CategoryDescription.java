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
        Notebooks,Calculator,Pen,Art,Keychains,Desk,Marker,Files,Printer,Learning,Remote,Cricket,Tennis,Hockey,Football,Badminton,Board,Table,
        Skating,Swimming,Volley,Basketball,Boxing ;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_description);


//
//        fragmentTransaction = getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.add(R.id.category_frame,new ElectronicFragment());
//        fragmentTransaction.commit();



        // Receive data
        Intent intent = getIntent();

        String category = intent.getExtras().getString("category");
        String arr[] = category.split(" ",2);
        category = arr[0];
        Toast.makeText(this,"Category chosen is "+category,Toast.LENGTH_LONG).show();



        Category input = Category.valueOf(category);

        switch (input){
            case Notebooks :
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.category_frame,new ElectronicFragment());
                fragmentTransaction.commit();
                break;
            case Pen:
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.category_frame,new ElectronicFragment());
                fragmentTransaction.commit();
                    break;
            case Calculator:
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.category_frame,new ElectronicFragment());
                fragmentTransaction.commit();
                break;
            case Art:
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.category_frame,new ElectronicFragment());
                fragmentTransaction.commit();
                    break;
            case Keychains:
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.category_frame,new ElectronicFragment());
                fragmentTransaction.commit();
                break;
            case Desk:
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.category_frame,new ElectronicFragment());
                fragmentTransaction.commit();
                break;
            case Marker:
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.category_frame,new ElectronicFragment());
                fragmentTransaction.commit();
                break;
            case Files:
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.category_frame,new ElectronicFragment());
                fragmentTransaction.commit();
                    break;
            case Printer:
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.category_frame,new ElectronicFragment());
                fragmentTransaction.commit();
                break;
            case Learning:
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.category_frame,new ElectronicFragment());
                fragmentTransaction.commit();
                break;
            case Remote:
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.category_frame,new ElectronicFragment());
                fragmentTransaction.commit();
                break;
            case Cricket:
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.category_frame,new ElectronicFragment());
                fragmentTransaction.commit();
                break;
            case Tennis:
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.category_frame,new ElectronicFragment());
                fragmentTransaction.commit();
                break;
            case Hockey:
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.category_frame,new ElectronicFragment());
                fragmentTransaction.commit();
                break;
            case Football:
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.category_frame,new ElectronicFragment());
                fragmentTransaction.commit();
                break;
            case Badminton:
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.category_frame,new ElectronicFragment());
                fragmentTransaction.commit();
                break;
            case Board:
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.category_frame,new ElectronicFragment());
                fragmentTransaction.commit();
                break;
            case Table:
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.category_frame,new ElectronicFragment());
                fragmentTransaction.commit();
                break;
            case Skating:
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.category_frame,new ElectronicFragment());
                fragmentTransaction.commit();
                break;
            case Swimming:
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.category_frame,new ElectronicFragment());
                fragmentTransaction.commit();
                break;
            case Volley:
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.category_frame,new ElectronicFragment());
                fragmentTransaction.commit();
                break;
            case Basketball:
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.category_frame,new ElectronicFragment());
                fragmentTransaction.commit();
                break;
            case Boxing:
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.category_frame,new ElectronicFragment());
                fragmentTransaction.commit();
                break;
            default:
                    break;
        }








    }
}
