import java.util.Date;

public class CourseTester {

    public static void main(String[] args) {
        Date startDate = new Date(); // Create a new Date object for the start date
        Course course = new Course("Java", startDate); // Instantiate a new Course object

        System.out.println("Course name: " + course.getCourseName());
        System.out.println("Start date: " + course.getStartDate());

        // Attempting to modify the course details
        startDate.setTime(startDate.getTime() + 86400000L); // Adding one day to the start date

        System.out.println("Modified start date: " + startDate);
        // Check the course start date after modification attempt to see if the object is immutable
        System.out.println("Course start date after modification attempt: " + course.getStartDate());
    }
}