package lesson5;

import java.util.Scanner;

public class MyReck {

    public int enterTheNumber() {
        System.out.println("Введите число для возведения в степень не равное нулю : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            return enterTheNumber();
        } else {
            return n;
        }
    }

    public int enterThePower() {
        System.out.println("Введите степень - положительное число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            return enterThePower();
        } else {
            return n;
        }

    }

    public int exponentiationFunc(int n, int s) {
        if (s == 0) {
            return 1;
        }
         if (s == 1) {
             return n;
         } else {
             return n * exponentiationFunc(n, s - 1);
         }
    }
}
