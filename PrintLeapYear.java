import java.util.Scanner;
 
public class PrintLeapYear {
 
    public static void main(String[] args) {
 
        int startYear=2020;
        
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Year To which you want to display Leap Years :");
        int year=s.nextInt();
        
        System.out.println("Next " +year+ " Leap year :");
        for (int i = startYear; i <= startYear+year; i++) {
        	

            if ( (i % 4 ==0) && (i % 100 !=0) || (i % 400 == 0) ){
            	
            	System.out.println(i);
            }
           
        }
    }
}

********************************************************************************


Enter Year To which you want to display Leap Years :20
Next 20 Leap year :
2020
2024
2028
2032
2036
2040