package baitaptuan7_bai1;

import java.util.Scanner;

public class hinhtru extends hinhtron {
    public float chieuCao;

    public hinhtru() {
        ten = "Hinh tru";
    }
        public void nhapChieuCao() {
            System.out.println("Nhap chieu cao: ");
            Scanner kb = new Scanner(System.in);
            chieuCao = kb.nextFloat();
        }

        public void tinhTheTich () {
            tinhDienTich();
            theTich = dienTich * chieuCao;
        }
    }
