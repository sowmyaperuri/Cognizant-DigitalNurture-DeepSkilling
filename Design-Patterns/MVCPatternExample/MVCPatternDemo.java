public class MVCPatternDemo {

    public static void main(String[] args) {

        Student student = new Student(101, "Priya", "A");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(student, view);

        controller.updateView();

        controller.setStudentName("Sai Supriya");
        controller.setStudentGrade("A+");

        controller.updateView();
    }
}