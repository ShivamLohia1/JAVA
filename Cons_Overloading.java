class Student{
    String name;
    int age;
    int roll_no;
    float cgpa;

    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    Student(String name,int roll_no,int age){
        this.name = name;
        this.age = age;
    }
    Student(String name,float cgpa){
        this.name = name;
        this.cgpa = cgpa;
    }
    void show(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("CGPA: "+this.cgpa);
        System.out.println("Roll no: "+this.roll_no);
    }
}

public class Cons_Overloading {
    public static void main(String[] args) {
        Student s1 = new Student("Shivam", 20);
        s1.show();

        Student s2 = new Student("Lohia",8.5f);
        s2.show();
    }

}
