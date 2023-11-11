/**
 * @author  Maksim Belfer
 * @version 1.0.0
 */

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Triangle perimeter");

        System.out.println("Введите длину первой стороны");
        double firstSide = scanner.nextDouble();

        System.out.println("Введите длину второй стороны");
        double secondSide = scanner.nextDouble();

        System.out.println("Введите длину третьей стороны");
        double thirdSide = scanner.nextDouble();

        if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0) {
            System.out.println("Неверные даннные");
        } else {
            System.out.println("Периметр = " + (firstSide + secondSide + thirdSide));
        }

    }
}
