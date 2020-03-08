package github.jeethjj.paw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class GameGrade extends AppCompatActivity {

    public int stars[] = {R.drawable.agrade,R.drawable.bgrade,R.drawable.cgrade};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_grade);

        Intent intent = getIntent();
        String message = intent.getStringExtra("grade");       //get the game grade from previous activity
        int marks = intent.getIntExtra("marks",0);  //get the game score from previous activity
        int questions = intent.getIntExtra("questions",0);  //get the attempted questions grade from previous activity
        TextView greeting = findViewById(R.id.greeting);
        TextView score = findViewById(R.id.score_view);
        greeting.setText(message);     //view the grade
        score.setText("Score : "+marks+" / "+questions);       //view the score

        ImageView star = findViewById(R.id.star);

        if(message.equals("Great !!!")){           //add the correct number of stars to the score
            star.setImageResource(stars[0]);
        }else if(message.equals("Good !!")){
            star.setImageResource(stars[1]);
        }else{
            star.setImageResource(stars[2]);
        }


    }

    public void clickOK(View view) {
        finish();
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "Click the back button on top left to go to main menu!!", Toast.LENGTH_SHORT).show();  //the back btn is blocked
    }


}
