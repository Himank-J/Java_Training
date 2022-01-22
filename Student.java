class Student
{
    private int id;
    private String name;
    private String school;

    public int getid()
    {
        return id;
    }
    public void setempid(int id)
    {
        this.id = id;
    }
    public String getname()
    {
        return name;
    }
    public void setname(String name)
    {
        this.name = name;
    }
    public String getschool()
    {
        return school;
    }
    public void setschool(String school)
    {
        this.school = school;
    }
    
    @Override
    public String toString()
    {
        String str = "Student: [id= "+getid()+", Name= "+getname()+", School= "+getschool()+"]";
        return str;
    }
    public Student(int id, String name, String school){
        super();
        this.id = id;
        this.name = name;
        this.school = school;
    }

    public static void main(String args[])
    {
        Student s1 = new Student(1,"Himank","INS");
        System.out.println(s1.toString());
    }

}