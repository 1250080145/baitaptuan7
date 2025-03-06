package baitaptuan7_bai1;
    import java.util.Scanner;

    public class hinhtron extends hinhhoc{
            public float banKinh;

            public hinhtron() {
                ten="Hinh hoc";
            }

            public void nhapBanKinh(){
                System.out.println("Nhap ban kinh: " +banKinh);
                Scanner kb= new Scanner(System.in);
                banKinh= kb.nextFloat();
            }

            public void tinhChuVi(){
                chuVi= 2*PI*banKinh;
                System.out.println("Chu vi hinh tron: "+chuVi);
            }

            public void tinhDienTich(){
                dienTich=PI*banKinh*banKinh;
                System.out.println("Dien tich hinh tron: "+dienTich);
            }
        }










