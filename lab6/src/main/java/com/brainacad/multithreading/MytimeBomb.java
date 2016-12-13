package com.brainacad.multithreading;

/**
 * Created by Huamani V.R on 03.12.2016.
 */
public class MytimeBomb extends Thread{
    @Override
    public void run() {
        for (int i = 10; i >0 ; i--) {
            System.out.println(i);
            try{
                Thread.sleep(1_000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }


        }
        System.out.println("Booom");
    }
}
