package com.wordpress.fuenique.calci;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;


public class MainActivity   extends AppCompatActivity{
    //TVieextw one,two,three,four,five,six,seven,eight,nine,mult,plus,minus,divide,equal,v1,v2;
    float m, n, p, o, l, q, w, e,p1;
    float add, sub, mul, div, squ;
    TextToSpeech t;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // int score=0;
        //final int m;
        final TextView ed = (TextView) findViewById(R.id.ed);
        TextView one = (TextView) findViewById(R.id.one);
        TextView two = (TextView) findViewById(R.id.two);
        TextView three = (TextView) findViewById(R.id.three);
        TextView four = (TextView) findViewById(R.id.four);
        TextView five = (TextView) findViewById(R.id.five);
        TextView six = (TextView) findViewById(R.id.six);
        TextView seven = (TextView) findViewById(R.id.seven);
        TextView eight = (TextView) findViewById(R.id.eight);
        TextView nine = (TextView) findViewById(R.id.nine);
        TextView plus = (TextView) findViewById(R.id.plus);
        TextView minus = (TextView) findViewById(R.id.minus);
        TextView mult = (TextView) findViewById(R.id.mult);
        TextView divide = (TextView) findViewById(R.id.divide);
        TextView v1 = (TextView) findViewById(R.id.v1);
        TextView zero = (TextView) findViewById(R.id.zero);
        TextView equal = (TextView) findViewById(R.id.equal);
        TextView dot = (TextView) findViewById(R.id.dot);
        TextView s1 = (TextView) findViewById(R.id.s1);
        TextView s2 = (TextView) findViewById(R.id.s2);
        TextView square = (TextView) findViewById(R.id.square);
        final EditText text = (EditText) findViewById(R.id.text);
        bt=(Button)findViewById(R.id.bt);
        t=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    t.setLanguage(Locale.UK);
                }
            }
        });
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = ed.getText().toString();
                Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                t.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });



        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.append("1");
                ed.append("1");

            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.append("2");
                ed.append("2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.append("3");
                ed.append("3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.append("4");
                ed.append("4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.append("5");
                ed.append("5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.append("6");
                ed.append("6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.append("7");
                ed.append("7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.append("8");
                ed.append("8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.append("9");
                ed.append("9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.append("0");
                ed.append("0");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {if(text.getText()==null)
            {
                Toast.makeText(MainActivity.this,"enter number first",Toast.LENGTH_SHORT).show();
            }
            else {
                try {
                    m = Float.parseFloat(text.getText() + "");
                    ed.append("+");
                    text.setText(null);

                    add = 1;
                }
                catch(NumberFormatException e)
                {
                    Toast.makeText(MainActivity.this,"give valid input",Toast.LENGTH_SHORT).show();
                }

            }     }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    p = Float.parseFloat(text.getText() + "");
                    ed.append("-");
                    text.setText(null);

                    sub = 1;
                } catch(NumberFormatException e)
                {
                    Toast.makeText(MainActivity.this,"give valid input",Toast.LENGTH_SHORT).show();
                }


            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    o = Float.parseFloat(text.getText() + ""); ed.append("*");
                    text.setText("");

                    mul = 1;
                }
                catch(NumberFormatException e)
                {
                    Toast.makeText(MainActivity.this,"give valid input",Toast.LENGTH_SHORT).show();
                }


            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    l = Float.parseFloat(text.getText() + "");ed.append("/");
                    text.setText("");

                    div = 1;
                }
                catch(NumberFormatException e)
                {
                    Toast.makeText(MainActivity.this,"give valid input",Toast.LENGTH_SHORT).show();
                }


            }
        });
        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    q = Float.parseFloat(text.getText() + "");
                    ed.append(q*q+"0");
                    text.setText("");
                    text.setText(q * q + "0");

                }
                catch(NumberFormatException e)
                {
                    Toast.makeText(MainActivity.this,"give valid input",Toast.LENGTH_SHORT).show();
                }



            }
        });

            s1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    text.setText(w+"");
                    ed.setText(w+"");


                    // add=1;

                }
            });
            s1.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    try {
                        w = Float.parseFloat(text.getText() + "");
                        text.setText("");
                    }
                    catch(NumberFormatException e)
                    {
                        Toast.makeText(MainActivity.this,"give valid input",Toast.LENGTH_SHORT).show();
                    }

                    return false;
                }
            });
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text.setText(e+"");
                ed.setText(e+"");


                // add=1;

            }
        });
        s2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                try {
                    e = Float.parseFloat(text.getText() + "");
                    text.setText("");
                }
                catch(NumberFormatException e)
                {
                    Toast.makeText(MainActivity.this,"give valid input",Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });





        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                text.setText(text.getText() + ".");
                ed.append(".");

            }
        });
        v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n = 0;
                l = 0;
                o = 0;
                p = 0;
                q = 0;
                add = 0;
                sub = 0;
                mul = 0;
                div = 0;
                squ = 0;
                text.setText("");
                ed.setText("");

            }
        });

        if (!text.equals("")) {


            equal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        n = Float.parseFloat(text.getText() + "");
                    }
                    catch(NumberFormatException e)
                    {
                        Toast.makeText(MainActivity.this,"give valid input",Toast.LENGTH_SHORT).show();
                    }
                    text.setText(null);
                    if (add == 1) {


                                      ed.append("=");
                        text.setText((n + m) + "");
                        ed.append((n + m) + "");
                        add = 0;
                    } else if
                (sub == 1)
                {              ed.append("=");
                            text.setText((p-n)+"");
                             ed.append((p-n)+"");
                             sub=0;
                        }


                     else if (mul == 1) {   ed.append("=");
                        text.append((o * n) + "");
                         ed.append((n*o)+"");
                        mul = 0;
                    } else if (div == 1) {     ed.append("=");       
                        text.append((l / n) + "");
                         ed.append((l/n)+"");
                        div = 0;
                    } else {
                        text.setText("");
                    }
                }
            });
        }
        else
        {
            text.setText("0");
        }

    }
    public void onPause(){
        if(t !=null){
            t.stop();
            t.shutdown();
        }
        super.onPause();
    }
}