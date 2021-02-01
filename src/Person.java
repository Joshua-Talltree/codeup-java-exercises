class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
//TODO: return the person's name
       return this.name;
    }

    public void setName(String name) {
//TODO: change the name property to the passed value
        this.name = name;
    }

    public void sayHello() {
//TODO: print a message to the console using the person's name
        System.out.println("Hello " + this.name + "!");
    }

    public static void main(String[] args) {
        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);

        Person person3 = new Person("John");
        Person person4 = person1;
        System.out.println(person3.equals(person4));

        Person person5 = new Person("John");
        Person person6 = person1;
        System.out.println(person5.getName());
        System.out.println(person6.getName());
        person6.setName("Jane");
        System.out.println(person5.getName());
        System.out.println(person6.getName());

        Person dan = new Person("Dan");
        System.out.println(dan.getName());
        dan.setName("Danny");
        dan.sayHello();

    }

}