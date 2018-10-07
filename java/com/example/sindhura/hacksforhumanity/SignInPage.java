package com.example.sindhura.hacksforhumanity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignInPage extends AppCompatActivity {

    private Button goToInterests;
    private Button goToHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_page);

        goToInterests = (Button)findViewById(R.id.signup);

        goToInterests.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                openInterests();
            }
        });

        goToHome = (Button)findViewById(R.id.homepage);

        goToHome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                openHome();
            }
        });
    }

    public void openInterests()
    {
        Intent openInterests = new Intent(this, Interests.class);
        startActivity(openInterests);
    }

    public void openHome()
    {
        Intent openHome = new Intent(this, HomePage.class);
        startActivity(openHome);
    }
}
