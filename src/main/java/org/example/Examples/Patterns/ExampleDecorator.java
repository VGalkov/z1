package org.example.Examples.Patterns;

import org.example.Examples.CommonExampleClass;

public class ExampleDecorator extends CommonExampleClass {


    @Override
    public void runContent() {
        Point pointA = new PointA();
        PointDecorator pointDecorator1 = new PointDecorator(pointA);


        Point pointB = new PointB();
        PointDecorator pointDecorator2 = new PointDecorator(pointB);


        pointDecorator1.draw();
        pointDecorator2.draw();

    }


    static class PointDecorator implements Point {

        private final Point point;

        public PointDecorator(Point point) {
            super();
            this.point = point;
        }

        private void afterDraw() {
            System.out.println("Wrapper addon to class");
        }

        @Override
        public void draw() {
            point.draw();
            afterDraw();
        }
    }



    static class PointA implements Point  {

        @Override
        public void draw() {
            System.out.println(this.toString() + "!");
        }
    }

    static class PointB implements Point {

        @Override
        public void draw() {
            System.out.println(this.toString() + "?");
        }
    }

    interface Point {
        void draw();
    }
}
