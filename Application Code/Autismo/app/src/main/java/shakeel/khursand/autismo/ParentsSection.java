package shakeel.khursand.autismo;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ParentsSection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parents_section);

        setButtonListener(R.id.button8);
        setButtonListener(R.id.button10);
    }

    private void setButtonListener(final int id) {
        Button button = (Button) findViewById(id);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (id){
                    case R.id.button8:{
                        Intent intent = new Intent(ParentsSection.this, AboutAutism.class);
                        startActivity(intent);
                        break;
                    }
                    case R.id.button9:{ //Dialog

                        break;
                    }
                    case R.id.button10:{
                        AlertDialog.Builder builder = new AlertDialog.Builder(ParentsSection.this);
                        builder.setMessage("Name: "+WelcomeScreen.child.getName()+"\n\nAge: "+
                        WelcomeScreen.child.getAge())
                                .setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        dialogInterface.cancel();
                                    }
                                });
                        AlertDialog alert = builder.create();
                        alert.show();
                        break;
                    }
                    case R.id.button11:{ //Not implemented yet
                        break;
                    }
                    case R.id.button12:{ //Not implemented yet
                        break;
                    }
                    case R.id.button13:{ //Not implemented yet
                        break;
                    }

                }
            }
        });
    }
}
