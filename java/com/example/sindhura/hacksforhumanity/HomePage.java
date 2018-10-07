package com.example.sindhura.hacksforhumanity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        Button adult = (Button)findViewById(R.id.adulting);
        Button self = (Button)findViewById(R.id.selfcare);
        Button academic = (Button)findViewById(R.id.academics);
        Button friend = (Button)findViewById(R.id.friendship);
        Button family = (Button)findViewById(R.id.family);
        Button relation = (Button)findViewById(R.id.relation);



        Intent getInfo = new Intent();
        boolean adultSelect = getInfo.getBooleanExtra("adultSelect", false);
        boolean friendSelect = getInfo.getBooleanExtra("friendSelect", false);
        boolean selfcareSelect = getInfo.getBooleanExtra("selfcareSelect", false);
        boolean academicSelect = getInfo.getBooleanExtra("academicSelect", false);
        boolean relationsSelect = getInfo.getBooleanExtra("relationsSelect", false);
        boolean familySelect = getInfo.getBooleanExtra("familySelect", false);

        if(adultSelect)
        {
            adult.setVisibility(View.VISIBLE);
        }
        if(selfcareSelect)
        {
            self.setVisibility(View.VISIBLE);
        }
        if(friendSelect)
        {
            friend.setVisibility(View.VISIBLE);
        }
        if(academicSelect)
        {
            academic.setVisibility(View.VISIBLE);
        }
        if(familySelect)
        {
            family.setVisibility(View.VISIBLE);
        }
        if(relationsSelect)
        {
            relation.setVisibility(View.VISIBLE);
        }
    }
}
