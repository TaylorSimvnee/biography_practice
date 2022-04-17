import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class GUI {
    public static void main(String[] args) {

        List<Book> bookList = new ArrayList<>();
        String enterBookInfo;


        String firstName = JOptionPane.showInputDialog(Questions.askFirstName);

        String lastName = JOptionPane.showInputDialog(Questions.askLastName);

        String country = JOptionPane.showInputDialog(Questions.askHome);

        String alive = JOptionPane.showInputDialog(Questions.askAlive);
        alive = (alive.toLowerCase().startsWith("y")) ? "True" : "False";


        int age = 0;
        if (alive.equals("True")) {
            age = Integer.parseInt(JOptionPane.showInputDialog(Questions.askAge));
        }
        Author author = new Author(firstName, lastName, country, alive, age);

        do {
             enterBookInfo = JOptionPane.showInputDialog(Questions.askEnterBookInfo);

            if (enterBookInfo.toUpperCase().startsWith("Y")) {

                String bookName = JOptionPane.showInputDialog(Questions.askBookName);


                String genre = JOptionPane.showInputDialog(Questions.askGenre);


                int pages = Integer.parseInt(JOptionPane.showInputDialog(Questions.askPages));


                Book book = new Book(bookName, genre, pages);
                bookList.add(book);
            }

        } while (enterBookInfo.toLowerCase().startsWith("y"));


       JOptionPane.showMessageDialog(null, "Author's information = " + author);
        if (!bookList.isEmpty()) JOptionPane.showMessageDialog(null,"Author's books will be displayed as the following (Press OK)");

        for (Book book : bookList) {
            JOptionPane.showMessageDialog(null, book);
        }
    }
}
