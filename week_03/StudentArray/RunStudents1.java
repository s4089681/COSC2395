/*with array of students
 */
import java.util.*;

public class RunStudents1{
  public static void main(String[] args){
    //create array object
    Student[] students = new Student[5];
     //Create an instance of the Scanner class
    Scanner input = new Scanner(System.in);
  //for loop to populate the array with user input
  /*  for(int i = 0; i < 2; i++){
      System.out.print("Student name: ");
      String name = input.nextLine();
      System.out.print("Student number: ");
      int studNo = input.nextInt();
     // students[i] = new Student(name, studNo);
      input.nextLine(); //to consume newline
  }*/
    //display array using for loop
    for(int i = 0; i <students.length; i++){
      if(students[i]!= null)
       System.out.println(students[i]);
    }//for
   
    //change student no for third students
    //students[2].setStudentNo(1000);
    //display the students with new student number
   System.out.println(students);
  }//main
}//class
  
    
    