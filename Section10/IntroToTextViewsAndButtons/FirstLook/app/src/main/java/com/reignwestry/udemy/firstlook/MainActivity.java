package com.reignwestry.udemy.firstlook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mButton;
    private TextView mTextView;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Attach id to variable
        mButton = (Button) findViewById(R.id.mButton);
        mTextView = (TextView) findViewById(R.id.mTextView);

        //change the title of the button
        mButton.setText(R.string.button_name);


        //NOTE: CUSTOM DEFAULT METHOD CALL onCreate
        HideTextView(mTextView);






    }


    //NOTE: CUSTOM DEFAULT METHOD onCreate
    public void HideTextView(View view){
        mTextView.setVisibility(View.INVISIBLE); //sets TextView to invisible
    }



    //Method called on button click
    public void ShowMe(View view){

        mTextView.setVisibility(View.VISIBLE); //Sets TextView to visible
        mTextView.setText(R.string.show_text); //changes TextView to Show Name


    }
}