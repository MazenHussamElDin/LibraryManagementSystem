package app;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class removveee {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button RemoveUserButton;

    @FXML
    private TextField RemoveUserID;
    @FXML
    private TextField RemovebookID;
    App app = new App();
    Reader reader = new Reader();
    Librarian librarian = new Librarian();
    AllBooks bookat = new AllBooks();
    ArrayList <Reader> readers= (reader.createArray());
    ArrayList <Librarian> librarians= (librarian.createArrayL());
    ArrayList <AllBooks> books= (bookat.createArraybook());


    @FXML
    private Label RemoveUserLabel;

    @FXML
    void removeReader1 (ActionEvent e) throws IOException{
    System.out.println("this function has been invoked");
    reader.copyReaders(readers);
    String id = RemoveUserID.getText();
    Reader ahmed = reader.searchReader(readers, id);
    readers.remove(ahmed);
    reader.endReaders(readers);
    readers.clear();
    
    if (ahmed == null) {
        RemoveUserLabel.setText("User not found");
        
    } else {
        RemoveUserLabel.setText("User Removed");
    }
}


@FXML
private Label RemoveBookLabel;


@FXML
    void removebook1 (ActionEvent e) throws Exception{
    System.out.println("this function has been invoked");
    bookat.copyBooks(books);
    String id = RemovebookID.getText();
    AllBooks booksear = bookat.searchBook(books, id);
    books.remove(booksear);
    bookat.endBooks(books);
    books.clear();
    RemoveBookLabel.setText("Book Removed");
}

    @FXML
    void initialize() {
        assert RemoveUserButton != null : "fx:id=\"RemoveUserButton\" was not injected: check your FXML file 'Removeuser.fxml'.";
        assert RemoveUserID != null : "fx:id=\"RemoveUserID\" was not injected: check your FXML file 'Removeuser.fxml'.";

    }

}
