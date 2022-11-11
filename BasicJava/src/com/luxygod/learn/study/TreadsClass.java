package com.luxygod.learn.study;

public class TreadsClass {
    public static void main(String[] args) {
        System.out.println("Main thread started...");
        new JThread("JThread").start();
        System.out.println("Main thread finished...");
    }

    static class JThread extends Thread {

        JThread(String name){
            super(name);
        }

        public void run(){

            System.out.printf("%s started... \n", Thread.currentThread().getName());
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println("Thread has been interrupted");
            }
            System.out.printf("%s fiished... \n", Thread.currentThread().getName());
        }
    }
}
