import java.util.*;

class Student_set implements Comparable<Student_set>{
    private int rollNo;
    private String name;
    private int age;

    public Student_set(int rollNo, String name, int age) {
    this.rollNo = rollNo;
    this.name = name;
    this.age = age;
    }

    public Student_set(String name) {
    this.name = name;
    }

    @Override
    public String toString() {
    return "RollNo-" + this.rollNo + ", Name-" + this.name + ", Age-" + this.age;
    }

    @Override
    public int compareTo(Student_set o) {
    if (this.rollNo > o.rollNo) {
    return 1;
    } else if (this.rollNo == o.rollNo) {
    return 0;
    } else {
    return -1;
    }
    }

    public static void main(String[] args) {
    // Set<Student_set> students = new HashSet<Student_set>();
    //Set<Student_set> students = new LinkedHashSet<Student_set>();
    Set<Student_set> students = new TreeSet<Student_set>();
    Student_set student1 = new Student_set(3, "Raj", 20);
    Student_set student2 = new Student_set(5, "Shyam", 18);
    Student_set student3 = new Student_set(4, "Ram", 19);
    Student_set student4 = new Student_set(1, "Sunil", 25);
    Student_set student5 = new Student_set(2, "Ajay", 26);
    
    students.add(student1);
    students.add(student2);
    students.add(student3);
    students.add(student4);
    students.add(student5);

    for (Student_set student : students) {
        System.out.println(student);
    }
}
}