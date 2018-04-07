package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }

    /**
     * This method called when the result button is clicked.
     **/
    public void submit(View view) {
        int score = 0;
        EditText nameField = (EditText) findViewById( R.id.name_field );
        String name = nameField.getText().toString();
        if (name.equalsIgnoreCase( "" )) {
            Toast.makeText( this, R.string.name, Toast.LENGTH_SHORT ).show();
            return;
        }

        EditText firstQuestion = findViewById( R.id.answer_first_b );
        String first_b = firstQuestion.getText().toString();

        RadioButton secondQuestion = findViewById( R.id.answer_second_b );

        RadioButton thirdQuestion = findViewById( R.id.answer_third_a );

        CheckBox fourthQuestionA = findViewById( R.id.answer_fourth_a );

        CheckBox fourthQuestionB = findViewById( R.id.answer_fourth_b );

        CheckBox fourthQuestionC = findViewById( R.id.answer_fourth_c );

        CheckBox fourthQuestionD = findViewById( R.id.answer_fourth_d );

        RadioButton fifthQuestion = findViewById( R.id.answer_fifth_b );

        RadioButton sixthQuestion = findViewById( R.id.answer_sixth_a );

        RadioButton seventhQuestion = findViewById( R.id.answer_seventh_b );

        RadioButton eightQuestion = findViewById( R.id.answer_eight_b );

        RadioButton ninthQuestion = findViewById( R.id.answer_ninth_a );

        CheckBox tenthQuestionA = findViewById( R.id.answer_tenth_a );

        CheckBox tenthQuestionB = findViewById( R.id.answer_tenth_b );

        CheckBox tenthQuestionC = findViewById( R.id.answer_tenth_c );

        CheckBox tenthQuestionD = findViewById( R.id.answer_tenth_d );

        if (first_b.equalsIgnoreCase( "Benjamin" ))

        {
            score = score + 1;
        }

        if (secondQuestion.isChecked())

        {
            score = score + 1;
        }

        if (thirdQuestion.isChecked())

        {
            score = score + 1;
        }

        if (!fourthQuestionA.isChecked() && !fourthQuestionC.isChecked() && fourthQuestionB.isChecked() && fourthQuestionD.isChecked())

        {
            score = score + 1;
        }


        if (fifthQuestion.isChecked())

        {
            score = score + 1;
        }

        if (sixthQuestion.isChecked())

        {
            score = score + 1;
        }

        if (seventhQuestion.isChecked())

        {
            score = score + 1;
        }

        if (eightQuestion.isChecked())

        {
            score = score + 1;
        }

        if (ninthQuestion.isChecked())

        {
            score = score + 1;
        }

        if (!tenthQuestionA.isChecked() && !tenthQuestionC.isChecked() && tenthQuestionB.isChecked() && tenthQuestionD.isChecked())

        {
            score = score + 1;
        }


        String resultMessage = displayScore( name, score );

        TextView scoreSummary = (TextView) findViewById( R.id.display_score );
        scoreSummary.setText( resultMessage );

    }

    /**
     * This method displays different score message depending on the score range
     **/

    public String displayScore(String name, int score) {

        Toast.makeText( this, score + getString( R.string.points ), Toast.LENGTH_SHORT ).show();

        String resultMessage;

        if (score <= 3) {
            resultMessage = "Dear " + name + ", you have scored " + score + " points." +
                    " You need more practice if you want to be an Avenger";
        } else if ((score >= 4) && (score < 8)) {
            resultMessage = "Dear " + name + ", you have scored " + score + " points. " +
                    "You must refresh your Marvel studies.";
        } else {
            resultMessage = "Congratulations " + name + "! You've got " + score + " points. " +
                    "You are definitely a big Marvel fan.";
        }
        return resultMessage;

    }


    /**
     * This method resets the quiz and go back to the start of the quiz.
     **/

    public void reset(View view) {
        int score;

        EditText textField = (EditText) findViewById( R.id.name_field );
        textField.setText( null );

        EditText firstQuestion = (EditText) findViewById( R.id.answer_first_b );
        firstQuestion.setText( null );

        RadioGroup radio02 = (RadioGroup) findViewById( R.id.radio02 );
        radio02.clearCheck();

        RadioGroup radio03 = (RadioGroup) findViewById( R.id.radio03 );
        radio03.clearCheck();

        CheckBox fourthQuestionA = (CheckBox) findViewById( R.id.answer_fourth_a );
        if (fourthQuestionA.isChecked()) {
            fourthQuestionA.toggle();
        }

        CheckBox fourthQuestionB = (CheckBox) findViewById( R.id.answer_fourth_b );
        if (fourthQuestionB.isChecked()) {
            fourthQuestionB.toggle();
        }

        CheckBox fourth_questionC = (CheckBox) findViewById( R.id.answer_fourth_c );
        if (fourth_questionC.isChecked()) {
            fourth_questionC.toggle();
        }

        CheckBox fourthQuestionD = (CheckBox) findViewById( R.id.answer_fourth_d );
        if (fourthQuestionD.isChecked()) {
            fourthQuestionD.toggle();
        }

        RadioGroup radio05 = (RadioGroup) findViewById( R.id.radio05 );
        radio05.clearCheck();

        RadioGroup radio06 = (RadioGroup) findViewById( R.id.radio06 );
        radio06.clearCheck();

        RadioGroup radio07 = (RadioGroup) findViewById( R.id.radio07 );
        radio07.clearCheck();

        RadioGroup radio08 = (RadioGroup) findViewById( R.id.radio08 );
        radio08.clearCheck();

        RadioGroup radio09 = (RadioGroup) findViewById( R.id.radio09 );
        radio09.clearCheck();

        CheckBox tenthQuestionA = (CheckBox) findViewById( R.id.answer_tenth_a );
        if (tenthQuestionA.isChecked()) {
            tenthQuestionA.toggle();
        }

        CheckBox tenthQuestionB = (CheckBox) findViewById( R.id.answer_tenth_b );
        if (tenthQuestionB.isChecked()) {
            tenthQuestionB.toggle();
        }

        CheckBox tenthQuestionC = (CheckBox) findViewById( R.id.answer_tenth_c );
        if (tenthQuestionC.isChecked()) {
            tenthQuestionC.toggle();
        }

        CheckBox tenthQuestionD = (CheckBox) findViewById( R.id.answer_tenth_d );
        if (tenthQuestionD.isChecked()) {
            tenthQuestionD.toggle();
        }

        ScrollView scroll = (ScrollView) findViewById( R.id.scroll );
        scroll.fullScroll( ScrollView.FOCUS_UP );
        scroll.setFocusableInTouchMode( true );

        TextView displayScore = (TextView) findViewById( R.id.display_score );
        displayScore.setText( null );

    }

}



