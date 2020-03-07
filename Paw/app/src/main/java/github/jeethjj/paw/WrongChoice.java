package github.jeethjj.paw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WrongChoice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrong_choice);

        Intent intent = getIntent();
        String message = intent.getStringExtra(IdentifyBreed.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.correct_answer_disp);
        textView.setText(message);

        DisplayMetrics displayMatrics = new DisplayMetrics();      //hetting details of current display
        getWindowManager().getDefaultDisplay().getMetrics(displayMatrics);

        int width = displayMatrics.widthPixels;
        int height = displayMatrics.heightPixels;

        getWindow().setLayout((int)(width*0.8),(int)(height*0.8));        //setting the display to 80%
        overridePendingTransition(R.anim.fade_out,R.anim.fade_in);


        final Button identifyTheBreed = findViewById(R.id.wrong_next);
        identifyTheBreed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
