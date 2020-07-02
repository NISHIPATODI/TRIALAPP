package com.trial.trialapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity{
    private EditText pass_word;
    private Button button_sbm;
    private static Button button_nxt;

    /* public static final String  MY_TAG= "the_custom_message"; */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
        onClickButtonListener();
    }
    public void addListenerOnButton()
    {
        pass_word = (EditText)findViewById(R.id.editText4);
        button_sbm= (Button)findViewById(R.id.button2);
        button_sbm.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v1)
                    {
                        Toast.makeText(
                                MainActivity.this , pass_word.getText(), Toast.LENGTH_SHORT

                        ).show();
                    }

                }
        );
    }

    public void onClickButtonListener(){
        button_nxt= (Button)findViewById(R.id.button3);
        button_nxt.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent= new Intent(".Main3Activity");
                        startActivity(intent);
                    }
                }
        );
    }
public void onButtonClick(View v)
{
    EditText e1= (EditText)findViewById(R.id.editText);
    EditText e2= (EditText)findViewById(R.id.editText2);
    TextView t1= (TextView)findViewById(R.id.textView);
   int num1 = Integer.parseInt(e1.getText().toString());

    // converting string to int.
   int num2 = Integer.parseInt(e2.getText().toString());
    int sum = num1 + num2;
    t1.setText(Integer.toString(sum));

}

   }
