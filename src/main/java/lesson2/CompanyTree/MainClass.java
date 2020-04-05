package lesson2.CompanyTree;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        Company c1 = new Company("c1",1,0);
        Company c2 = new Company("c2",2,0);
        Company c3 = new Company("c3",3,1);
        Company c4 = new Company("c4",4,3);
        Company c7 = new Company("c7",7,4);
        Company c5 = new Company("c5",5,3);
        Company c6 = new Company("c6",6,5);
        List<Company> arlist = new ArrayList<Company>();
        arlist.add(c1);
        arlist.add(c2);
        arlist.add(c3);
        arlist.add(c4);
        arlist.add(c5);
        arlist.add(c6);
        arlist.add(c7);
        CompanyTree companyTree = new CompanyTree(arlist);
        companyTree.makeTree();
    }
}

//        id parentId
//        1  0
//        2  0
//        3  1
//        4  3
//        7  4
//        5  3
//        6  5