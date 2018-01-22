package shakeel.khursand.autismo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);

        setButtonListener(R.id.button);
        setButtonListener(R.id.button3);
    }

    private void setButtonListener(final int id) {
        Button button = (Button) findViewById(id);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                switch (id){
                    case R.id.button:{
                        Intent intent = new Intent(HomeScreen.this, KidsSection.class);
                        startActivity(intent);
                        break;
                    }
                    case R.id.button3:{
                        Intent intent = new Intent(HomeScreen.this, ParentsSection.class);
                        startActivity(intent);
                        break;
                    }

                }
            }
        });
    }
}
