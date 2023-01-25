// Java program to demonstrate encapsulation
//class Encapsulate {


public class Main {
    public static class Encapsulate{
    // private variables declared
    // these can only be accessed by public methods of class
    private String geekName;
    private int geekRoll;
    private int geekAge;


    // get method for age to access
    // private variable geekAge
    public int getAge() {
        return this.geekAge;
    }
    // get method for name to access
    // private variable geekName
    public String getName() {
        return this.geekName;
    }
    // get method for roll to access
    // private variable geekRoll
    public int getRoll() {
        return this.geekRoll;
    }

    // set method for age to set/update the value for variable geekage
    public void setAge(int newAge) {
        this.geekAge = newAge;
    }
    // set method for name to set/update the value for variable geekName
    public void setName(String newName)
    {
        this.geekName = newName;
    }
    // set method for roll to set/update the value for variable geekRoll
    public void setRoll(int newRoll) {
        this.geekRoll = newRoll;
    }
}
    public static void main(String[] args)
    {
        //Creating object of Encapsulate class
        Encapsulate obj = new Encapsulate();

        // setting values of the variables
        obj.setName("Kapil");
        obj.setAge(23);
        obj.setRoll(21);

        // Displaying values of the variables
        System.out.println("name : " + obj.getName());
        System.out.println("age : " + obj.getAge());
        System.out.println("roll : " + obj.getRoll());

        // Direct access of geekRoll is not possible
        // due to encapsulation
        // System.out.println("Geek's roll: " +
        // obj.geekName);
    }
}
