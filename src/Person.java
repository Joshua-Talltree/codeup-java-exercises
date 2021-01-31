public class Person {

    private String name;

    public Person(String PersonName) {
        name = PersonName;
    }

    public String getName() {
//TODO: return the person's name
       return name;
    }

    public void setName(String newName) {
//TODO: change the name property to the passed value
        name = newName;
    }

    public void sayHello() {
//TODO: print a message to the console using the person's name
        System.out.println("Hello " + name + "!");
    }

    public static void main(String[] args) {

    }

}