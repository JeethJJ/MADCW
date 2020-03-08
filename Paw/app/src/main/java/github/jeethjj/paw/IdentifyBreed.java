package github.jeethjj.paw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Random;

public class IdentifyBreed extends AppCompatActivity {
    public static final ArrayList<Integer> randInts = new ArrayList<>();  // this area is used to at all the random numbers, so they won't be reused again
    public static final String EXTRA_MESSAGE = null;  // to pass a message as an extra
    public static int marks=0;  // this is a static variable so the marks of each game will be stored
    public static int questions=0;  // this is to keep track of the number of questions the user is attempting
    public int dogs[] = {      // all the images are in this
            R.drawable.afg1,R.drawable.afg2,R.drawable.afg3,R.drawable.afg4,R.drawable.afg5,R.drawable.afg6,R.drawable.afg7,R.drawable.afg8,R.drawable.afg9,R.drawable.afg10,
            R.drawable.briard1,R.drawable.briard2,R.drawable.briard3,R.drawable.briard4,R.drawable.briard5,R.drawable.briard6,R.drawable.briard7,R.drawable.briard8,R.drawable.briard9,R.drawable.briard10,
            R.drawable.bull1,R.drawable.bull2,R.drawable.bull3,R.drawable.bull4,R.drawable.bull5,R.drawable.bull6,R.drawable.bull7,R.drawable.bull8,R.drawable.bull9,R.drawable.bull10,
            R.drawable.chow1,R.drawable.chow2,R.drawable.chow3,R.drawable.chow4,R.drawable.chow5,R.drawable.chow6,R.drawable.chow7,R.drawable.chow8,R.drawable.chow9,R.drawable.chow10,
            R.drawable.collie1,R.drawable.collie2,R.drawable.collie3,R.drawable.collie4,R.drawable.collie5,R.drawable.collie6,R.drawable.collie7,R.drawable.collie8,R.drawable.collie9,R.drawable.collie10,
            R.drawable.eskimo1,R.drawable.eskimo2,R.drawable.eskimo3,R.drawable.eskimo4,R.drawable.eskimo5,R.drawable.eskimo6,R.drawable.eskimo7,R.drawable.eskimo8,R.drawable.eskimo9,R.drawable.eskimo10,
            R.drawable.fbull1,R.drawable.fbull2,R.drawable.fbull3,R.drawable.fbull4,R.drawable.fbull5,R.drawable.fbull6,R.drawable.fbull7,R.drawable.fbull8,R.drawable.fbull9,R.drawable.fbull10,
            R.drawable.gr1,R.drawable.gr2,R.drawable.gr3,R.drawable.gr4,R.drawable.gr5,R.drawable.gr6,R.drawable.gr7,R.drawable.gr8,R.drawable.gr9,R.drawable.gr10,
            R.drawable.gs1,R.drawable.gs2,R.drawable.gs3,R.drawable.gs4,R.drawable.gs5,R.drawable.gs6,R.drawable.gs7,R.drawable.gs8,R.drawable.gs9,R.drawable.gs10,
            R.drawable.js1,R.drawable.js2,R.drawable.js3,R.drawable.js4,R.drawable.js5,R.drawable.js6,R.drawable.js7,R.drawable.js8,R.drawable.js9,R.drawable.js10,
            R.drawable.komondor1,R.drawable.komondor2,R.drawable.komondor3,R.drawable.komondor4,R.drawable.komondor5,R.drawable.komondor6,R.drawable.komondor7,R.drawable.komondor8,R.drawable.komondor9,R.drawable.komondor10,
            R.drawable.lr1,R.drawable.lr2,R.drawable.lr3,R.drawable.lr4,R.drawable.lr5,R.drawable.lr6,R.drawable.lr7,R.drawable.lr8,R.drawable.lr9,R.drawable.lr10,
            R.drawable.malamute1,R.drawable.malamute2,R.drawable.malamute3,R.drawable.malamute4,R.drawable.malamute5,R.drawable.malamute6,R.drawable.malamute7,R.drawable.malamute8,R.drawable.malamute9,R.drawable.malamute10,
            R.drawable.malinois1,R.drawable.malinois2,R.drawable.malinois3,R.drawable.malinois4,R.drawable.malinois5,R.drawable.malinois6,R.drawable.malinois7,R.drawable.malinois8,R.drawable.malinois9,R.drawable.malinois10,
            R.drawable.ne1,R.drawable.ne2,R.drawable.ne3,R.drawable.ne4,R.drawable.ne5,R.drawable.ne6,R.drawable.ne7,R.drawable.ne8,R.drawable.ne9,R.drawable.ne10,
            R.drawable.papillon1,R.drawable.papillon2,R.drawable.papillon3,R.drawable.papillon4,R.drawable.papillon5,R.drawable.papillon6,R.drawable.papillon7,R.drawable.papillon8,R.drawable.papillon9,R.drawable.papillon10,
            R.drawable.pem1,R.drawable.pem2,R.drawable.pem3,R.drawable.pem4,R.drawable.pem5,R.drawable.pem6,R.drawable.pem7,R.drawable.pem8,R.drawable.pem9,R.drawable.pem10,
            R.drawable.pome1,R.drawable.pome2,R.drawable.pome3,R.drawable.pome4,R.drawable.pome5,R.drawable.pome6,R.drawable.pome7,R.drawable.pome8,R.drawable.pome9,R.drawable.pome10,
            R.drawable.pug1,R.drawable.pug2,R.drawable.pug3,R.drawable.pug4,R.drawable.pug5,R.drawable.pug6,R.drawable.pug7,R.drawable.pug8,R.drawable.pug9,R.drawable.pug10,
            R.drawable.sam1,R.drawable.sam2,R.drawable.sam3,R.drawable.sam4,R.drawable.sam5,R.drawable.sam6,R.drawable.sam7,R.drawable.sam8,R.drawable.sam9,R.drawable.sam10,
            R.drawable.sh1,R.drawable.sh2,R.drawable.sh3,R.drawable.sh4,R.drawable.sh5,R.drawable.sh6,R.drawable.sh7,R.drawable.sh8,R.drawable.sh9,R.drawable.sh10,
            R.drawable.ss1,R.drawable.ss2,R.drawable.ss3,R.drawable.ss4,R.drawable.ss5,R.drawable.ss6,R.drawable.ss7,R.drawable.ss8,R.drawable.ss9,R.drawable.ss10,
            R.drawable.susss1,R.drawable.susss2,R.drawable.susss3,R.drawable.susss4,R.drawable.susss5,R.drawable.susss6,R.drawable.susss7,R.drawable.susss8,R.drawable.susss9,R.drawable.susss10,
            R.drawable.west1,R.drawable.west2,R.drawable.west3,R.drawable.west4,R.drawable.west5,R.drawable.west6,R.drawable.west7,R.drawable.west8,R.drawable.west9,R.drawable.west10
    };
    Random rand = new Random();
    ProgressBar pb;
    CountDownTimer myCountDownTimer;
    ImageView v1;
    Spinner spinner;
    Button identifyTheBreed;
    int timerTime;
    int random;
    boolean clickedSubmit;
    String correctBreed;
    boolean finishedYet=false;
    boolean message;
    String grade;

