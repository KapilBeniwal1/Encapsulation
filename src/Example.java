/*
In this example, the Person class has private variables name and age,
which can only be accessed and modified within the class.
The getName() and getAge() methods are used to retrieve the values of the
private variables, while the setName() and setAge() methods are used to modify them.
 */
public class Example {
    public static void main(String[] args) {
        Person person = new Person("John", 30);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        person.setName("Jane");
        person.setAge(35);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
