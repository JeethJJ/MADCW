package github.jeethjj.paw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class SlideShow extends AppCompatActivity {

    public int dogs[] = {
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
    ViewFlipper vf;
    EditText breedName;
    Button submit;
    int images_to_view[]= new int[10];
    int orientationChangeCheck;

    int images;
    int stopFlip=0;

    @Override
    protected void onSaveInstanceState(Bundle outState) {    // save the instance for orientation changes
        super.onSaveInstanceState(outState);
        outState.putInt("stopFlip",stopFlip);
        outState.putInt("images",images);
        outState.putInt("orientation",orientationChangeCheck);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slide_show);
        vf=findViewById(R.id.slideshow_image);
        breedName = findViewById(R.id.breed_name);
        submit=findViewById(R.id.breed_submit);
        if(savedInstanceState!= null){  // is the orientation is changed it should start from where it stopped
            this.images = savedInstanceState.getInt("images");
            this.stopFlip = savedInstanceState.getInt("stopFlip");
            this.orientationChangeCheck = savedInstanceState.getInt("orientation");
            if(stopFlip!=1) {
                if(orientationChangeCheck==1) {
                    submit.setEnabled(false);
                    breedName.setEnabled(false);
                    Log.i("name", "r");


                    int img = images;
                    for(int i=0;i<10;i++,img++){
                        images_to_view[i] = dogs[img];
                        Log.i("name", String.valueOf(i));
                        Log.i("name", String.valueOf(img));
                    }

                    for (int imageToView : images_to_view) {
                        Log.i("image", String.valueOf(imageToView));
                        flipImage(imageToView);
                    }
                }
            }
        }

    }

    private void flipImage(int image){    // each image will be flipped five seconds, and all images Will be looped through until the stop button is clicked
        ImageView iv = new ImageView(this);
        iv.setImageResource(image);

        vf.addView(iv);
        vf.startFlipping();
        vf.setFlipInterval(5000);
        vf.setAutoStart(true);

        vf.setInAnimation(this,R.anim.fade_out);
        vf.setOutAnimation(this,R.anim.fade_in);
    }

    private int getBreed(String breed){   // this will return the starting index of the breed that the user is searching for
        int numStart = -1;

        if(breed.equals("afghan hound")){
            numStart=0;
        }else if (breed.equals("briard")){
            numStart=10;
        }else if(breed.equals("bull mastiff")){
            numStart=20;
        }else if(breed.equals("chow")){
            numStart=30;
        }else if(breed.equals("collie")){
            numStart=40;
        }else if(breed.equals("eskimo")){
            numStart=50;
        }else if(breed.equals("french bulldog")){
            numStart=60;
        }else if(breed.equals("goldern retriever")){
            numStart=70;
        }else if(breed.equals("german shepherd")){
            numStart=80;
        }else if(breed.equals("japanese spaniel")){
            numStart=90;
        }else if(breed.equals("komondor")){
            numStart=100;
        }else if(breed.equals("labrador retriever")){
            numStart=110;
        }else if(breed.equals("malamute")){
            numStart=120;
        }else if(breed.equals("malinois")){
            numStart=130;
        }else if(breed.equals("norwegian elkhound")){
            numStart=140;
        }else if(breed.equals("papillon")){
            numStart=150;
        }else if(breed.equals("pembroke")){
            numStart=160;
        }else if(breed.equals("pomeranian")){
            numStart=170;
        }else if(breed.equals("pug")){
            numStart=180;
        }else if(breed.equals("samoyed")){
            numStart=190;
        }else if(breed.equals("siberian husky")){
            numStart=200;
        }else if(breed.equals("shetland sheepdog")){
            numStart=210;
        }else if(breed.equals("sussex spaniel")){
            numStart=220;
        }else if(breed.equals("white terrier")){
            numStart=230;
        }
        return numStart;
    }

    public void submitCLicked(View view) {  // when the submit button is clicked
        vf.setVisibility(View.VISIBLE);
        String name = breedName.getText().toString().toLowerCase();  // the users input text will be get
        Log.i("name",name);
        images=getBreed(name); // check with the breed that the user input is there
        if(images==-1){
            Toast.makeText(getApplicationContext(), "No such breed found !!!", Toast.LENGTH_SHORT).show();
            vf.setVisibility(View.INVISIBLE);
        }else{
            orientationChangeCheck=1;
            submit.setEnabled(false);
            breedName.setEnabled(false);
            Log.i("name","r");

            int img = images;
            for(int i=0;i<10;i++,img++){
                images_to_view[i] = dogs[img];
                Log.i("name", String.valueOf(i));
                Log.i("name", String.valueOf(img));
            }
//            images=images-10;   //to make into the correct position again
            for(int imageToView : images_to_view){
                Log.i("image", String.valueOf(imageToView));
                flipImage(imageToView);
            }
        }
    }

    public void stopClick(View view) {     // when the stop button is clicked, the image flipping will be stopped
        vf.stopFlipping();
        stopFlip=1;
        Intent intent = new Intent(SlideShow.this, SlideShow.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {    // the android back button is blocked, and the only way back is through the parent element back button
        Toast.makeText(getApplicationContext(), "Click the back button on top left to EXIT!!", Toast.LENGTH_SHORT).show();
    }
}
