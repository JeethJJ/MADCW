package github.jeethjj.paw;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    private static final int REDIRECT_TIME = 2000;  // this activity will be shown only for two seconds end it will be redirected automatically to the homepage

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {  //to redirect to home page from main activity in 5s
                Intent intend = new Intent(MainActivity.this, Home.class);
                startActivity(intend);
                overridePendingTransition(R.anim.fade_out,R.anim.fade_in);
                finish();

            }
        }, REDIRECT_TIME);
    }
}
