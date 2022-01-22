class Employee
{
    private int empid;
    private String name;
    private String company;
    private String designation;

    public int getempid()
    {
        return empid;
    }
    public void setempid(int empid)
    {
        this.empid = empid;
    }
    public String getname()
    {
        return name;
    }
    public void setname(String name)
    {
        this.name = name;
    }
    public String getcompany()
    {
        return company;
    }
    public void setcompany(String company)
    {
        this.company = company;
    }
    public String getdesignation()
    {
        return designation;
    }
    public void setdesignation(String designation)
    {
        this.designation = designation;
    }
    
    @Override
    public String toString()
    {
        String str = "Employee: [id= "+getempid()+", name= "+getname()+", Company= "+getcompany()+" , Designation= "+getdesignation()+"]";
        return str;
    }
    public Employee(int empid, String name, String company, String designation){
        super();
        this.empid = empid;
        this.name = name;
        this.company = company;
        this.designation = designation;

    }

    public static void main(String args[])
    {
        Employee emp1 = new Employee(1,"Himank","Bajaj Finserv Health","Data Science Intern");
        System.out.println(emp1.toString());
    }

}