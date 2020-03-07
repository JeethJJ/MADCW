package github.jeethjj.paw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class WrongChoiceImage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrong_choice_image);
        Intent intent = getIntent();
//        Bitmap bitmap = intent.getParcelableExtra("BitmapImage");
        final int path = intent.getIntExtra("imageRef", 0);
        ImageView iv = findViewById(R.id.correct_image);
        //iv.setImageBitmap(BitmapFactory.decodeFile(path));
        iv.setImageDrawable(getResources().getDrawable(path));

        DisplayMetrics displayMatrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMatrics);

        int width = displayMatrics.widthPixels;
        int height = displayMatrics.heightPixels;

        getWindow().setLayout((int)(width*0.8),(int)(height*0.8));                  //setting the display to 80 %
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
