package classesAndobject;
 class Dog
{
    String name;                                 //fields
    String breed;
    public Dog(String name, String breed)      //constructor
    {
        this.name = name;
        this.breed = breed;
    }
    public void display()                           //method
    {
        System.out.println("dog barks");
    }
}


public class example1{
    public static void main(String[] args) {
        Dog d =new Dog("Tommy","Bulldog");
        d.display();
    }
    
}
