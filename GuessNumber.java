
import java.util.Scanner;
public class GuessNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("You want the distance to guess the number from 0 ->? Enter the distance: ");
        int n=sc.nextInt();
        //khởi tạo giá trị khoảng cách
        int low=0;
        int high=n;
        int range = n - 0 + 1;
        int number=(int)(Math.random()*range);
        int guess;
        do{
            System.out.println("("+low+","+high+") ?");
            System.out.print(" Enter number you guess: ");
            guess=sc.nextInt();
            if(guess==number){
                System.out.println(" Win!!! You guessed it right ");
            }
            else if(guess>high||guess<low){
                System.out.println("Out of range. Try again? ");
            }
            else if((guess<=high)&&(guess>=low)&&(guess!=number)){
                if(guess<number){
                    System.out.println("Too small");
                    low=guess+1;
                }
                else{
                    System.out.println("Too large");
                    high=guess-1;
                }

            }
        System.out.println("");    
        }while(guess!=number);
    }
}