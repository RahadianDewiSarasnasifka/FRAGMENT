package com.example.fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    Button btnFirstFragment, btnSecondFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFirstFragment = (Button) findViewById(R.id.firstFragment);
        btnSecondFragment = (Button) findViewById(R.id.secondFragment);
        btnFirstFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Load First Fragment
                loadFragment(new FirstFragment());
            }
        });
        btnSecondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // load First Fragment
                loadFragment(new SecondFragment());
            }
        });
    }

    private void loadFragment (android.app.Fragment fragment) {
        //create a FragmentManager
        FragmentManager fm = getFragmentManager();
        //create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        //replace the Framelayout with new Fragment
        fragmentTransaction.replace(R.id.framelayout, fragment);
        fragmentTransaction.commit(); //save the changes
    }
}