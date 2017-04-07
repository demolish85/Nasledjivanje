package com.company;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Circle circle = new Circle(1, "Bela", true);

        System.out.print("Krug je: " + circle.toString());
        System.out.print("\nBoja kruga je: " + circle.getColor());
        System.out.print("\nPoluprecnik mu je: " + circle.getRadius());
        System.out.print("\nPovrsina kruga je: " + circle.getArea());
        System.out.print("\nObim kruga je: " + circle.getDiameter());
        System.out.print("\n**************************************************");

        Rectangle rectangle = new Rectangle(1, 2, "crna", false);

        System.out.print("\nPravougaonik je: " + rectangle.toString());
        System.out.print("\nBoja pravougaonika je: " + rectangle.getColor());
        System.out.print("\nPovrsina pravougaonika je: " + rectangle.getArea());
        System.out.print("\nObim pravougaonika je: " + rectangle.getPerimeter());

    }
}





