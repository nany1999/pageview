package com.example.pageview;

import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager view=findViewById(R.id.pageview);
        ArrayList<View> view_list=new ArrayList<View>();
        LayoutInflater li=getLayoutInflater();
        view_list.add(li.inflate(R.layout.view_1,null,false));
        view_list.add(li.inflate(R.layout.view_2,null,false));
        view_list.add(li.inflate(R.layout.view_3,null,false));
        MsPagerAdapter msPageAdapter= new MsPagerAdapter(view_list) ;

        view.setAdapter(msPageAdapter);

    }

}
