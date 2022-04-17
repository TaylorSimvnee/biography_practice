public class Author {

    /**
     * WORK ON BOOK CLASS FIRST
     Create a custom constructor that will take 6 args and defines the Author object
     Define Author class fields as firstName, lastName, country, isAlive, age, list of books
     */

    //Create 6 args custom constructor here
    public Author(String firstName, String lastName, String country, String isAlive, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.isAlive = isAlive;
        if(isAlive.toLowerCase().startsWith("y")) this.age = age;
    }

    /*
        Define instance variables here
        NOTE: Books must be defined as a List of Objects of Book class not String
    */
    public String firstName;
    public String lastName;
    public String country;
    public String isAlive;
    public int age;


    /*
    Override toString() method here that returns Author object information
     */

    @Override //without this print out would == address
    public String toString() {
        String s = "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", isAlive=" + isAlive;
                if (this.isAlive.toLowerCase().startsWith("y")) s+= ", age= " + age;
                  s += '}';
             return s;
    }
}
