/**
 * @author  Maksim Belfer
 * @version 1.0.0
 */

import java.util.Scanner;
public class RectangleSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Плозать прямоугольника высчитвается по формуле S=a*b");

        System.out.println("Введите сторону a");
        double sideA = scanner.nextDouble();

        System.out.println("Введите сторону b");
        double sideB = scanner.nextDouble();

        double square;

        if(sideA <=0 || sideB<=0){
            System.out.println("Стороны фигуры должны быть больше 0");
        } else {
            square = sideA * sideB;
            System.out.println("Площадь заданного прямоугольника равна " + square);
        }


    }

}
