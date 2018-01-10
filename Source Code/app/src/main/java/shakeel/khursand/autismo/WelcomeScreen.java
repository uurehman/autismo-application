package shakeel.khursand.autismo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class WelcomeScreen extends AppCompatActivity {
    public static Child child;
    public static final String DEBUGTAG = "AUT";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_screen);

        setButtonListener();
    }

    private void setButtonListener() {
        Button button = (Button) findViewById(R.id.button17);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d(DEBUGTAG, "1");
                EditText editText = (EditText) findViewById(R.id.editText2);
                String name = editText.getText().toString();
                Log.d(DEBUGTAG, "2");
                EditText editText1 = (EditText) findViewById(R.id.editText5);
                String ageString = editText1.getText().toString();

                Log.d(DEBUGTAG, "3");
                if (name.equals("") || ageString.equals("")){
                    Toast.makeText(WelcomeScreen.this, "Please fill all the details.", Toast.LENGTH_SHORT).show();
                    Log.d(DEBUGTAG, "9");
                }
                else if (Integer.parseInt(ageString) == 0){
                    Toast.makeText(WelcomeScreen.this, "Please enter a valid age.", Toast.LENGTH_SHORT).show();
                }
                else{
                    int age = Integer.parseInt(ageString);
                    Log.d(DEBUGTAG, "4");
                    Log.d(DEBUGTAG, "5");
                    Log.d(DEBUGTAG, "6");
                    child = new Child(name, age);
                    Log.d(DEBUGTAG, "7");
                    Intent intent = new Intent(WelcomeScreen.this, HomeScreen.class);
                    Log.d(DEBUGTAG, "8");
                    startActivity(intent);
                }

            }
        });
    }
}
