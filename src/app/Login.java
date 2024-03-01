package app;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Login {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button loginButton;

    @FXML
    private Button switchReg;

    @FXML
    private TextField idtext;

    @FXML
    private PasswordField passwordtext;

    @FXML
    private Label wrongLogIn;

    @FXML
    private Label ReaderLoginLabel;

    @FXML
    private Label LibrarianLoginLabel;
    
    @FXML
    private TextField regAddress;

    @FXML
    private TextField regEmail;

    @FXML
    private TextField regFName;

    @FXML
    private TextField regID;

    @FXML
    private TextField regLName;

    @FXML
    private TextField regNumber;

    @FXML
    private TextField regPassword;

    @FXML
    private TextField idtextlib;

    @FXML
    private PasswordField passwordtextlib;

    @FXML
    void initialize() {
        assert idtext != null : "fx:id=\"idtext\" was not injected: check your FXML file 'mylogin.fxml'.";
        assert passwordtext != null : "fx:id=\"passwordtext\" was not injected: check your FXML file 'mylogin.fxml'.";
        assert wrongLogIn != null : "fx:id=\"wrongLogIn\" was not injected: check your FXML file 'mylogin.fxml'.";

    }
    
    App app = new App();
    Reader reader = new Reader();
    Librarian librarian = new Librarian();
    AllBooks bookat = new AllBooks();    ArrayList <Reader> readers= (reader.createArray());
    ArrayList <Librarian> librarians= (librarian.createArrayL());


    //READER
    @FXML
    void login(ActionEvent e) {

        Reader read;
    reader.copyReaders(readers);
    String id = idtext.getText();
    String password = passwordtext.getText();
    read = reader.loginReader(readers, id, password);

    if (read == null){
        System.out.println("user does not exist");
        ReaderLoginLabel.setText("USER DOES NOT EXIST");

    } else if (read.getIsBlocked().equals("Blocked")){
        System.out.println("User blocked");
        ReaderLoginLabel.setText("USER BLOCKED");
    }
    else {
        System.out.println("shaghalaa");
        ReaderLoginLabel.setText("USER FOUND");
        try {
            Parent readerpage;
            readerpage = FXMLLoader.load (getClass().getResource ("Readermain.fxml"));
            Scene readerscene = new Scene (readerpage);
    
            Stage appstage = (Stage) ((Node)e.getSource()).getScene().getWindow();
            appstage.setScene (readerscene);
            appstage.show();
    
        } catch (IOException e1) {
            
            e1.printStackTrace();
        }
    }
    
}


//Librarian
@FXML
void loginLibrarian(ActionEvent e) {
    Librarian libr; 
    
    librarian.copyLibrarians(librarians);
    String id = idtextlib.getText();
    String password = passwordtextlib.getText();
    libr = librarian.loginLibrarian(librarians, id, password);
    if (libr != null){
        System.out.println("shaghalaa");
        LibrarianLoginLabel.setText("USER FOUND");
        try {
            Parent readerpage;
            readerpage = FXMLLoader.load (getClass().getResource ("Librarianmainpage.fxml"));
            Scene readerscene = new Scene (readerpage);
    
            Stage appstage = (Stage) ((Node)e.getSource()).getScene().getWindow();
            appstage.setScene (readerscene);
            appstage.show();
    
        } catch (IOException e1) {
            
            e1.printStackTrace();
        }

    } else{
        System.out.println("not found");
        LibrarianLoginLabel.setText("USER NOT FOUND");
    }
}


// bn switch mn LOGIN TO READER REGISTER

public void switch2ReaderRegister(ActionEvent e){

        
    try {
        Parent readerpage;
        readerpage = FXMLLoader.load (getClass().getResource ("Register.fxml"));
        Scene readerscene = new Scene (readerpage);

        Stage appstage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        appstage.setScene (readerscene);
        appstage.show();

    } catch (IOException e1) {
        
        e1.printStackTrace();
    }
    
    
}


// bn switch mn LOGIN TO REGISTER LIBRARIAN

public void switch2LibrarianRegister(ActionEvent e){

        
    try {
        Parent readerpage;
        readerpage = FXMLLoader.load (getClass().getResource ("LibrarianRegister.fxml"));
        Scene readerscene = new Scene (readerpage);

        Stage appstage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        appstage.setScene (readerscene);
        appstage.show();

    } catch (IOException e1) {
        
        e1.printStackTrace();
    }
    
    
}




// bn switch mn LOGIN OR REGISTER lel MAINPAGE BTA3T Librarian

public void switch2Librarianmainpage(ActionEvent e){

        
    try {
        Parent readerpage;
        readerpage = FXMLLoader.load (getClass().getResource ("Librarianmainpage.fxml"));
        Scene readerscene = new Scene (readerpage);

        Stage appstage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        appstage.setScene (readerscene);
        appstage.show();

    } catch (IOException e1) {
        
        e1.printStackTrace();
    }
    
    
}

}
