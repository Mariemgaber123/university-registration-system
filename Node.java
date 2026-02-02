

package universityregistrationsystem;



public class Node {
    int studentID;
    int courseID;
    Node nextStudent;//next student in the same course
    Node nextCourse;//next course in the same student

   public Node(int studentID, int courseID) {
        this.studentID = studentID;
        this.courseID = courseID;
        this.nextStudent = null;
        this.nextCourse = null;
        
   }
}
