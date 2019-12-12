package com.example.norm_game;

import android.app.Dialog;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class Main extends AppCompatActivity {

    public static int status;
    public static int pos;
    public static  int coust;
    public static  int exp;
    public static  int level;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        final Button button_catch = (Button)findViewById(R.id.catch1);
        final Button button_end = (Button)findViewById(R.id.kl);
        button_catch.setTag(1);

        final ImageView imgbomb = (ImageView)findViewById(R.id.bomb);
        final ImageView imgskale = (ImageView)findViewById(R.id.skale);
        final ImageView imgimag = (ImageView)findViewById(R.id.imag);
        final ImageView imgbad = (ImageView)findViewById(R.id.imagebad);
        final ImageView imgfish = (ImageView)findViewById(R.id.fish);
        final ImageView imgend = (ImageView)findViewById(R.id.end);

        final TextView texwhait = (TextView)findViewById(R.id.whait);
        final TextView texexp = (TextView)findViewById(R.id.exp);
        final TextView texcoust = (TextView)findViewById(R.id.coust);
        final TextView texnamefish = (TextView)findViewById(R.id.namefish);
        final TextView texstar = (TextView)findViewById(R.id.textexp);
        final TextView texlevel = (TextView)findViewById(R.id.level);
        final TextView texmony = (TextView)findViewById(R.id.textmoney);



        final Animation anim1 = AnimationUtils.loadAnimation(this, R.anim.bombanim);
        final Animation anim2 = AnimationUtils.loadAnimation(this, R.anim.imaganim);

        final Dialog dialo_bad = new Dialog(this);

        coust = 200;
        exp = 0;
        level = 1;

        texstar.setText(Integer.toString(exp));
        texstar.invalidate();

        texlevel.setText(Integer.toString(level));
        texlevel.invalidate();

        texmony.setText(Integer.toString(coust));
        texmony.invalidate();



        float a = 0;
        imgbomb.setAlpha(a);
        imgbomb.invalidate();

        imgskale.setAlpha(a);
        imgskale.invalidate();

        imgimag.setAlpha(a);
        imgimag.invalidate();

        imgbad.setAlpha(a);
        imgbad.invalidate();

        imgend.setAlpha(a);
        imgend.invalidate();

        imgfish.setAlpha(a);
        imgfish.invalidate();

        texwhait.setAlpha(a);
        texwhait.invalidate();

        texcoust.setAlpha(a);
        texcoust.invalidate();

        texexp.setAlpha(a);
        texexp.invalidate();

        texnamefish.setAlpha(a);
        texnamefish.invalidate();

        button_end.setAlpha(a);
        button_end.invalidate();

        status = 1;



        button_end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    float a = 0;

                    imgend.setAlpha(a);
                    imgend.invalidate();

                    imgfish.setAlpha(a);
                    imgfish.invalidate();

                    texwhait.setAlpha(a);
                    texwhait.invalidate();

                    texcoust.setAlpha(a);
                    texcoust.invalidate();

                    texexp.setAlpha(a);
                    texexp.invalidate();

                    texnamefish.setAlpha(a);
                    texnamefish.invalidate();

                    button_end.setAlpha(a);
                    button_end.invalidate();


                } catch (Exception e) { }

            }
                });


        button_catch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {

                    if(status == 1) {
                        float a = 1;
                        imgbomb.setAlpha(a);
                        imgbomb.invalidate();
                        coust -= 20;
                        texmony.setText(Integer.toString(coust));
                        texmony.invalidate();
                        button_catch.setText("Вытащить");
                        status = 0;
                        imgbomb.startAnimation(anim1);
                        new CountDownTimer(5500, 1000)
                        {
                            public void onTick(long millisUntilFinished) {}
                            public void onFinish()
                            {
                                button_catch.setText("Подсечь");
                                status = 2;
                            }

                        }.start();

                    }else if(status == 0) {
                        float b = 0;
                        imgbomb.setAlpha(b);
                        imgbomb.invalidate();
                        button_catch.setText("Забросить");
                        status = 1;
                    }else  if(status == 2)
                    {
                        float b = 0;
                        float a = 1;
                        status = 3;

                        imgskale.setAlpha(a);
                        imgskale.invalidate();

                        imgimag.setAlpha(a);
                        imgimag.invalidate();

                        imgbad.setAlpha(a);
                        imgbad.invalidate();

                        button_catch.setText("Выловить");
                        imgimag.startAnimation(anim2);


                            pos = 1;
                            new CountDownTimer(1000, 1000) {
                                public void onTick(long millisUntilFinished) {
                                }

                                public void onFinish() {
                                    pos = 2;
                                }
                            }.start();

                            new CountDownTimer(1200, 1000) {
                                public void onTick(long millisUntilFinished) {
                                }

                                public void onFinish() {
                                    pos = 3;
                                }
                            }.start();

                        new CountDownTimer(1400, 1000) {
                            public void onTick(long millisUntilFinished) {
                            }

                            public void onFinish() {
                                pos = 4;
                            }
                        }.start();

                   }else  if(status == 3) {
                        float b = 0;
                        float a = 1;
                        status = 1;
                        int num1;
                        MyRandom obj = new MyRandom();

                        imgskale.setAlpha(b);
                        imgskale.invalidate();

                        imgimag.setAlpha(b);
                        imgimag.invalidate();

                        imgbad.setAlpha(b);
                        imgbad.invalidate();

                        imgbomb.setAlpha(b);
                        imgbomb.invalidate();

                        button_catch.setText("Забросить");
                        num1 = obj.rand_fish();

                       if(num1 == 1) {
                            imgfish.setImageResource(R.drawable.karp);
                           imgfish.invalidate();
                           texnamefish.setText("Карп");
                        }else if(num1 == 2) {
                            imgfish.setImageResource(R.drawable.lesh);
                           imgfish.invalidate();
                           texnamefish.setText("Лещ");
                        }else if(num1 == 3) {
                            imgfish.setImageResource(R.drawable.plotva);
                           imgfish.invalidate();
                           texnamefish.setText("Плотва");
                        }else if(num1 == 4) {
                            imgfish.setImageResource(R.drawable.sudak);
                           imgfish.invalidate();
                           texnamefish.setText("Судак");
                        }else if(num1 == 5) {
                            imgfish.setImageResource(R.drawable.okun_big);
                           imgfish.invalidate();
                           texnamefish.setText("Окунь");
                        }
                        int num2 = obj.rand_coust();
                        double num3 = obj.rand_wait();
                        int num4 = obj.rand_exp();



                        String formsttedDouble = new DecimalFormat("#0.0").format(obj.rand_wait());

                        texcoust.setText(Integer.toString(num2));
                        texcoust.invalidate();
                        texwhait.setText(formsttedDouble);
                        texwhait.invalidate();
                        texexp.setText(Integer.toString(num4));
                        texexp.invalidate();

                        if(pos == 4) {
                            dialo_bad.setContentView(R.layout.end_bad);
                            dialo_bad.show();
                        }else {
                            if (obj.rand_window(pos) == 1) {

                                imgend.setAlpha(a);
                                imgend.invalidate();

                                imgfish.setAlpha(a);
                                imgfish.invalidate();

                                texwhait.setAlpha(a);
                                texwhait.invalidate();

                                texcoust.setAlpha(a);
                                texcoust.invalidate();

                                texexp.setAlpha(a);
                                texexp.invalidate();

                                texnamefish.setAlpha(a);
                                texnamefish.invalidate();

                                button_end.setAlpha(a);
                                button_end.invalidate();

                                coust += num2;
                                exp = exp + num4;

                                texmony.setText(Integer.toString(coust));
                                texmony.invalidate();

                                texstar.setText(Integer.toString(exp));
                                texstar.invalidate();

                                if(exp >= 100)
                                {
                                    level++;
                                    texlevel.setText(Integer.toString(level));
                                    texlevel.invalidate();
                                    int exp1 = exp - 100;
                                    exp = exp1;
                                    texexp.setText(Integer.toString(exp));
                                    texexp.invalidate();
                                }

                            } else {
                                dialo_bad.setContentView(R.layout.end_bad);
                                dialo_bad.show();
                            }
                        }
                    }

                } catch (Exception e) { }

            }
        });

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public int get_pos()
    {
        return pos;
    }
}
