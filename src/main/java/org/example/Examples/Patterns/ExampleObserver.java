package org.example.Examples.Patterns;

import org.example.Examples.CommonExampleClass;

import java.util.ArrayList;
import java.util.List;

public class ExampleObserver extends CommonExampleClass {


    @Override
    public void runContent() {
        Listener l1 = new Listener();
        Listener l2 = new Listener();

        Publisher publisher = new Publisher();

        publisher.addListener(l1);
        publisher.addListener(l2);

        publisher.createNewMessage("это тебе!");
    }


    static class Listener implements PublisherActionListener {

        @Override
        public void actionPerfrom(String message) {
            System.out.println(message + "это мне:" + this.toString());
        }
    }


    class Publisher implements PublisherInterface {

        private List<PublisherActionListener> listenerList = new ArrayList<>();

        @Override
        public List<PublisherActionListener> getListeners() {
            return listenerList;
        }

        @Override
        public void addListener(PublisherActionListener publisherActionListener) {
            listenerList.add(publisherActionListener);

        }

        @Override
        public void deleteListener(PublisherActionListener publisherActionListener) {
            listenerList.remove(publisherActionListener);
        }

        @Override
        public void deleteAll() {
            listenerList = new ArrayList<PublisherActionListener>();
        }

        @Override
        public void notifyItems(String message) {
            listenerList.forEach(item -> item.actionPerfrom(message));
        }

        public void createNewMessage(String message) {
            System.out.println("oh, new message! working...");
            notifyItems(message);
        }
    }

    interface PublisherActionListener {
        public void actionPerfrom(String message);
    }


    interface PublisherInterface {
        List<PublisherActionListener> getListeners();

        void addListener(PublisherActionListener publisherActionListener);

        void deleteListener(PublisherActionListener publisherActionListener);

        void deleteAll();

        void notifyItems(String message);
    }
}
