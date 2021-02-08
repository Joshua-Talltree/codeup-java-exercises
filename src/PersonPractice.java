class PersonPractice {                  // this is a blueprint for a type of object
    public String firstName;    // this is a property
    public String lastName;
    static long WORLD_POPULATION = 8000000000L;

    public String sayHello() {
        return String.format("Hello from %s %s!", firstName, lastName);
    }

    PersonPractice() {
        // null constructor
    }

    PersonPractice(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    // static means that it belongs to the class rather than to an instance of the class
    public static void main(String[] args) {
        PersonPractice josh = new PersonPractice();
        josh.firstName = "Joshua";
        josh.lastName = "Talltree";
        System.out.println(josh.sayHello());
        // print "Hello from Joshua Talltree!"

        PersonPractice chris = new PersonPractice();
        chris.firstName = "Chris";
        chris.lastName = "Cyr";
        System.out.println(chris.sayHello());

        PersonPractice daniel = new PersonPractice("Daniel", "Fryar");

    }
}
