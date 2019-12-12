package com.example.norm_game;

import java.util.Random;

public class MyRandom {


  public int rand_fish()
  {
      int rand_fishnum = (int) (Math.random() * 5);
      return rand_fishnum;
  }

    public double rand_wait()
    {
        double rand_waitnum = (Math.random() * 5);

        return rand_waitnum;
    }

    public int rand_coust()
    {
        int rand_coustnum;
        if(this.rand_wait() <= 2.5) {
             rand_coustnum = (int) (Math.random() * 20);
        }else {
             rand_coustnum = 20 + (int) (Math.random() * 40);
        }
        return rand_coustnum;
    }

    public int rand_exp()
    {
        int rand_expnum;
        if(this.rand_wait() <= 2.5) {
            rand_expnum = (int) (Math.random() * 10);
        }else {
            rand_expnum = 10 + (int) (Math.random() * 20);
        }
        return rand_expnum;
    }

    public int rand_window(int i)
    {
        int rand_windownum = 0;
        Random random = new Random();
        int end;
        if(i == 1){
            rand_windownum = (int) (Math.random() * 40);

        }else  if(i == 2) {
            rand_windownum = 50 + (int) (Math.random() * 80);

        }else if (i == 3){
            rand_windownum = 90 + (int) (Math.random() * 100);
        }

        if(random.nextInt(150) <= rand_windownum){
            end = 1;
        }else {
            end = 0;
        }
        return end;
    }

}
