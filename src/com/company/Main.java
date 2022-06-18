package com.company;

public class Main {

    public static void main(String[] args) {
	    Circle[] circle = new Circle[10];
        int counter = 0;

        for (int i = 0; i < 10; i++) {
            circle[i] = new Circle();
            circle[i].setRadius(i + 1);

            System.out.println("Круг № " + (i+1) + ". " + "Радиус круга - "
                    + circle[i].getRadius() + "; "  + "Площадь круга - " + circle[i].getY());

            if (circle[i].getY() % 3.0 == 0){
                counter++;
            }
        }
        System.out.println();
        System.out.println("Количество кругов чья площадь кратна 3 - " + counter);

    }
}
