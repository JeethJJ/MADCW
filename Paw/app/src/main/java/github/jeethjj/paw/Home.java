package github.jeethjj.paw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button identifyTheBreed = findViewById(R.id.identify_breed);
        identifyTheBreed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, IdentifyBreed.class);
                startActivity(intent);
            }
        });


    }

//    public void openIdentifyBreed(View view) {
//        Intent intent = new Intent(Home.this, IdentifyBreed.class);
//        startActivity(intent);
//    }
}
