package app;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Switching {
    
 // bn switch mn MAINPROGRAMPAGE lel login page bta3t Librarian

 public void switch2LibrarianLogin(ActionEvent e){

        
    try {
        Parent readerpage;
        readerpage = FXMLLoader.load (getClass().getResource ("LibrarianLogin.fxml"));
        Scene readerscene = new Scene (readerpage);

        Stage appstage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        appstage.setScene (readerscene);
        appstage.show();

    } catch (IOException e1) {
        
        e1.printStackTrace();
    }
    
    
}


// bn switch mn MAINPROGRAMPAGE lel login page bta3t Reader

public void switch2ReaderLogin(ActionEvent e){

    
    try {
        Parent readerpage;
        readerpage = FXMLLoader.load (getClass().getResource ("mylogin.fxml"));
        Scene readerscene = new Scene (readerpage);

        Stage appstage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        appstage.setScene (readerscene);
        appstage.show();

    } catch (IOException e1) {
        
        e1.printStackTrace();
    }
    
    
}



// bn switch mn ReaderMAINpage lel Prog Main Page


public void Logout(ActionEvent e){

    
    try {
        Parent readerpage;
        readerpage = FXMLLoader.load (getClass().getResource ("ProgramMainPage.fxml"));
        Scene readerscene = new Scene (readerpage);

        Stage appstage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        appstage.setScene (readerscene);
        appstage.show();

    } catch (IOException e1) {
        
        e1.printStackTrace();
    }
    
    

}



// bn switch mn search choice le library search


public void libsearch(ActionEvent e){

    
    try {
        Parent readerpage;
        readerpage = FXMLLoader.load (getClass().getResource ("Libsearchpage.fxml"));
        Scene readerscene = new Scene (readerpage);

        Stage appstage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        appstage.setScene (readerscene);
        appstage.show();

    } catch (IOException e1) {
        
        e1.printStackTrace();
    }
    
    

}

// bn switch mn searchchoice le reader search


public void readersearch(ActionEvent e){

    
    try {
        Parent readerpage;
        readerpage = FXMLLoader.load (getClass().getResource ("Usersearchpage.fxml"));
        Scene readerscene = new Scene (readerpage);

        Stage appstage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        appstage.setScene (readerscene);
        appstage.show();

    } catch (IOException e1) {
        
        e1.printStackTrace();
    }
    
    

}


 //opens newww separate window TO SEARCH FOR A BOOK  (BOTH LIBRARIAN AND READER)
 public void Window2Booksearch(ActionEvent e){
    try{
        FXMLLoader fxmlLoader = new FXMLLoader (getClass().getResource (  "Booksearchpage.fxml"));
        Parent my_root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Rent This");
        stage.setScene (new Scene (my_root));
        stage.show();

        }
        catch (Exception exc) {
        exc.printStackTrace();
        }
}



//opens newww separate window TO Add FOR A BOOK  ( LIBRARIAN )
public void Window2AddBook(ActionEvent e){
    try{
        FXMLLoader fxmlLoader = new FXMLLoader (getClass().getResource (  "Addbook.fxml"));
        Parent my_root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Rent This");
        stage.setScene (new Scene (my_root));
        stage.show();

        }
        catch (Exception exc) {
        exc.printStackTrace();
        }
}


//opens newww separate window TO Remove  A BOOK  (LIBRARIAN)
public void Window2RemoveBook(ActionEvent e){
    try{
        FXMLLoader fxmlLoader = new FXMLLoader (getClass().getResource (  "Removebook.fxml"));
        Parent my_root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Rent This");
        stage.setScene (new Scene (my_root));
        stage.show();

        }
        catch (Exception exc) {
        exc.printStackTrace();
        }
}


//opens newww separate window TO ADD  A USERCHOICE  (LIBRARIAN)
public void Window2AddUser(ActionEvent e){
    try{
        FXMLLoader fxmlLoader = new FXMLLoader (getClass().getResource (  "AdduserChoice.fxml"));
        Parent my_root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Rent This");
        stage.setScene (new Scene (my_root));
        stage.show();

        }
        catch (Exception exc) {
        exc.printStackTrace();
        }
}


//opens newww separate window TO ADD  A Reader  (LIBRARIAN)
public void Window2AddReader(ActionEvent e){
    try{
        FXMLLoader fxmlLoader = new FXMLLoader (getClass().getResource (  "Adduser.fxml"));
        Parent my_root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Rent This");
        stage.setScene (new Scene (my_root));
        stage.show();

        }
        catch (Exception exc) {
        exc.printStackTrace();
        }
}


//opens newww separate window TO ADD  A Librarian  (LIBRARIAN) Window2AddLib
public void Window2AddLib(ActionEvent e){
    try{
        FXMLLoader fxmlLoader = new FXMLLoader (getClass().getResource (  "AddLib.fxml"));
        Parent my_root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        
        stage.setScene (new Scene (my_root));
        stage.show();

        }
        catch (Exception exc) {
        exc.printStackTrace();
        }
}



//opens newww separate window TO Remove  A USER  (LIBRARIAN)
public void Window2RemoveUser(ActionEvent e){
    try{
        FXMLLoader fxmlLoader = new FXMLLoader (getClass().getResource (  "Removeuser.fxml"));
        Parent my_root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        
        stage.setScene (new Scene (my_root));
        stage.show();

        }
        catch (Exception exc) {
        exc.printStackTrace();
        }
}


//opens newww separate window TO SEARCH FOR A USER  (BOTH LIBRARIAN AND READER)
public void Window2Usersearch(ActionEvent e){
    try{
        FXMLLoader fxmlLoader = new FXMLLoader (getClass().getResource (  "Searchchoice.fxml"));
        Parent my_root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Rent This");
        stage.setScene (new Scene (my_root));
        stage.show();

        }
        catch (Exception exc) {
        exc.printStackTrace();
        }
}

//opens newww separate window TO Rent search (BOTH LIBRARIAN AND READER)
public void Window2Rent(ActionEvent e){
    try{
        FXMLLoader fxmlLoader = new FXMLLoader (getClass().getResource (  "Rent.fxml"));
        Parent my_root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Rent This");
        stage.setScene (new Scene (my_root));
        stage.show();

        }
        catch (Exception exc) {
        exc.printStackTrace();
        }
}

//opens newww separate window TO Rent search (BOTH LIBRARIAN AND READER)
public void Window2Block(ActionEvent e){
    try{
        FXMLLoader fxmlLoader = new FXMLLoader (getClass().getResource (  "Blockuser.fxml"));
        Parent my_root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Block This");
        stage.setScene (new Scene (my_root));
        stage.show();

        }
        catch (Exception exc) {
        exc.printStackTrace();
        }
}



public void Window2BookOrderList(ActionEvent e){
    try{
        FXMLLoader fxmlLoader = new FXMLLoader (getClass().getResource (  "BookOrderList.fxml"));
        Parent my_root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Remove from Book orderlist");
        stage.setScene (new Scene (my_root));
        stage.show();

        }
        catch (Exception exc) {
        exc.printStackTrace();
        }
}

}
