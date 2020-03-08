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
    boolean switchOn=false;    //to check whether the timer is on or not


    @Override
    protected void onSaveInstanceState(Bundle outState) {      //on orientation change, save the switch on status
        super.onSaveInstanceState(outState);
        outState.putBoolean("switchOn",switchOn);    // to save one orientation change
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
            this.switchOn=savedInstanceState.getBoolean("switchOn");    //on orientation change, set the previous instance
        }

        // on click of every button it should go to the corresponding activity
        Button identifyTheBreed = findViewById(R.id.identify_breed);
        identifyTheBreed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, IdentifyBreed.class);
                intent.putExtra("switchBool", switchOn); // the status of the timer is pass through an extra, whether it is on or not
                startActivity(intent);
            }
        });
        Button identifyTheDog = findViewById(R.id.identify_dog);
        identifyTheDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, IdentifyDog.class);
                intent.putExtra("switchBool", switchOn);  // the status of the timer is pass through an extra, whether it is on or not
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

        switchButton=findViewById(R.id.timer_switch);     // to check whether the toggle button is on
        switchButton.setChecked(switchOn);
        switchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean on) {     // if the doggie button is switched on this meeting will be called and the status will be safe to the boolean variable
                switchOn=on;
            }
        });
    }
}
