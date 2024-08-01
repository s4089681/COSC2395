/*read students in a loop, create a student as array element,
 * count elements, display*/
import java.util.Scanner;

public class InteractiveRunStudents{
  public static void main(String[] args){
    int count = 0; //to count elements(students) created
    String choice = "y"; 
    //create array object
    Student[] students = new Student[5];
    while(choice.equalsIgnoreCase("y")){
      //create Scanner
      Scanner input = new Scanner(System.in);
      //prompt and read
      System.out.println("Student name:");
      String name = input.nextLine();
      System.out.println("Student number:");
      int studNo = input.nextInt();
      //create array element using constructor
      students[count] = new Student(name, studNo);
      //increment count
      count++;
      //check user choice
      //create a Scanner to read choice
      Scanner choiceInput = new Scanner(System.in);
      System.out.println("Do you wish to proceed?(y/n)");
      choice = choiceInput.nextLine();
    }
    //display array
    students[2].setName("J");
    for(int i = 0; i < count; i++)
      System.out.println(students[i]);
  }//main
}//class
  