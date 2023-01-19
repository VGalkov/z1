package org.example.Examples.patterns;

import org.example.Examples.AbstractExampleClass;

import java.util.ArrayList;
import java.util.List;

public class ExampleObserver extends AbstractExampleClass {


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
        public void action(String message) {
            System.out.println(message + "это мне:" + this);
        }
    }


    static class Publisher implements PublisherInterface<PublisherActionListener> {

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
            listenerList = new ArrayList<>();
        }

        @Override
        public void notifyItems(String message) {
            listenerList.forEach(item -> item.action(message));
        }

        public void createNewMessage(String message) {
            System.out.println("oh, new message! working...");
            notifyItems(message);
        }
    }

    interface PublisherActionListener {
        void action(String message);
    }


    interface PublisherInterface<L> {
        List<L> getListeners();

        void addListener(L listener);

        void deleteListener(L listener);

        void deleteAll();

        void notifyItems(String message);
    }
}
