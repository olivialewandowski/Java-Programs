/*
This program was created on April 1 2023 by Olivia Lewandowski
This program creates a course class that has the method of adding a student, dropping a student, clearing students, and getting the number of students, and implements them
 */

public class CourseDemo 
{
    public static void main (String [] args)
    {
        //create the object of the course class, course
        Course course = new Course("Philosophy");

        //add three students
        course.addStudent("Emmanuel");
        course.addStudent("Rayanne");
        course.addStudent("Marcel");

        //remove one of the students
        course.dropStudent("Rayanne");

        //print remaining students
        for (int i = 0; i < course.getNumberOfStudents(); i++) 
        {
            System.out.println(course.getStudents()[i]);
        }
    }
}

class Course
{
    //state: properties or attributes or data or fields 
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    //constructors
    //no-arg constructor
    public Course(String courseName) 
    {
    this.courseName = courseName;
    }

    public void addStudent(String student) 
    {
    students[numberOfStudents] = student;
    numberOfStudents++;
    }

    //behavior - methods
    //getter methods
    public String[] getStudents()
    {
    return students;
    }

    public int getNumberOfStudents() 
    {
    return numberOfStudents;
    }

    public String getCourseName() 
    {
    return courseName;
    }

    //regular methods - to drop a student and clear all students
    public void dropStudent(String student) 
    {   
        int index = -1;
        for (int i = 0; i < numberOfStudents; i++) 
        {
            if (students[i].equals(student)) 
            {
                index = i;
                break;
            }
        }
        if (index != -1) 
        {
            for (int i = index; i < numberOfStudents - 1; i++) 
            {
                students[i] = students[i + 1];
            }
            students[numberOfStudents - 1] = null;
            numberOfStudents--;
        }
    }

    public void clear()
    {
        for (int i = 0; i < numberOfStudents; i++) 
        {
            students[i] = null;
        }
        numberOfStudents = 0;
    }
}