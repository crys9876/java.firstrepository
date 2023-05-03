package ru.stqa.java.firstrepository.sandbox;

public class Point {
  public double x;
  public double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double distance(Point p1) {
    double dx = this.x - p1.x;
    double dy = this.y - p1.y;
    return Math.sqrt(dx*dx + dy*dy);
  }

}
