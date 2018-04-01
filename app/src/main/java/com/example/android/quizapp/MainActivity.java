package com.example.android.quizapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * This method called when the result button is clicked.
     **/
    public void submit(View view) {
        EditText nameField = findViewById(R.id.name_field);
        String name = nameField.getText().toString();

        EditText first_question = findViewById(R.id.answer_first_b);
        String first_b = first_question.getText().toString();

        RadioButton second_question = findViewById(R.id.answer_second_b);

        RadioButton third_question = findViewById(R.id.answer_third_a);

        CheckBox fourth_question_b = findViewById(R.id.answer_fourth_b);

        CheckBox fourth_question_d = findViewById(R.id.answer_fourth_d);

        RadioButton fifth_question = findViewById(R.id.answer_fifth_b);

        RadioButton sixth_question = findViewById(R.id.answer_sixth_a);

        RadioButton seventh_question = findViewById(R.id.answer_seventh_b);

        RadioButton eight_question = findViewById(R.id.answer_eight_b);

        RadioButton ninth_question = findViewById(R.id.answer_ninth_a);

        CheckBox tenth_question_b = findViewById(R.id.answer_tenth_b);

        CheckBox tenth_question_d = findViewById(R.id.answer_tenth_d);

        if (first_b.equals("Benjamin"))

        {
            score = score + 1;
        }

        if (second_question.isChecked())

        {
            score = score + 1;
        }

        if (third_question.isChecked())

        {
            score = score + 1;
        }

        if (fourth_question_b.isChecked())

        {
            score = score + 1;
        }

        if (fourth_question_d.isChecked())

        {
            score = score + 1;
        }

        if (fifth_question.isChecked())

        {
            score = score + 1;
        }

        if (sixth_question.isChecked())

        {
            score = score + 1;
        }

        if (seventh_question.isChecked())

        {
            score = score + 1;
        }

        if (eight_question.isChecked())

        {
            score = score + 1;
        }

        if (ninth_question.isChecked())

        {
            score = score + 1;
        }

        if (tenth_question_b.isChecked())

        {
            score = score + 1;
        }

        if (tenth_question_d.isChecked())

        {
            score = score + 1;
        }

        String resultMessage = displayScore(name, score);

        TextView scoreSummary = (TextView) findViewById(R.id.display_score);
        scoreSummary.setText(resultMessage);

    }


    /**
     * This method displays different score message depending on the score range
     **/

    public String displayScore(String name, int score) {

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
        score = 0;

        EditText textField = (EditText) findViewById(R.id.name_field);
        textField.setText(null);

        EditText first_question = (EditText) findViewById(R.id.answer_first_b);
        first_question.setText(null);

        RadioGroup radio02 = (RadioGroup) findViewById(R.id.radio02);
        radio02.clearCheck();

        RadioGroup radio03 = (RadioGroup) findViewById(R.id.radio03);
        radio03.clearCheck();

        CheckBox fourth_question_a = (CheckBox) findViewById(R.id.answer_fourth_a);
        if (fourth_question_a.isChecked()) {
            fourth_question_a.toggle();
        }

        CheckBox fourth_question_b = (CheckBox) findViewById(R.id.answer_fourth_b);
        if (fourth_question_b.isChecked()) {
            fourth_question_b.toggle();
        }

        CheckBox fourth_question_c = (CheckBox) findViewById(R.id.answer_fourth_c);
        if (fourth_question_c.isChecked()) {
            fourth_question_c.toggle();
        }

        CheckBox fourth_question_d = (CheckBox) findViewById(R.id.answer_fourth_d);
        if (fourth_question_d.isChecked()) {
            fourth_question_d.toggle();
        }

        RadioGroup radio05 = (RadioGroup) findViewById(R.id.radio05);
        radio05.clearCheck();

        RadioGroup radio06 = (RadioGroup) findViewById(R.id.radio06);
        radio06.clearCheck();

        RadioGroup radio07 = (RadioGroup) findViewById(R.id.radio07);
        radio07.clearCheck();

        RadioGroup radio08 = (RadioGroup) findViewById(R.id.radio08);
        radio08.clearCheck();

        RadioGroup radio09 = (RadioGroup) findViewById(R.id.radio09);
        radio09.clearCheck();

        CheckBox tenth_question_a = (CheckBox) findViewById(R.id.answer_tenth_a);
        if (tenth_question_a.isChecked()) {
            tenth_question_a.toggle();
        }

        CheckBox tenth_question_b = (CheckBox) findViewById(R.id.answer_tenth_b);
        if (tenth_question_b.isChecked()) {
            tenth_question_b.toggle();
        }

        CheckBox tenth_question_c = (CheckBox) findViewById(R.id.answer_tenth_c);
        if (tenth_question_c.isChecked()) {
            tenth_question_c.toggle();
        }

        CheckBox tenth_question_d = (CheckBox) findViewById(R.id.answer_tenth_d);
        if (tenth_question_d.isChecked()) {
            tenth_question_d.toggle();
        }

        ScrollView scroll = (ScrollView) findViewById(R.id.scroll);
        scroll.fullScroll(ScrollView.FOCUS_UP);
        scroll.setFocusableInTouchMode(true);

        TextView displayScore = (TextView) findViewById(R.id.display_score);
        displayScore.setText(null);

    }

}