    @Override
    protected void onSaveInstanceState(Bundle outState) {  // saving the state for orientation changes
        super.onSaveInstanceState(outState);
        outState.putInt("timerTime",timerTime);
        outState.putInt("randInt",random);
        outState.putBoolean("submitClicked",clickedSubmit);
        outState.putBoolean("finishedYet",finishedYet);
        outState.putBoolean("message",message);
        outState.putString("correctBreed",correctBreed);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.identify_breed);

        if(randInts.size()>238){  // there are totaling 240 images so the number of times that the user can attempt it's less than 240
            finish();
        }

//        questions=questions+1;
        message = getIntent().getExtras().getBoolean("switchBool");  // to check whether the timer is on or not

        clickedSubmit=false; // keep track of whether to submit button is clicked or not
        int x = rand.nextInt(240);  // each time we should generate a random number and it should not be the same number which was generated before
        while(randInts.contains(x)){  // using this while loop we check with other random number is already there and we generate a random number which is not there
            x=rand.nextInt(240);
        }

        random=x;
        randInts.add(random);  // adding the random number to the array
        timerTime=10000;
        if(savedInstanceState!= null){   //if the same instance is not null, so which means the activity is already created before, the activity will be following the previous instance
            this.random = savedInstanceState.getInt("randInt");
            this.timerTime = savedInstanceState.getInt("timerTime");
            this.clickedSubmit=savedInstanceState.getBoolean("submitClicked");
            this.message=savedInstanceState.getBoolean("message");
            this.finishedYet=savedInstanceState.getBoolean("finishedYet");
        }

