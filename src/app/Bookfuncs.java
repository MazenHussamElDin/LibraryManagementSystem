package app;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Bookfuncs {
    


    @FXML
    private TextField bookid;

    Reader reader = new Reader();
    Librarian librarian = new Librarian();
    AllBooks bookat = new AllBooks();
    ArrayList <AllBooks> books = (bookat.createArraybook());
    ArrayList <Reader> readers= (reader.createArray());
    ArrayList <Librarian> librarians= (librarian.createArrayL());
    ORDLcont ordl = new ORDLcont();

    @FXML
    private TextField rentid;

    @FXML
    private TextField rentuserid;

    @FXML
    private TextField bookauthor;

    @FXML
    private Label bookrentedlabel;

    @FXML
    private Label BookSearchLabel;

    @FXML
    private Label AddBookLabel;
    

    @FXML
    private TextField booktitle;

    @FXML
    private TextField rentTitle;

    @FXML
    void rentthis() throws Exception{

    
        String id = rentuserid.getText();
        String titleb = rentTitle.getText();
        reader.copyReaders(readers);
        bookat.copyBooks(books);
        AllBooks booki = bookat.rent(books, titleb, id, readers);
        bookat.endBooks(books);
        books.clear();
        reader.endReaders(readers);
        readers.clear();


        if (booki != null) {
            bookrentedlabel.setText("Book Rented");
            ordl.ordl(id, titleb);
        } else {
            bookrentedlabel.setText("Book Rental Failed");
        }
        
    }



    @FXML
    void addbookss(ActionEvent e) throws Exception
    {
        bookat.copyBooks(books);
        String title = booktitle.getText() , author = bookauthor.getText() , id = bookid.getText();
        bookat.addBooks(books, title, author, id );
        bookat.endBooks(books);
        books.clear();
        AddBookLabel.setText("Book Added <3");

    }


    @FXML

    void searchforBook(ActionEvent e) throws Exception {
        String title = bookid.getText();
        bookat.copyBooks(books);
        AllBooks book = bookat.searchBook(books, title);
        bookat.endBooks(books);
        books.clear();
        if (book == null) {

            BookSearchLabel.setText("Book Not Found");
            
        } else {
            BookSearchLabel.setText("Book Found");
 
        }
    }
}
