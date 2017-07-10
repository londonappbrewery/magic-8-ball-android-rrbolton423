package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay = (ImageView) findViewById(R.id.image_eightBall); // Grab the ballDisplay from the xml by the id

        final int[] ballArray = { // The ballArray holds the 5 ball drawables
                R.drawable.ball1, // ball1 sits at index 0
                R.drawable.ball2, // ball2 sits at index 1
                R.drawable.ball3, // ball3 sits at index 2
                R.drawable.ball4, // ball4 sits at index 3
                R.drawable.ball5, // ball5 sits at index 4
        };

        Button myButton = (Button) findViewById(R.id.askButton); // Grab the myButton from the xml by the id

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // Set onClickListener for myButton
                Random randomNumberGenerator = new Random(); // Create a randomNumberGenerator object

                int number = randomNumberGenerator.nextInt(5); // Create a variable that stores a random number between 0 and 4

                ballDisplay.setImageResource(ballArray[number]); // Set the image of the ballDisplay to a random number in the ballArray
            }
        });

    }
}
