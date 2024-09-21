package desingPatterns.factory;

public class FactoryPatternDemo {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape = shapeFactory.getShape("circle");
        shape.draw();;

        Shape shape1 = shapeFactory.getShape("square");
        shape1.draw();
    }
}
