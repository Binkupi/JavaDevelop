import java.util.Scanner;
public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        divisorsNumber(n);
        int count=countNumberDigit(n);
        System.out.print("Number of Digit of "+n+": ");
        System.out.println(count);
        checkSymmetricalNumbers(n);
        checkSquareNumber(n);
        
    }
    public static void divisorsNumber(int n)
    {   
        System.out.print("Divisors of "+n+": ");
        for(int i=1;i<=n;i++){
           if(n%i==0){
            System.out.print(i+" ");
           } 
        }
        System.out.println();
    }
    public static int countNumberDigit(int n)
    {   
        
        int result=1;
       do{
           if(n/10>0){
            result+=1;
           }
           n=n/10;
        }while(n>0);
        
        return result;
    }
    public static void checkSymmetricalNumbers(int n){
        int replaceN=n;
        double reserseNumber=0;
        int count=countNumberDigit(n);
        if(count==1){
            System.out.println("n is not the symmertrical number");
        }
        else{
            while(replaceN>0){
                int number=replaceN%10;
                reserseNumber=reserseNumber+number*Math.pow(10,count-1);
                count--;
                replaceN=replaceN/10;
    
            }
            reserseNumber=(int)reserseNumber;
            if(reserseNumber==n){
                System.out.println("n is the symmertrical number");
            }
            else{
                System.out.println("n is not the symmertrical number");
            }
        }
        
        

    }
    public static void checkSquareNumber(int n){
        boolean check=false;
        for(int i=1;i*i<=n;i++){
            if(i*i==n){
                check=true;
            }
        }
        if(check){
            System.out.println("n is the aquare number");
        }
        else{
            System.out.println("n is not the aquare number");
        }
    }
    
}
