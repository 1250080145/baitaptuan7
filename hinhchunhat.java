package baitaptuan7_bai1;
import java.util.Scanner;
public class hinhchunhat extends hinhhoc {
    public float dai;
    public float rong;

    public hinhchunhat(){
        ten="Hinh chu nhat";
    }

    public void nhapchieudai(){
        System.out.println("Nhap chieu dai: " + dai);
        Scanner kb= new Scanner(System.in);
        dai= kb.nextFloat();
    }

    public void nhapchieurong(){
        System.out.println("Nhap chieu rong: "+rong);
        Scanner kb= new Scanner(System.in);
        rong = kb.nextFloat();
    }

    public void tinhChuVi(){
        chuVi= dai+rong*2;
    }

    public void tinhDienTich(){
        dienTich=dai*rong;
    }

}
