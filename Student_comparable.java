import java.util.List;
import java.util.ArrayList;
import java.util.*;

class Student_comparable implements Comparable<Student_comparable> {
private int rollNo;
private String name;
private int age;
public Student_comparable(int rollNo, String name, int age) {
this.rollNo = rollNo;
this.name = name;
this.age = age;
}
@Override
public int compareTo(Student_comparable o) {
if (this.rollNo > o.rollNo) {
return 1;
} else if (this.rollNo == o.rollNo) {
return 0;
} else {
return -1;
}
}
@Override
public String toString() {
return "RollNo-" + this.rollNo + ", Name-" + this.name + ", Age-" + this.age;
}
public static void main(String[] args) {
List<Student_comparable> students = new ArrayList<Student_comparable>();
Student_comparable student1 = new Student_comparable(3, "Raj", 20);
Student_comparable student2 = new Student_comparable(5, "Shyam", 18);
Student_comparable student3 = new Student_comparable(1, "Ram", 19);
Student_comparable student4 = new Student_comparable(4, "Sunil", 25);
Student_comparable student5 = new Student_comparable(2, "Ajay", 26);
students.add(student1);
students.add(student2);
students.add(student3);
students.add(student4);
students.add(student5);
Collections.sort(students);
for (Student_comparable student : students) {
System.out.println(student);
}
}
}