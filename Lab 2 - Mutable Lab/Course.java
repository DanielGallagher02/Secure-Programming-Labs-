import java.util.Date;

public final class Course {
    // Making courseName final to prevent modification
    private final String courseName; 
    private final Date startDate;

    public Course(String courseName, Date startDate) {
        this.courseName = courseName;
        // Creating a new Date object to prevent external modification
        this.startDate = new Date(startDate.getTime()); 
    }

    public String getCourseName() {
        return courseName;
    }

    // Returning a new Date object with the same time value 
    // to avoid exposing the mutable Date object
    public Date getStartDate() {
        return new Date(startDate.getTime());
    }
}