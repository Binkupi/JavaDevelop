

import java.util.Scanner;

public class Total {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter n: ");
        int n=sc.nextInt();
        System.out.println("Enter x: ");
        int x=sc.nextInt();
        float total=0;
        int dem=0;
        for(int i=1;i<=n;i++){
            dem+=i;
            total+=Math.pow(x,i)/dem;
        }
        System.out.println("Total array equal: " +total);
    }
}
