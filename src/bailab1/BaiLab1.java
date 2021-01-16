/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bailab1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BaiLab1 {

//bai 1-----------------------------------
    
    
    public static void bai1(){
       Scanner s = new Scanner (System.in);
       int tuoi ;
       System.err.println("-- Bai 1 -- ");
       System.out.print("Nhap ho ten : ");
       String hoTen = s.nextLine();    
       System.out.print("Nhap tuoi : ");
       String t = s.nextLine(); 
       try{
       tuoi = Integer.parseInt(t);
       System.out.println("Ten : "+hoTen);
       System.out.println("Tuoi : "+tuoi);
       }catch(Exception e){
       System.out.println("Nhap sai !");
       }
    }
    
    
     //bai 2---------------------------------------
    
    
    
    public static void bai2(){
        Scanner s = new Scanner (System.in);
        System.err.println("-- Bai 2 --");
        float dai = 0;
        float rong = 0 ;
        String d , r;
        System.out.print("Nhap chieu dai : ");
        d = s.nextLine();       
        System.out.print("Nhap chieu rong : ");
        r = s.nextLine();   
        try{
            dai = Float.parseFloat(d);
            rong = Float.parseFloat(r);
            float chuVi = (dai+rong)*2;
            float dienTich = dai*rong;
            float min = (float)Math.min(dai,rong);
            System.out.println("Chieu dai : "+dai);
            System.out.println("Chieu rong : "+rong);
            System.out.println("Chu vi : "+chuVi);
            System.out.println("Dien tich : "+dienTich);
            System.out.println("Canh nho nhat : "+min);
        }catch(Exception e){
            System.out.println("Nhai sai !");
        }
      
    }
    
    
    //bai 3 ----------------------------------------- 
      
    
    
    
    public static void bai3(){
        Scanner s = new Scanner (System.in);
        System.err.println("-- Bai 3 --");
        float canh = 0, theTich;
        String c ;
        System.out.print("Nhap vao canh : ");
        c = s.nextLine();   
        try{
          canh = Float.parseFloat(c);
          theTich = (float) Math.pow(canh, 3);    
          System.out.println("The tich khoi lap phuong :  "+theTich);
        }catch (Exception e){
          System.out.println("Nhap sai!");
        }
    }
    
    
    
    // bai 4  -----------------------------------------------------
    
    
    
    public static void bai4(){
        Scanner s = new Scanner (System.in);
        System.err.println("-- Bai 4 --");
        float a ,b ,c;
        String s1 , s2 , s3;
        System.out.print("nhap a : ");
        s1 = s.nextLine();
        System.out.print("nhap b : ");
        s2 = s.nextLine();
        System.out.print("nhap c : ");
        s3 = s.nextLine();    
        try{
            a = Float.parseFloat(s1);
            b = Float.parseFloat(s2);
            c = Float.parseFloat(s3);
            float delta = (float) (Math.pow(b,2)-4*a*c);
            double delta2 =  Math.sqrt(delta);
            if(delta<0){
            System.out.println("Delta : "+delta);
            System.out.println("Khong the thuc hien can delta vi delta am !");
            }else{
            System.out.println("Delta : "+delta);
            System.out.println("Can delta : "+delta2);
            }
        }catch(Exception e){
            System.out.println("Nhap sai!");
        }       
    }
}

