package app;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ORDLcont {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button CreateList;

    @FXML
    private TextField OrderListBook;

    @FXML
    private TextField OrderListUser;

    @FXML
    void initialize() {
        assert CreateList != null : "fx:id=\"CreateList\" was not injected: check your FXML file 'BookOrderList.fxml'.";
        assert OrderListBook != null : "fx:id=\"OrderListBook\" was not injected: check your FXML file 'BookOrderList.fxml'.";
        assert OrderListUser != null : "fx:id=\"OrderListUser\" was not injected: check your FXML file 'BookOrderList.fxml'.";

    }

    Reader reader = new Reader();
    Librarian librarian = new Librarian();
    AllBooks bookat = new AllBooks();    ArrayList <AllBooks> books = (bookat.createArraybook());
    ArrayList <Reader> readers= (reader.createArray());
    ArrayList <Librarian> librarians= (librarian.createArrayL());

    

    public void ordl(String id, String bid) throws IOException{

       reader.copyReaders(readers);
       bookat.copyBooks(books);
       BookOrderList list = new BookOrderList(reader.searchReader(readers, id), bookat.searchBook(books, bid));
       bookat.endBooks(books);
       books.clear();
       bookat.copyBooks(books);
       list.addOrder(bookat.searchBook(books,bid));
       System.out.println("it worked");
       bookat.endBooks(books);
       books.clear();
       reader.endReaders(readers);
       readers.clear();
    }


    @FXML
    void ordlRemove(ActionEvent e) throws IOException{
       
        reader.copyReaders(readers);
       bookat.copyBooks(books);
       BookOrderList list = new BookOrderList(reader.searchReader(readers, OrderListUser.getText()), bookat.searchBook(books, OrderListBook.getText()));
       bookat.endBooks(books);
       books.clear();
       bookat.copyBooks(books);
       list.removeOrder(bookat.searchBook(books, OrderListBook.getText()));
       System.out.println("it worked");
       bookat.endBooks(books);
       books.clear();
       reader.endReaders(readers);
       readers.clear();

    }

}