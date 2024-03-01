package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Librarian extends Person{
    Scanner scanner = new Scanner(System.in);


    public Librarian(String type, String firstName, String lastname, String id, String email, String password,
    String isblocked, String address, String mobilenumber) {
        super(type, firstName, lastname, id, email, password, isblocked, address, mobilenumber);
    
    
    } 

    public Librarian (){};



    void copyLibrarians(ArrayList<Librarian> librarians) {
        try {
            Scanner scanner = new Scanner(new File("data/Librarians.txt"));
            while (scanner.hasNextLine()) {
                int i=0;
                String[] line = scanner.nextLine().split(",");
                String type = line[i].trim();
                String firstName = line[i+1].trim();
                String lastname = line[i+2].trim();
                String id = line[i+3].trim();
                String email = line[i+4].trim();
                String password = line[i+5].trim();
                String isblocked = line[i+6].trim();
                String address = line[i+7].trim();
                String mobilenumber = line[i+8].trim();
                Librarian human = new Librarian(type, firstName, lastname, id, email, password, 
                                                isblocked, address, mobilenumber);
                librarians.add(human);
                i= i+9;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    
    
        for (Librarian human : librarians) {
            System.out.println(human);
          }
        }


        void addLibrarian(ArrayList<Librarian> librarians, String type , String fname, 
    String lname, String id, String email, String password, String isblocked, String address, String mobilenumber) {
    
   
    System.out.println("enter the data for a new librarian");
    Librarian newLibrarian = new Librarian(type, fname, lname, id, email, password, isblocked, address, mobilenumber);
    librarians.add(newLibrarian);
    System.out.println(newLibrarian);
   
}


Librarian searchLibrarian(ArrayList<Librarian> librarians, String id){

    for (Librarian human : librarians) {
        if (human.getID().equals(id)) {
            System.out.println("User found");
            return human;
        }
    }
    System.out.println("User not found!");
    return null;
}


Librarian loginLibrarian(ArrayList<Librarian> librarian, String id, String password){
    
    for (Librarian human : librarian) {
        if (human.getID().equals(id) && human.getPassword().equals(password)) {
            System.out.println("User found");
            
            return human;
        }
    }
    System.out.println("User not found!");
    return null;
}

ArrayList<Librarian> createArrayL(){
    ArrayList<Librarian> librarians = new ArrayList<>();
    System.out.println("arrayL done");
    return librarians;
}




void endLibrarians(ArrayList<Librarian> librarians) throws IOException{
    
    try {
        FileWriter writer = new FileWriter("data/Librarians.txt", false);
    
        for (Librarian librarian : librarians) {
            writer.write(librarian.toString() + "\n");
        }
    
        writer.close();
    } catch (Exception ex) {
        ex.printStackTrace();
    }

}


}
