import java.util.*;

class Student{
    private int rollNo;
    private String name;
    private int age;

    public Student(int rollNo, String name, int age) {
    this.rollNo = rollNo;
    this.name = name;
    this.age = age;
    }

    @Override
    public String toString() {
    return "RollNo-" + this.rollNo + ", Name-" + this.name + ", Age-" + this.age;
    }
}

class MapImpl{
    public static void main(String[] args) {
    Map<String, Student> map = new TreeMap<String, Student>();

    map.put("UUID-2",new Student(3, "Raj", 20));
    map.put("UUID-3",new Student(5, "Shyam", 18));
    map.put("UUID-3",new Student(4, "Ram", 19));
    map.put("UUID-5",new Student(1, "Sunil", 25));
    map.put("UUID-1",new Student(2, "Ajay", 26));
    
    Set<String> keys = map.keySet();
    Collection<Student> values = map.values();

    for(Student s:values){
        System.out.println(s);
    }
    for(String str:keys){
        System.out.println("key as "+str+" value "+map.get(str));
    }
    }
}
// interface_name variable_name = (data_type parameter_name) -> code;
    //variable_name.function_name();


//interface interface_name
//{
    //public void function_name(datatype parameter_name)
//}