
import bailab1.BaiLab1;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class menuLab1 {
    public static void main(String[] args) {
        BaiLab1 ds = new BaiLab1();
        Scanner s = new Scanner (System.in);
        int chon = 0;      
        do{
            System.out.println("|--------------Menu-------------|");
            System.out.println("| 1. CT nhap ho ten sv          |");
            System.out.println("| 2. Tinh C va S hinh chu nhat  |");
            System.out.println("| 3. Tinh the tich lap phuong   |");
            System.out.println("| 4. Tinh can delta             |");
            System.out.println("| 0. Thoat                      |");
            System.out.println("--------------------------------");
            System.out.print("Xin moi chon chuc nang : ");
            chon = s.nextInt();
            if(chon!=0){
                switch (chon){
                    case 0 : System.exit(0);
                    case 1 : ds.bai1(); break;
                    case 2 : ds.bai2() ; break;
                    case 3 : ds.bai3() ; break;
                    case 4 : ds.bai4() ; break;
                    default : System.out.println("Nhap sai vui long nhap lai!");
                }
            }
        }while (chon!=0);
            System.out.println("Chuong trinh ket thuc!");
    }
        
}
    

