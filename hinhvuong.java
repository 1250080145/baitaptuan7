package baitaptuan7_bai1;

import java.util.Scanner;

public class hinhvuong extends hinhchunhat{

    public hinhvuong(){
        ten="Hinh vuong";

    }

    public void nhapCanh() {
        System.out.println("Nhap canh: ");
        Scanner kb= new Scanner(System.in);
        dai=rong= kb.nextFloat();
    }
}
