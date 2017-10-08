public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println(circle.toString());
        System.out.println("Площадь: " + circle.findArea() + "." +
                " Длина окружности: " + circle.findCircumference() + ".\n");

        Ellipse ellipse = new Ellipse(3, 2);
        System.out.println(ellipse.toString());
        System.out.println("Площадь: " + ellipse.findArea() + "." +
                " Длина окружности: " + ellipse.findCircumference() + ".\n");

        Triangle triangle = new Triangle(3, 3, 3);
        System.out.println(triangle.toString());
        System.out.println("Площадь: " + triangle.findArea() + ". Периметр: " + triangle.findPerimeter() + ".");
        System.out.println("Радиус вписанной окружности: " + triangle.findRadiusOfInscribedCircle() + ".");
        System.out.println("Радиус описанной окружности: " + triangle.findRadiusOfCircumscribedCircle() + ".");
        System.out.println("Длина средней линии: " + triangle.findMiddleLine(triangle.getSideA()) + ".\n");

        Parallelogram parallelogram = new Parallelogram(3, 4, 1);
        System.out.println(parallelogram.toString());
        System.out.println("Площадь: " + parallelogram.findArea() + ". Периметр: " + parallelogram.findPerimeter() + ".\n");

        Trapeze trapeze = new Trapeze(8, 4, 4, 4, 1, 1);
        System.out.println(trapeze.toString());
        System.out.println("Площадь: " + trapeze.findArea() + ". Периметр: " + trapeze.findPerimeter() + ".\n");

        Rhombus rhombus = new Rhombus(4, 1);
        System.out.println(rhombus.toString());
        System.out.println("Площадь: " + rhombus.findArea() + ". Периметр: " + rhombus.findPerimeter() + ".");
        System.out.println("Радиус вписанной окружности: " + rhombus.findRadiusOfInscribedCircle() + ".");
        System.out.println("Высота: " + rhombus.findHeight() + ".\n");

        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println(rectangle.toString());
        System.out.println("Площадь: " + rectangle.findArea() + ". Периметр: " + rectangle.findPerimeter() + ".");
        System.out.println("Диагональ: " + rectangle.findDiagonal() + ".\n");

        Square square = new Square(4);
        System.out.println(square.toString());
        System.out.println("Площадь: " + square.findArea() + ". Периметр: " + square.findPerimeter() + ".");
        System.out.println("Радиус описанной окружности: " + square.findRadiusOfCircumscribedCircle() + ".\n");

        toCompareAreas(rhombus, circle);
        toCompareAreas(rectangle, triangle);
    }

    public static void toCompareAreas(Figure f1, Figure f2){
        System.out.println(f1.areaComparison(f2)? "Площади фигур примерно равны." : "Площади фигур не равны.");
    }
}
