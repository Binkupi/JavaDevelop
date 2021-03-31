import java.util.Scanner;
import java.lang.String;
public class CheckString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter string1: ");
        String string1=sc.nextLine();
        System.out.print("Enter string2: ");
        String string2=sc.nextLine();
        int total=totalLengthString(string1, string2);
        System.out.println("Total of length two string is: "+total);
        System.out.println("the first three characters of string1 is: "+string1.substring(0,3));
        System.out.println("the final three characters of string2 is: "+string2.substring(string2.length()-3,string2.length()));
        System.out.println("6th character of the string1 is: "+string1.charAt(6));
        System.out.println("6th character of the string2 is: "+string2.charAt(6));
        if(string1.equals(string2)){
            System.out.println("string1 equal string2");
        }
        else{
            System.out.println("string1 is not equal string2");
        }
        if(string1.contains(string2)){
            System.out.println("string1 contains string2");
        }
        else{
            System.out.println("string1 is not contains string2");
        }
    }
    public static int totalLengthString(String string1, String string2){
        String string=string1.concat(string2);
        int result=string.length();
        return result;
    }
}
