package ru.stqa.java.firstrepository.sandbox;

public class MyFirstProgram {
    public static void main(String[] arg) {
        hello("wold");
        hello("user");
        hello("Alexei");

        Square s = new Square(5);

        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());


        System.out.println();

        Point point1 = new Point(1,0);
        Point point2 = new Point(3,0);

        System.out.println("Расстояние между точки 1 с x=" + point1.x + ", y="+ point1.y
                + " и точки 2 с x=" + point2.x + ", y="+point2.y + "   равно : " + point1. distance(point1, point2));


        Point point1a = new Point(1,1);
        Point point2a = new Point(3,3);

        System.out.println("Расстояние между точки 1 с x=" + point1a.x + ", y="+point1a.y
                +" и точки 2 с x=" + point2a.x + ", y="+point2a.y + "   равно : " + point1a.distance(point1a, point2a));

    }

    public static void hello(String somebody) {

        System.out.println("Hello," + somebody + "!");

    }

    public static double area(double a, double b) {
        return a * b;
    }

}


