
package universityregistrationsystem;



// Save action info
class Action {
    String type; // "enroll" or "remove"
    int studentID;
    int courseID;

    public Action(String type, int studentID, int courseID) {
        this.type = type;
        this.studentID = studentID;
        this.courseID = courseID;
    }
}

