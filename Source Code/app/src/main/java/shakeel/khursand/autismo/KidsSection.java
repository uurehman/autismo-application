package shakeel.khursand.autismo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KidsSection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kids_section);

        setButtonListener(R.id.button4);
        setButtonListener(R.id.button6);
        setButtonListener(R.id.button7);
    }

    private void setButtonListener(final int id) {
        Button button = (Button) findViewById(id);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                switch (id){
                    case R.id.button4:{
                        Intent intent = new Intent(KidsSection.this, GoodFriendImages.class);
                        startActivity(intent);
                        break;
                    }
                    case R.id.button5:{
                        break;
                    }
                    case R.id.button6:{
                        Intent intent = new Intent(KidsSection.this, EmotionImages.class);
                        startActivity(intent);
                        break;
                    }
                    case R.id.button7:{
                        Intent intent = new Intent(KidsSection.this, FoodImages.class);
                        startActivity(intent);
                        break;
                    }
                }

            }
        });
    }
}
