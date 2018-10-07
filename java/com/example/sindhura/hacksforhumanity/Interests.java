package com.example.sindhura.hacksforhumanity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Interests extends AppCompatActivity
{
   private Button goToMainPage;

   //boolean variables for determining if buttons are to be accessable under my communities
   private boolean adultSelect, selfcareSelect, academicsSelect, friendSelect, familySelect, relationsSelect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interests);


        findViewById(R.id.adultCheck).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                adultSelect = true;
            }
        });

        findViewById(R.id.friendCheck).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                friendSelect = true;
            }
        });

        findViewById(R.id.selfCheck).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                selfcareSelect = true;
            }
        });

        findViewById(R.id.academicCheck).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                academicsSelect = true;
            }
        });

        findViewById(R.id.relationshipCheck).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                relationsSelect = true;
            }
        });

        findViewById(R.id.familyCheck).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                familySelect = true;
            }
        });


        goToMainPage = (Button)findViewById(R.id.ready);
        goToMainPage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                openMainPage();
            }
        });
    }

   public void openMainPage()
   {
        Intent openHome = new Intent(this, HomePage.class);

        if(adultSelect == true)
            openHome.putExtra("adultSelect", true);
        else
            openHome.putExtra("adultSelect", false);

        if(friendSelect == true)
            openHome.putExtra("friendSelect", true);
        else
            openHome.putExtra("friendSelect", false);

       if(selfcareSelect == true)
           openHome.putExtra("selfcareSelect", true);
       else
           openHome.putExtra("selfcareSelect", false);

       if(academicsSelect == true)
           openHome.putExtra("academicSelect", true);
       else
           openHome.putExtra("academicSelect", false);

       if(relationsSelect == true)
           openHome.putExtra("relationsSelect", true);
       else
           openHome.putExtra("relationsSelect", false);

       if(familySelect == true)
           openHome.putExtra("familySelect", true);
       else
           openHome.putExtra("familySelect", false);

        startActivity(openHome);
    }

}
