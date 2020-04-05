package lesson2.CompanyTree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CompanyTree {

    List<Company> arList;
    List<Company> tree = new ArrayList<Company>();

    public CompanyTree(List<Company> arList) {
        this.arList = arList;
    }



    public void makeTree() {
        Iterator<Company> iterator = arList.iterator();
        while (iterator.hasNext()) {
            Company company = iterator.next();
            if(company.parentId == 0) {
                tree.add(company);
                System.out.println("tree add " + company.s);
                checkParentId(company);
            }
        }
    }

    public void checkParentId(Company company) {
        for (Company c : arList) {
            if (c.parentId == company.id) {
                company.list.add(c);
                System.out.println(company.s + " add " + c.s);
                checkParentId(c);
            }
        }
    }
}


//        id parentId
//        1  0
//        2  0
//        3  1
//        4  3
//        5  4
//        6  0