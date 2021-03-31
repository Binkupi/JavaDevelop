import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter edge a: ");
        int a=sc.nextInt();
        System.out.print("Enter edge b: ");
        int b=sc.nextInt();
        System.out.print("Enter edge c: ");
        int c=sc.nextInt();
        System.out.println("Area Triangle is: "+areaTriangle(a,b,c));
        System.out.println("Perimeter Triangle is: "+perimeterTriangle(a,b,c));
    }
    public static double areaTriangle(int a, int b,int c){
        double hfPerimeter=(double)perimeterTriangle(a, b, c)/2;
         double result=Math.sqrt(hfPerimeter*(hfPerimeter-a)*(hfPerimeter-b)*(hfPerimeter-c));
        return result;

    }
    public static double perimeterTriangle(int a, int b,int c){
        double result=a+b+c;
        return result;

    }
    
}
