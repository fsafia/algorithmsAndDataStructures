package lesson2.hw1;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число рядов: ");
        int row = scanner.nextInt();
        System.out.println("введите число столбцов: ");
        int column = scanner.nextInt();
        ArFilling arFilling = new ArFilling(row, column);
        arFilling.zapoln();
        arFilling.print(row, column);
    }
}
