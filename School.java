interface Activities
{
    public void playsports();
    public void hostevents();
    public void study();
}

abstract class Info
{
    public void studentinfo(String name, int rollno)
    {
        System.out.println("Name - "+name+"    Rollno - "+rollno);
    }
    abstract void studentid(int id);
}

class Student extends Info implements Activities
{
    public void prepare()
    {
        System.out.println("Preparing for exams...");
    }

    @Override
    public void playsports()
    {
        System.out.println("Playing sports...");
    }

    @Override
    public void hostevents()
    {
        System.out.println("Hosting school events...");
    }

    @Override
    public void study()
    {
        System.out.println("Studying...");
    }

    @Override
    public void studentid(int id)
    {
        System.out.println("Student ID = "+id);
    }
}

public class School
{
    public static void main(String args[])
    {
        Info std = new Student();
        std.studentinfo("Himank",27);
        std.studentid(1);

        Student student = new Student();
        student.playsports();
        student.hostevents();
        student.prepare();
        student.study();
    }
}