package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Rectangle(2, 3);
        Shape shape1 = new Circle(3);
        Shape shape3 = new Square(4);

        Renderer renderer = new Renderer(shape);
        Renderer renderer1 = new Renderer(shape1);
        Renderer renderer2 = new Renderer(shape3);

        renderer.draw();
        renderer1.draw();
        renderer2.draw();
    }
}
