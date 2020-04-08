package lesson2.hw3;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;//завершить выполнение если длина массива равна 0
        if (low >= high)
            return;//завершить выполнение если уже нечего делить
        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = array[middle];


        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }
            while (array[j] > opora) {
                j--;
            }
            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);
        if (high > i)
            quickSort(array, i, high);
    }
    public static void main(String[] args) {
        int [] x = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            x[i] = (int)(Math.random()*100);
        }
        int low = 0;
        int high = x.length - 1;
        long time1 = System.currentTimeMillis();
        quickSort(x, low, high);
        System.out.println("delta time " + (System.currentTimeMillis() - time1));

    }
}
