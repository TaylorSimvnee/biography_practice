import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biography {
    public static void main(String[] args) {

        /**
         * WORK ON BOOK AND AUTHOR CLASSES FIRST
         This will be our actual program that we define author and his books
         In this program we will write the biography of Stefan Zweig, an Austrian novelist.


         Write a program that will get information from user and
         -Print information for the favorite author
         -Print information of the books of favorite author

         Full name = Stefan Zweig
         County = Austria
         Is still alive: No (28 November 1881 – 22 February 1942)
         Some of his books as listed below:

         BookName                            Genre           TotalPage
         Amok                                tale            189
         The Royal Game                      novella         53
         24 Hours in the Life of a Woman     novella         80
         */

        /*
        Expected result:
        Author's information = Author{firstName='Stefan', lastName='Zweig', country='Austria', isAlive=false}
        Author's books are as listed below:
        Book{name='Amok', genre:'tale', page=189}
        Book{name='The Royal Game', tale='novella', page=53}
        Book{name='24 Hours in the Life of a Woman', tale='novella', page=80}
         */

        Scanner scan = new Scanner(System.in);
        List<Book> bookList = new ArrayList<>();
        String enterBookInfo = "";


        System.out.println(Questions.askFirstName);
        String firstName = scan.next();

        System.out.println(Questions.askLastName);
        String lastName = scan.next();

        System.out.println(Questions.askHome);
        String country = scan.next();
        scan.nextLine();

        System.out.println(Questions.askAlive);
        String alive = scan.nextLine();
        alive = (alive.toLowerCase().startsWith("y")) ? "True" : "False";

        int age = 0;
        if (alive.equals("True")) {
            System.out.println(Questions.askAge);
            age = scan.nextInt();
        }
        Author author = new Author(firstName, lastName, country, alive, age);

        do {
            System.out.println(Questions.askEnterBookInfo);
            enterBookInfo = scan.next();
           scan.nextLine();

            if (enterBookInfo.toUpperCase().startsWith("Y")) {

                System.out.println(Questions.askBookName);
                String bookName = scan.nextLine();

                System.out.println(Questions.askGenre);
                String genre = scan.next();

                System.out.println(Questions.askPages);
                int pages = scan.nextInt();

                Book book = new Book(bookName, genre, pages);
                bookList.add(book);
            }

        } while (enterBookInfo.toLowerCase().startsWith("y"));


        System.out.println("Author's information = " + author);
        if (!bookList.isEmpty())System.out.println("Author's books are as listed below:");

        for (Book book : bookList) {
            System.out.println(book);
        }
    }
}
