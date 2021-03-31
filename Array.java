
import java.lang.Math;
import java.lang.String;
import java.io.*;
import java.util.*;
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n:");
        int max = 100;
        int min = 1;
        int range = max - min + 1;
        int  n=sc.nextInt();
        System.out.println("enter m:");
        int  m=sc.nextInt();
        int[] arrA= new int[n];
        int[] arrB= new int[m];
    
        for(int i=0;i<n;i++){
            arrA[i]=(int)(Math.random()*range)+min;
        }
        for(int i=0;i<m;i++){
            arrB[i]=(int)(Math.random()*range)+min;
        }
         System.out.println("array B: "+ Arrays.toString(arrB));
         //Create array C from arrayB by copyOf
        int[] arrC=Arrays.copyOf(arrB,arrB.length);
        //Thay thế phần tử thứ 1 đến 3 của mảng C bằng 3 phần tử cuối của mảng B
        System.arraycopy(arrB, arrB.length-3, arrC,1, 3);
        System.out.println("array C: "+ Arrays.toString(arrC));
        //sắp xếp array C tăng dần
        Arrays.sort(arrC);
        // in ra array C
        System.out.println("array C: "+ Arrays.toString(arrC));
        sc.close();
    }
}
