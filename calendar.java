import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.text.ParseException;
public class calendar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Date date=new Date(100000);
        Calendar cal1=Calendar.getInstance(); 
        Calendar cal2=Calendar.getInstance(); 
        //Định dạng khi tạo ngày.
        int day1,month1,year1;
        int day2,month2,year2;
        System.out.print("Nhập ngày tháng năm cho ngày a: ");
        day1=sc.nextInt();
        month1=sc.nextInt();
        year1=sc.nextInt();
        System.out.print("Nhập ngày tháng năm cho ngày b: ");
        day2=sc.nextInt();
        month2=sc.nextInt();
        year2=sc.nextInt();
        //set thời gian cho ngày a
        cal1.set(year1,month1-1,day1);
        System.out.println("Ngày a:"+cal1.getTime()); 
        //set thời gian cho ngày b
        cal2.set(year2,month2-1,day2);
        System.out.println("Ngày b:"+cal2.getTime()); 

        //Hàm so sánh hai ngày
        compareToDate(cal1,cal2);

        //Tìm kiếm ngày trước và ngày sau ngày a
        //----Ngày trước ngày a-------
       previousDay(cal1);
       afterDay(cal1);

       // Xác định a là ngày thứ mấy trong năm
       System.out.println("Ngày a là ngày thứ: " +cal1.get(Calendar.DAY_OF_YEAR)+" trong năm");
        

       //Xác định tháng chứa ngày a có bao nhiêu ngày
       totalDayOfMonth(cal1);

       //Kiểm tra năm chứa ngày a có phải năm nhuận không
       int year=cal1.get(Calendar.YEAR);
       String result=isLeafYear(year)?"Nhuận":"Không nhuận";
        System.out.println("Năm chứa a là năm: "+result);
       
    }
    public static void compareToDate(Calendar cal1,Calendar cal2){   
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
        Date date1=cal1.getTime();
        Date date2=cal2.getTime();
        //Chuyển date1 về chuổi yyyy-mm-dd
        String strDate1=sdf.format(date1);
        String strDate2=sdf.format(date2);
        
       //Chuyển strDate1 thành date kiueer yyyy-MM--dd
        try {
            date1 = sdf.parse(strDate1);
            date2=sdf.parse(strDate2);
            
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date1+" "+date2);  
        if(date1.compareTo(date2)==0){
            System.out.println("Ngày a trùng với ngày b");  
        }
        else if(date1.compareTo(date2)<0){
            System.out.println("Ngày a trước ngày b"); 
        }
        else {
            System.out.println("Ngày a sau ngày b"); 
        }

    }
    public static void previousDay(Calendar cal){
        Calendar testCal=cal;
        testCal.add(Calendar.DATE, -1);
        System.out.println(" Ngày phía trước ngày a: " + testCal.getTime());
    }
    public static void afterDay(Calendar cal){
        Calendar testCal=cal;
        testCal.add(Calendar.DATE, 1);
        System.out.println(" Ngày phía sau ngày a: " + testCal.getTime());
        System.out.println(" Ngày ngày a: " + cal.getTime());
    }
    public static void totalDayOfMonth(Calendar cal1){
        int month=cal1.get(Calendar.MONTH);
        int year=cal1.get(Calendar.YEAR);
        int[] dayOfMonth={31,28,31,30,31,30,31,31,30,31,30,31};
        dayOfMonth[1]+=isLeafYear(year)?1:0;
        System.out.println("Số ngày trong tháng chứa a là: " +dayOfMonth[month]);
        
    }
    public static boolean isLeafYear(int year){
        boolean isLeap=false;
        if(year % 4 == 0)//chia hết cho 4 là năm nhuận
        {   
            if( year % 100 == 0)
            //nếu vừa chia hết cho 4 mà vừa chia hết cho 100 thì không phải năm nhuận
            {
                if ( year % 400 == 0)//chia hết cho 400 là năm nhuận
                    isLeap = true;
                else
                    isLeap = false;//không chia hết cho 400 thì không phải năm nhuận
            }
            else//chia hết cho 4 nhưng không chia hết cho 100 là năm nhuận
                isLeap = true;
        }
        else {
            isLeap = false;
        }
        return isLeap;
    }

}
