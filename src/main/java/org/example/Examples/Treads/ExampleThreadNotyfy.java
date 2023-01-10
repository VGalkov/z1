package org.example.Examples.Treads;

import org.example.Examples.CommonExampleClass;

public class ExampleThreadNotyfy extends CommonExampleClass {


    @Override
    public void runContent() {
        MyThread t = new MyThread();
        t.start();
        synchronized (t){
            try {
                t.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("строка для после суммы.");
        System.out.println(t.sumSum);
    }

    class MyThread extends Thread {

        int sumSum = 0;

        @Override
        public void run(){
            synchronized (this) {
                for (int i = 0; i<10; i++) {
                    sumSum += i;
                    try {
                        sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    //notify();
                }
            }
        }
    }


}
