package lesson2.CompanyTree;

import java.util.ArrayList;
import java.util.List;

public class Company {

    String s;
    Integer id;
    Integer parentId;
    List<Company> list = new ArrayList<Company>();

    public Company(String s, Integer id, Integer parentId) {
        this.s = s;
        this.id = id;
        this.parentId = parentId;
    }
}
