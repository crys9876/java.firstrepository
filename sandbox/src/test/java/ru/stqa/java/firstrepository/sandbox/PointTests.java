package ru.stqa.java.firstrepository.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
public class PointTests {
  @Test
  void distanceBetweenPoint1Dot0And3Dot0() {

    Point point1 = new Point(1, 0);
    Point point2 = new Point(3, 0);
    Assert.assertEquals(point1.distance(point2), 2.0);

  }

  @Test
  void distanceBetweenPoint1Dot1And3Dot3() {

    Point point1 = new Point(1, 1);
    Point point2 = new Point(3, 3);
    Assert.assertEquals(point1.distance(point2), 2.8284271247461903);
  }
  @Test
  void distanceBetweenPoint1Dot1And2Dot0() {

    Point point1 = new Point(1, 0);
    Point point2 = new Point(2, 0);
    Assert.assertEquals(point1.distance(point2), 1.0);
  }
}