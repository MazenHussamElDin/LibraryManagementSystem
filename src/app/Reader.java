package app;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javafx.fxml.FXML;

import java.io.*;


public class Reader extends Person{

    @FXML
  
    Scanner scanner = new Scanner(System.in);

    
    BookOrderList list;
    
    public Reader(String type, String firstName, String lastname, String id, String email, String password,
    String isblocked, String address, String mobilenumber) {
        super(type, firstName, lastname, id, email, password, isblocked, address, mobilenumber);
    }

    public Reader (){};


    void copyReaders(ArrayList<Reader> readers) {
        try {
            Scanner scanner = new Scanner(new File("data/Readers.txt"));
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
                Reader human = new Reader(type, firstName, lastname, id, email, password, isblocked, address, mobilenumber);
                readers.add(human);
                i= i+9;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    
    
        for (Reader human : readers) {
            System.out.println(human);
          }
        }
    
    

void addReader(ArrayList<Reader> readers, String type , String fname, String lname, String id,  
    String email, String password, String isblocked, String address, String mobilenumber) {


    System.out.println("enter the data for a new reader");
    Reader newReader = new Reader(type, fname, lname, id, email, password, isblocked, address, mobilenumber);
    readers.add(newReader);
    System.out.println(newReader);

}



void blockReader(ArrayList<Reader> readers, String id){
     
    try {
        Reader humantest;
     humantest = searchReader(readers, id);
    
    if( humantest != null){

    humantest.setIsBlocked("Blocked");
    }
        endReaders(readers);
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    

}


void endReaders(ArrayList<Reader> readers) throws IOException{
    
    try {
        FileWriter writer = new FileWriter("data/Readers.txt", false);
    
        for (Reader human : readers) {
            writer.write(human.toString() + "\n");
        }
    
        writer.close();
    } catch (Exception ex) {
        ex.printStackTrace();
    }

}

public void removeReader(ArrayList<Reader> readers, String id) {
    
    readers.remove(searchReader(readers, id));
    System.out.println("User has been removed");
}


ArrayList<Reader> createArray(){
    ArrayList<Reader> readers = new ArrayList<>();
    System.out.println("array done");
    return readers;
}


Reader searchReader(ArrayList<Reader> readers, String id){

    for (Reader human : readers) {
        if (human.getID().equals(id)) {
            System.out.println("User found");
            return human;
        }
    }
    System.out.println("User not found!");
    return null;
}


Reader loginReader(ArrayList<Reader> readers, String id, String password){

    for (Reader human : readers) {
        if (human.getID().equals(id) && human.getPassword().equals(password)) {
            System.out.println("User found");
            return human;
        }
    }
    System.out.println("User not found!");
    return null;
}

}
