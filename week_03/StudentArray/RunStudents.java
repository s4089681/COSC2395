/*with array of students
 */

public class RunStudents{
  public static void main(String[] args){
    //create array object
    Student[] students = new Student[5];
    //create array elements
    Student s1 = new Student("Bruce Willis", 111);
    Student s2 = new Student("Steven Segal", 222);
    //place students to array
    students[0] = s1;
    students[1] = s2;
    
    //display array using for loop
    for(int i = 0; i <students.length; i++){
      if(students[i]!= null)
       System.out.println(students[i]);
    }//for
    //create third element in one line
    students[2] = new Student("Bruce Lee", 234);
    //display again
    for(int i = 0; i <students.length; i++){
      if(students[i]!= null)
       System.out.println(students[i]);
    }//for
    //change student no for Bruce Lee
    students[2].setStudentNo(1000);
    //display Bruce Lee
    System.out.println(students[2]);
  }//main
}//class
  
    
    