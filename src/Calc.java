/**
 * @author  Maksim Belfer
 * @version 1.0.0
 */

import java.util.Scanner;

public class Calc {
    public  static  void  main(String[] args){
        Scanner in = new Scanner(System.in);

//      Greetings
        System.out.println("Это простейший калькулятор на Java");

//      First number
        System.out.println("Введите первое число");
        double firstNumber = in.nextDouble();

//      Second number
        System.out.println("Введите второе число");
        double secondNumber = in.nextDouble();

//       Action
        System.out.println("Выберите действие (+, -, /, *)");
        char action = in.next().charAt(0);
        double result;

        switch (action) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            default:
                System.out.println("Вы передали неправильное действие");
                return;
        }

        System.out.println("Первое число " +  firstNumber);
        System.out.println("Второе число " +  secondNumber);
        System.out.println("Результат равен " + result);
    }
}
