package shakeel.khursand.autismo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutAutism extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_autism);

        setButtonListener(R.id.button14);
        setButtonListener(R.id.button15);
        setButtonListener(R.id.button16);
    }

    private void setButtonListener(final int id) {
        Button button = (Button) findViewById(id);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                switch (id){
                    case R.id.button14:{
                        Intent intent = new  Intent(AboutAutism.this, AutismAndLearning.class);
                        startActivity(intent);
                        break;
                    }
                    case R.id.button15:{
                        Intent intent = new  Intent(AboutAutism.this, WhatIsAutism.class);
                        startActivity(intent);
                        break;
                    }
                    case R.id.button16:{
                        Intent intent = new  Intent(AboutAutism.this, AutismAndMusic.class);
                        startActivity(intent);
                        break;
                    }
                }
            }
        });
    }
}