        v1 = findViewById(R.id.identify_breed_image_view);
        identifyTheBreed = findViewById(R.id.submit_breed);
        pb = findViewById(R.id.progressBar);

        correctBreed = getBreed(random);
        v1.setImageResource(dogs[random]);       //selecting random image from the arrays
        ArrayAdapter<CharSequence> names = ArrayAdapter.createFromResource(this, R.array.breed_names, android.R.layout.simple_spinner_item);
        names.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);      //setting the data to dropdown
        spinner = findViewById(R.id.selected_breed);  //select the spinner
        if (spinner != null) {
            spinner.setAdapter(names);   //adding names array to the spinner
        }

        if(message){          // the timer should start only if the toggle button is on
            pb.setProgress(timerTime/100);
            myCountDownTimer = new MyCountDownTimer(timerTime, 1000);
            myCountDownTimer.start();
        }else{
            pb.setVisibility(View.INVISIBLE);
        }

        if(clickedSubmit) {  // if the user clicks the submit button once the submit text should change into next
            identifyTheBreed.setText("Next");
        }


    }

    private String getBreed(int num){   // this method will return the name of the Breed according to the Random number
        String breed;
        if(-1<num && num<10){
            breed="Afghan Hound";
        }else if(9<num && num<20){
            breed="Briard";
        }else if(19<num && num<30){
            breed="Bull Mastiff";
        }else if(29<num && num<40){
            breed="Chow";
        }else if(39<num && num<50){
            breed="Collie";
        }else if(49<num && num<60){
            breed="Eskimo";
        }else if(59<num && num<70){
            breed="French Bulldog";
        }else if(69<num && num<80){
            breed="Goldern Retriever";
        }else if(79<num && num<90){
            breed="German Shepherd";
        }else if(89<num && num<100){
            breed="Japanese Spaniel";
        }else if(99<num && num<110){
            breed="Komondor";
        }else if(109<num && num<120){
            breed="Labrador Retriever";
        }else if(119<num && num<130){
            breed="Malamute";
        }else if(129<num && num<140){
            breed="Malinois";
        }else if(139<num && num<150){
            breed="Norwegian Elkhound";
        }else if(149<num && num<160){
            breed="Papillon";
        }else if(159<num && num<170){
            breed="Pembroke";
        }else if(169<num && num<180){
            breed="Pomeranian";
        }else if(179<num && num<190){
            breed="Pug";
        }else if(189<num && num<200){
            breed="Samoyed";
        }else if(199<num && num<210){
            breed="Siberian Husky";
        }else if(209<num && num<220){
            breed="Shetland Sheepdog";
        }else if(219<num && num<230){
            breed="Sussex Spaniel";
        }else{
            breed="White Terrier";
        }
        return breed;
    }

    public void clickSubmit(View view) {
        if(message){      // if the timer is on and the submit button is clicked, the time I should stop
            pb.setProgress(0);
            myCountDownTimer.cancel();
            finishedYet=true;
        }
        if(!clickedSubmit) {      //did this to do the thing when orientation changes
            identifyTheBreed.setText("Next");
            String text = spinner.getSelectedItem().toString(); //get the selected item as text
            if(text.equals(correctBreed)) {  // if they use the selects the correct breed the correct activity will be started
                startActivity(new Intent(IdentifyBreed.this, CorrectChoice.class));
                marks=marks+1;
                questions=questions+1;
                Toast.makeText(getApplicationContext(), "Marks : "+marks+"/"+questions, Toast.LENGTH_SHORT).show();
            }else{  // if they use the selects the wrong answer, the wrong breed activity will be starting
                String message = "Correct answer :" + correctBreed;
                Intent intent= new Intent(IdentifyBreed.this, WrongChoice.class);
                intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
                questions=questions+1;
                Toast.makeText(getApplicationContext(), "Marks : "+marks+"/"+questions, Toast.LENGTH_SHORT).show();
            }
            overridePendingTransition(R.anim.fade_out, R.anim.fade_in);  // animation to the starting and ending of the correct and wrong activities
            clickedSubmit=true;
        }
        else{
            Intent intent = new Intent(IdentifyBreed.this, IdentifyBreed.class);  // if the same button is clicked again, which means the user wants to go to the next question
            intent.putExtra("switchBool", message);
            clickedSubmit=false;
            startActivity(intent);
        }
    }

    public class MyCountDownTimer extends CountDownTimer {      // this is the timer class which extends from countdown timer

        public MyCountDownTimer(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {     // I'm each tick, it takes is taken
            timerTime=timerTime-1000;
            pb.setProgress(timerTime/100);  // progress bar is set to the new value
        }

        @Override
        public void onFinish() {  // when the time is finished, answer whatever you say have selected should be evaluated
            pb.setProgress(0);
            timerTime=10000;

            if(!finishedYet){
                identifyTheBreed.setText("Next");
                String text = spinner.getSelectedItem().toString(); //get the selected item as text
                if (text.equals(correctBreed)) {
                    Intent intent = new Intent(IdentifyBreed.this, CorrectChoice.class);
                    startActivity(intent);
                    marks=marks+1;
                    questions=questions+1;
                    Toast.makeText(getApplicationContext(), "Marks : "+marks+"/"+questions, Toast.LENGTH_SHORT).show();  // each time when the user is submitting an answer, the score should be shown
                }else {
                    String message = "Correct answer :" + correctBreed;
                    Intent intent = new Intent(IdentifyBreed.this, WrongChoice.class);
                    intent.putExtra(EXTRA_MESSAGE, message);
                    startActivity(intent);
                    questions=questions+1;
                    Toast.makeText(getApplicationContext(), "Marks : "+marks+"/"+questions, Toast.LENGTH_SHORT).show();
                }
                overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
                clickedSubmit = true;
                finishedYet=false;
            }
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();     // when the timer didn't start also the ondistroy will be called but it is not initiated!! SO yeah , fix it
        if (message) {   // the timer should be destroyed when the activity is closed
            myCountDownTimer.cancel();
        }
    }

    @Override
    public void onBackPressed() { // the android back but it's blocked, Will display the following toast
        Toast.makeText(getApplicationContext(), "Click the back button on top left to EXIT!!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {  // when the use of clicks the back button to go to the parent element, it will check whether to use to have attempted any questions
        if (item.getItemId() == android.R.id.home && questions > 0) {  // if the user to have attempted any questions Marks and Number of stars Will be shown
                if (marks == 0) {                                     // if not it will go to the parent activity straightaway
                    grade = "Low score! Try harder!!";
                } else if (marks == questions) {
                    grade = "Great !!!";
                } else if (marks >= questions / 2) {
                    grade = "Good !!";
                } else if (marks <= questions / 2) {
                    grade = "Better luck next time !";
                }
                Intent intent = new Intent(IdentifyBreed.this, GameGrade.class);
                intent.putExtra("grade", grade);
                intent.putExtra("questions", questions);
                intent.putExtra("marks", marks);
                startActivity(intent);  // the great and the Score and the number of questions are sent to activity which displays the grade
                return true;
        }
        return super.onOptionsItemSelected(item);  // we are sending it to the super class, so it will go to the main page(parent class)
    }
}