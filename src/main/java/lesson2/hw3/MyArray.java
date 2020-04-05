package lesson2.hw3;

import java.util.Arrays;

public class MyArray {
    public int [] myAr;
    public int size;

    public MyArray(int size) {
        this.size = 0;
        myAr = new int[size];
    }

    public void add(int size) {
        for (int i = 0; i < size; i++) {
            myAr[i] = (int)(Math.random()*100);
            this.size++;
        }
    }

    public void print() {
        System.out.println(Arrays.toString(myAr));
        System.out.println("size = " + size);
    }

    public void insert(int value){
        myAr[this.size] = value;
        size++;
    }

    public boolean find(int value) {
        for (int i = 0; i < size; i++) {
            if (myAr[i] == value) {
                return true;
            }
        }
        return false;
    }
    public boolean findBinary(int value) {
        int low = 0;
        int high = size - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (myAr[mid] == value) {
                return true;
            } else {
                if (value < myAr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return false;
    }

    public void delete(int value) {
        int i;
        for (i = 0; i < size; i++) {
            if (myAr[i] == value) {
                break;
            }
        }
        for (int j = i; j < size; j++) {
            myAr[j] = myAr[j + 1];
        }
        size--;
    }

    public void sortBubble(){
        int out, in;
        int k = 100;
        for (out = size - 1; out >= 1; out--) {
            for(in = 0; in < out; in++) {
                if (myAr[in] > myAr[in + 1]) {
                    change(in,in + 1);
                }
            }
        }
    }

    private void change(int a, int b){
        int tmp = this.myAr[a];
        myAr[a] = myAr[b];
        myAr[b] = tmp;
    }

    public void sortSelect(){
        int out, in, mark;
        for(out = 0;out < size; out++){
            mark = out;
            for(in = out + 1;in < size; in++){
                if (myAr[in] < myAr[mark]){
                    mark = in;
                }
            }
            change(out, mark);
        }
    }

    public void sortInsert(){
        int in, out;
        for(out = 1; out < size; out++){
            int temp = myAr[out];
            in = out;
            while(in > 0 && myAr[in-1] >=temp){
                myAr[in] = myAr[in-1];
                --in;
            }
            myAr[in] = temp;
        }
    }
}
