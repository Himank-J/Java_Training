import java.util.*;
import java.io.*;

class Employee 
{
	int id;
	float sal;
	String name,comp;
	Scanner sc = new Scanner(System.in);
	
	void add()
	{
		System.out.print("ID: ");
		id=sc.nextInt();
		System.out.print("Name: ");
		name=sc.next();
		System.out.print("Salary: ");
		sal=sc.nextFloat();
		System.out.print("Company: ");
		comp=sc.next();
	}
	
	void display()
	{
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+sal);
		System.out.println("Company: "+comp);
	}
	
	public static class Comparators
	{
		public static final Comparator<Employee> NAME_ASC = (Employee o1, Employee o2) -> o1.name.compareTo(o2.name);
		public static final Comparator<Employee> NAME_DESC = (Employee o1, Employee o2) -> o2.name.compareTo(o1.name);
		public static final Comparator<Employee> ID_ASC = (Employee o1, Employee o2) -> Integer.compare(o1.id, o2.id);
		public static final Comparator<Employee> ID_DESC= (Employee o1, Employee o2) -> Integer.compare(o2.id, o1.id);
	}

}


class Vectors
{
	public static void main(String args[])
	{	
		Vector<Employee> e = new Vector<Employee>();
		Employee emp = new Employee();
		Employee emp2 = new Employee();
		Employee t = new Employee();
		Scanner scm = new Scanner(System.in);
		char ans='y';
		int x,y,ch,flag=0;
		int c=0;
		while(ans=='y')
		{
			System.out.println();
			System.out.print("\t\t\tMAIN MENU (Employee Record)\n1. Add\n2. Display\n3. Search\n4. Delete\n5. Sort(by names)\n6. Sort(by ID)\nEnter choice: ");
			ch=scm.nextInt();
			switch(ch)
			{
				case 1: System.out.print("Enter number of employees you want to add: ");
						x=scm.nextInt();
						for(int i=0;i<x;i++)
						{   emp = new Employee();
							System.out.println("Enter details of employee "+(c+1)+":");
							emp.add();
							e.add(emp);
							c++;
						}
						break;
				case 2: System.out.print("The details of all the employees are:\n");
						for(int i=0;i<c;i++)
						{
							System.out.println("\nEmployee "+(i+1)+":");
							emp=e.get(i);
							emp.display();
						}
						break;		
				case 3:	System.out.print("Enter ID of employee you want find: ");
						x=scm.nextInt();
						flag=0;
						for(int i=0;i<c;i++)
						{
							emp=e.get(i);
							if(emp.id==x)
							{
								flag++;
								System.out.print("The details of employees with id "+x+" are:\n");
								emp.display();
							}
						}	
						if(flag==0)
						System.out.print("Employee NOT found in record!!!");
						break;	
				case 4: System.out.print("Enter ID of employee you want delete: ");
						x=scm.nextInt();
						for(int i=0;i<c;i++)
						{
							emp=e.get(i);
							if(emp.id==x)
							{
								e.remove(i);
								flag++;
								c--;
								System.out.print("Employee Record Deleted.");
								break;
							}
						}	
						if(flag==0)
						System.out.print("Employee NOT found in record!!!");		
						break;
				case 5: 
						int z;
						System.out.println("Press 1 for ASC order and 2 for DESC order:");
						z = scm.nextInt();
						if (z==1){
							Collections.sort(e,Employee.Comparators.NAME_ASC);
							System.out.print("Employee record is sorted by names.");
						}
						else{
							Collections.sort(e,Employee.Comparators.NAME_DESC);
							System.out.print("Employee record is sorted by names.");
						}
						
						break;
				case 6: 
						int op;
						System.out.println("Press 1 for ASC order and 2 for DESC order:");
						op = scm.nextInt();
						if (op==1){
							Collections.sort(e,Employee.Comparators.ID_ASC);
							System.out.print("Employee record is sorted by IDs.");
						}
						else{
							Collections.sort(e,Employee.Comparators.ID_DESC);
							System.out.print("Employee record is sorted by IDs.");
						}
						
						break;
				default:System.out.println("Invalid Choice!!!");		
			}
			System.out.print("\nDo you want to continue?(y/n): ");
			ans=scm.next().charAt(0);
		}
	}
}
