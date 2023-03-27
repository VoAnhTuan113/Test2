package mang1c_a;

import java.util.Scanner;

public class Mang1c_a {
    public static void main(String[] args) {
        int []a;
        Scanner kb= new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: "); 
        
        
        
        //Nhap so phan tu cua mang
        int n=kb.nextInt(); 
        a= new int[n]; //so phan tu cua mang a = n nhap tu ban phim
        
        //Nhap noi dung cho tung phan tu trong mang
        for (int i=0; i<a.length;i++){
            System.out.print("\nNhap phan tu thu "+(i+1)+ ": ");
            a[i]= kb.nextInt();
        }
        
        //In mang
        System.out.println("\nNoi dung man vua nhap: ");
        for (int i=0; i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        
        //tinh tong cac phan tu trong mang
        int s=0;
        for (int i=0; i<a.length; i++){
            s += a[i];
        }
        System.out.println("\nTong cac so trong mang = " +s);
        
        //tim max
        int max = a[0];
        for (int i=0; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println("\nSo lon nhat la: "+ max);
        
        //tim vi tri phan tu nho nhat
        int vt=0;
        for (int i=1; i<a.length; i++){
            if(a[i]<a[vt]){
                vt = i;
            }
        }
        System.out.println("So nho nhat trong mang o vt thu " + (vt+1) + " co gia tri la: "+ a[vt]);
        System.out.println(a.length);
    }
    
}
