package github.jeethjj.paw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

public class Home extends AppCompatActivity {
    Switch switchButton;
    boolean switchOn=false;


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean("switchOn",switchOn);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        IdentifyBreed.marks=0;
        IdentifyBreed.questions=0;
        IdentifyDog.marks=0;
        IdentifyDog.questions=0;
        if(savedInstanceState!= null){
            this.switchOn=savedInstanceState.getBoolean("switchOn");
        }

        Button identifyTheBreed = findViewById(R.id.identify_breed);
        identifyTheBreed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, IdentifyBreed.class);
                intent.putExtra("switchBool", switchOn);
                startActivity(intent);
            }
        });
        Button identifyTheDog = findViewById(R.id.identify_dog);
        identifyTheDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, IdentifyDog.class);
                intent.putExtra("switchBool", switchOn);
                startActivity(intent);
            }
        });
        Button slideShow = findViewById(R.id.search_breed);
        slideShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, SlideShow.class);
                startActivity(intent);
            }
        });

        switchButton=findViewById(R.id.timer_switch);
        switchButton.setChecked(switchOn);
        switchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean on) {
                switchOn=on;
            }
        });
    }
}
