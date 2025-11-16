package classesAndobject;
class Student{
    String name;
        int age;
        public Student(String name,int age)
        {
            this.name=name;
            this.age=age;
        }
        public void display()
        {
            System.out.println("name is: "+name);
            System.out.println("Age is: "+age);

        }
}
public class example2 {
    public static void main(String[] args) {
        Student s1 = new Student("gowsi", 19);
        s1.display();
    }
    
}
