public class Student 
{
    private String name;
    private Double gpa;

    public Student()
    {

    }

    public Student (String n, double g)

    {
        name = n;
        gpa = g;
    }

    public String getName()
    {
        return name;
    }

    public double getGPA()
    {
        return gpa;
    }
}
