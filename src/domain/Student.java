package domain;

import java.util.ArrayList;

/**
 * Represents a Student.
 * @author David
 */

public class Student {
    // Attributes
    /**
     * The student's id.
     */
    private int id;
    /**
     * The student's name.
     */
    public String name;
    /**
     * List of courses.
     */
    protected ArrayList<Course> courses;
    /**
     * The student's average.
     */
    private float average;

    /**
     * Constructor.
     * @param id
     * @param name
     * @param courses
     * @param average
     */
    public Student(int id, String name, ArrayList<Course> courses, float average) {
        this.id = id;
        this.name = name;
        this.courses = courses;
        this.average = average;
    }

    /**
     * Get the student's id.
     * @return The student's id.
     */
    public int getId() {
        return id;
    }

    /**
     * Set the student's id.
     * @param id The student's id.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get student's average.
     */
    public float getAverage() {
        return average;
    }

    /**
     * Set student's average.
     * @param average The student's average.
     */
    public void setAverage(float average) {
        this.average = average;
    }

    /**
     * Add a course to the list of courses.
     * @param course The course to add.
     */
    public void addCourse(Course course) {
        this.courses.add(course);
    }

    /**
     * Get the list of courses.
     * @return The list of courses.
     */
    public ArrayList<Course> getCourses() {
        return courses;
    }

    /**
     * Delete the last course of the list of courses.
     * @param courses The list of courses.
     */
    public void deleteCourse(ArrayList<Course> courses) {
        this.courses.remove(courses.size() - 1);
    }

}
