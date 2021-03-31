import java.util.Scanner;
public class citizen {
    int code;
    int contactPerson;
    public citizen(){

    }
    public void setData(int a,int b){
        code=a;
        contactPerson=b;
    }
    public int getCode(){
        return code;
    }
    public int getcontactPerson(){
        return contactPerson;
    }
    public static void main(String[] args) {
       
       Scanner sc=new Scanner(System.in);
        System.out.println("enter number of citizens n:");
        int n=sc.nextInt();
        citizen[] arr=new citizen[n];
        int[] arrCode=new int[n];
        for(int i=0;i<n;i++){
            arrCode[i]=i;
        }
        for(int i=0;i<n;i++){
            System.out.print(arrCode[i]+" ");
        }
        mixArray(arrCode, n);
        for(int i=0;i<n;i++){
            System.out.print(arrCode[i]+" ");
        }
        for(int i=0;i<n;i++){
            arr[i]=new citizen();
            arr[i].setData(i,arrCode[i]);
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i].getCode()+"-"+arr[i].getcontactPerson());
        }
        findContact(arr, n);

    }
    public static void mixArray(int[] a,int n) {
        for (int i = 0; i <n; i++) {
            int j=(int)(Math.random()*(n));
            int temp = a[i];
            a[i] = a[j];
           a[j] = temp;
        }
    }
    public static void findContact(citizen[] a,int n)
    {  
        for (int i = 0; i <n; i++) {
            System.out.print("Person contact person number "+ i+" : ");
            int code=a[i].getcontactPerson();
            int loop=1;
            while(loop<=n){
                if( code==a[i].code){
                    break;
                }
                else{
                    if(loop==1) {
                        System.out.print(a[code].getCode());   
                    }
                    else{
                        System.out.print(" - "+a[code].getCode());       
                    }
                    
                }
                
                code=a[code].getcontactPerson();   
                loop++;                    
            }
            System.out.println();
        }
    }
}
