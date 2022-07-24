package domain;

/**
 * Represents a Course.
 * @author David
 */
public class Course {
    // Attributes
    /**
     * The course's id.
     */
    public int id;
    /**
     * The course's name.
     */
    public String name;
    /**
     * The course's credits.
     */
    private int credits;
    /**
     * The course's number of hours.
     */
    protected int hours;
    /*
     * Course's number of semester.
     */
    public int semester;

    /**
     * Constructor.
     * @param id The course's id.
     * @param name The course's name.
     * @param credits The course's credits.
     * @param hours The course's number of hours.
     * @param semester The course's number of semester.
     */
    public Course(int id, String name, int credits, int hours, int semester) {
        this.id = id;
        this.name = name;
        this.credits = credits;
        this.hours = hours;
        this.semester = semester;
    }

    /**
     * Get the course's number of credits.
     * @return The course's number of credits.
     */
    public int getCredits() {
        return credits;
    }

    /**
     * Set the course's number of credits.
     * @param credits The course's number of credits.
     */
    public void setCredits(int credits) {
        this.credits = credits;
    }
}
