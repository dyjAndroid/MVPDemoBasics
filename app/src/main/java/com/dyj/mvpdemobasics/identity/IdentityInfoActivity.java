package com.dyj.mvpdemobasics.identity;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dyj.mvpdemobasics.R;
import com.dyj.mvpdemobasics.data.DataRepository;

public class IdentityInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IdentityInfoFragment fragment = new IdentityInfoFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.info_fragment,fragment).commit();
       new IdentityInfoPresenter(fragment,new DataRepository());
    }
}
