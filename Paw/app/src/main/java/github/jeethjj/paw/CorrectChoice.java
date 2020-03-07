package github.jeethjj.paw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

public class CorrectChoice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correct_choice);

        DisplayMetrics displayMatrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMatrics);

        int width = displayMatrics.widthPixels;
        int height = displayMatrics.heightPixels;

        getWindow().setLayout((int)(width*0.8),(int)(height*0.8));
        overridePendingTransition(R.anim.fade_out,R.anim.fade_in);


        final Button identifyTheBreed = findViewById(R.id.correct_next);
        identifyTheBreed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
