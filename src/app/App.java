package app;
import java.io.IOException;

import javafx.application. Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
@Override
public void start (Stage primaryStage) {
try {

FXMLLoader fxmlLoader = new FXMLLoader (getClass().getResource("ProgramMainpage.fxml"));


Parent root = (Parent) fxmlLoader.load();
Scene scene = new Scene(root);
primaryStage.setTitle("test-Window");
primaryStage.setScene (scene);
primaryStage.show();
} catch (Exception e) {
e.printStackTrace();
}
}
public static void main(String[] args) throws IOException {

    System.out.println("hey");
    launch(args);
    System.out.println("yep");





}

}