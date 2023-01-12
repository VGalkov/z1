package org.example.Examples.Threads;

import org.example.Examples.CommonExampleClass;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class ExampleSemaphore extends CommonExampleClass {

    @Override
    public void runContent() {
        List<User> list = new ArrayList<>();
        Semaphore semaphore = new Semaphore(3);

        for (int i = 0; i< 7; i++) {
            User user = new User();
            user.resource = semaphore;
            list.add(user);
        }

        list.forEach(Thread::start);
    }


    static class User extends Thread {

        Semaphore resource;

        @Override
        public void run() {
            try {
                resource.acquire();
                System.out.println(this.getName() + ": get resource; free resources - " + resource.availablePermits());
                Thread.sleep(Math.round(Math.random()+100));
                resource.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
