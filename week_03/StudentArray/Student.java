/*Student.java will be used to create array of Student type
 * in class RunStudents.java
 * Both classes must be in the same folder
 */

public class Student{
  private String name;
  private int studentNo;
  
  public Student(){}
  public Student(String name, int studentNo){
    this.name = name;
    this.studentNo = studentNo;
  }
  public String getName(){
    return name;
  }
  public int getStudentNo(){
    return studentNo;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setStudentNo(int studentNo){
    this.studentNo = studentNo;
  }
  @Override
  public String toString(){
    return "Student# " + studentNo + " "+ name;
  }
}//class
