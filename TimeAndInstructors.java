import java.util.*;
class TimesAndInstructors
{
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        String courseName;
        boolean done = false;
        String[][] course = {
        {"CIS101","Mon 9 am" ,"Farrell"},
        {"CIS210","Mon 11 am","Patel"},
        {"MKT100","Tues 8:30 am","Wong"},
        {"ACC150","Tues 6 pm","Deitrich"},
        { "CIS101", "Fri 1 pm", "Lennon" }
        };

        System.out.print("Enter a course: ");
        courseName = input.nextLine().toUpperCase();

        for (int i = 0; i < course.length; i++){
            if (courseName.equals(course[i][0])) {
                System.out.println("Course: " + course[i][0] + " Time: " + course[i][1] + " Instructor: " + course[i][2]);
                done = true;
            }
        }
        if (!done){
            System.out.println("Invalid Entry: No such course");
            System.out.print("Enter a course: ");
            courseName = input.nextLine().toUpperCase();
            for (int i = 0; i < course.length; i++){
                if (courseName.equals(course[i][0])) {
                    System.out.println("Course: " + course[i][0] + " Time: " + course[i][1] + " Instructor: " + course[i][2]);
                    done = true;
                }
            }
        }
        input.close();
    }
}