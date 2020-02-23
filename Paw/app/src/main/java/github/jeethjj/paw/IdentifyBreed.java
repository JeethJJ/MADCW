package github.jeethjj.paw;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Random;

public class IdentifyBreed extends AppCompatActivity {
    public int afghan_hound[] = {R.drawable.afg1,R.drawable.afg2,R.drawable.afg3,R.drawable.afg4,R.drawable.afg5,R.drawable.afg6,R.drawable.afg7,R.drawable.afg8,R.drawable.afg9,R.drawable.afg10};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.identify_breed);
        Random rand = new Random();
        ImageView v1 = findViewById(R.id.identify_breed_image_view);
        v1.setImageResource(afghan_hound[rand.nextInt(10)]);       //selecting random image from the arrays

        ArrayAdapter<CharSequence> names = ArrayAdapter.createFromResource(this, R.array.breed_names, android.R.layout.simple_spinner_item);
        names.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);      //setting the data to dropdown
        final Spinner spinner = findViewById(R.id.selected_breed);  //select the spinner
        if (spinner != null) {
            spinner.setAdapter(names);   //adding names array to the spinner
        }




        final Button identifyTheBreed = findViewById(R.id.submit_breed);
        identifyTheBreed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//                    @Override
//                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                        String spinnerLabel = parent.getItemAtPosition(position).toString();
//                        Toast.makeText(getApplicationContext(), spinnerLabel, Toast.LENGTH_SHORT).show();                //showing a toast message
//                    }
//
//                    @Override
//                    public void onNothingSelected(AdapterView<?> parent) {
//                        Toast.makeText(getApplicationContext(), "Please select the breed", Toast.LENGTH_SHORT).show();                //showing a toast message
//                    }
//                });
                identifyTheBreed.setText("Next");
                String text = spinner.getSelectedItem().toString(); //get the selected item as text
                if(text==null){
                    Toast.makeText(getApplicationContext(), "Please select the breed", Toast.LENGTH_SHORT).show();  //showing a toast message
                }else{
                    Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();  //showing a toast message
                }


                startActivity(new Intent(IdentifyBreed.this,correct_choice.class));
                overridePendingTransition(R.anim.fade_out,R.anim.fade_in);

                identifyTheBreed.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(IdentifyBreed.this, IdentifyBreed.class);
                        startActivity(intent);
                    }
                });

            }
        });

    }
}
