package notepad.app.presentation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import notepad.app.R;

public class MainActivity extends AppCompatActivity {
    AppCompatButton logInBtn;
    AppCompatButton skipBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logInBtn=findViewById(R.id.loginBtn);
        skipBtn=findViewById(R.id.skipBtn);
        logInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //login button stuff
            }
        });
        skipBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,NotesMenu.class);
                myIntent.putExtra("TeamName", "local");
              //  System.out.println("click");
                MainActivity.this.startActivity(myIntent);
            }
        });
    }
}