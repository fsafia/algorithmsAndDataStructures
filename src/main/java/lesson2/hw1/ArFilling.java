package lesson2.hw1;

public class ArFilling {

    int row;
    int column;
    int iter;
    int array[][];
    int i; int j; int value = 1;


    public ArFilling(int row, int column) {
        this.row = row;
        this.column = column;
        array = new int[row][column];
    }

    public void funcFilling(int i, int j, int value) {

        while (j < column - iter) {
            array[i][j] = value ++;
            if (j + 1 == column - iter) {
                break;
            } else {
                j++;
            }
        }

        while (i < row - 1 - iter) {
            i++;
            array[i][j] = value++;
        }

        while (j > iter && row - iter*2 > 1 ) {
            array[i][j - 1] = value++;
            j--;
        }

        while (i > 1 + iter && column - iter*2 > 1 ) {
            array[i - 1][j] = value++;
            i--;
        }

        j++;
        iter++;
        this.i = i;
        this.j = j;
        this.value = value;
    }

    public void zapoln() {
        if (row - iter*2 >= 1 && column - iter*2 >= 1) {
            funcFilling(i,j,value);
            zapoln();
        } else {
            return;
        }
    }

    public void print(int row, int column) {
        for (i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                String s = " ";
                if (i == 0) {
                    s = "  ";
                }
                System.out.print(array[i][j] + s);
            }
            System.out.println();
        }
    }
}
