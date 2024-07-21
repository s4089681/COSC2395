import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;

public class DateDemoJava8 {

   public static void main(String args[]) {
       
      // Get the current date and time
      LocalDateTime currentTime = LocalDateTime.now();
      System.out.println("Current DateTime: " + currentTime);
  
      LocalDate date1 = currentTime.toLocalDate();
      System.out.println("date1: " + date1);
    
      Month month = currentTime.getMonth();
      int day = currentTime.getDayOfMonth();
      
      System.out.println("Month: " + month +" day: " + day);
  
      //12 December 2014
      LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
      System.out.println("date3: " + date3);
      
      //parsing String in proper format to LocalDate
      String dateStr = "2018-04-28"; //yyyy-mm-dd
      LocalDate date = LocalDate.parse(dateStr);
  
      //22 hour 15 minutes
      LocalTime date4 = LocalTime.of(22, 15);
      System.out.println("date4: " + date4);
  
      //parse a string
      LocalTime date5 = LocalTime.parse("20:15:30");
      System.out.println("date5: " + date5);
   }
}