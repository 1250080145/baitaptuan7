package baitaptuan7_bai2;

import baitaptuan7_bai2.person;
import baitaptuan7_bai2.employee;
import baitaptuan7_bai2.customer;

import java.util.Scanner;

public class hienthi {
    public static void main(String[] args) {
        person a= new person("Phuc","Thu Duc");
        employee b= new employee("Duy","Quan 9", 1000000);
        customer c= new customer("Thai", "Quan 2",2000000);

        a.display();
        b.display();
        c.display();

    }
}
