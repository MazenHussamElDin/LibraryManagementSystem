package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AllBooks {
    private String title;
    private String Author;
    private String ID;
    private String isAvailable;
    Scanner scanner = new Scanner(System.in);

    

    public AllBooks(String title, String author, String iD, String isAvailable) {
        this.title = title;
        Author = author;
        ID = iD;
        this.isAvailable = isAvailable;
    } 

    public AllBooks (){};
    
    
   
    public String getID() {
        return ID;
    }




    public void setID(String iD) {
        ID = iD;
    }




    public String getTitle() {
        return title;
    }

    public String getIsAvailable() {
        return isAvailable;
    }




    public void setIsAvailable(String isAvailable) {
        this.isAvailable = isAvailable;
    }




    @Override
    public String toString() {
        return title + ", " + Author + ", "+ ID + ", " + isAvailable+ ",";
    }




void copyBooks(ArrayList<AllBooks> books) {
            try {
                Scanner scanner = new Scanner(new File("data/Books.txt"));
                while (scanner.hasNextLine()) {
                    String[] line = scanner.nextLine().split(",");
                    if (line.length >= 4) { // Check if the array has enough elements
                        String title = line[0].trim();
                        String author = line[1].trim();
                        String id = line[2].trim();
                        String isAvailable = line[3].trim();
                        AllBooks book = new AllBooks(title, author, id, isAvailable);
                        books.add(book);
                    } else {
                        // Handle the case when the line doesn't have enough elements
                        System.out.println("Invalid line format: " + Arrays.toString(line));
                    }
                }
                scanner.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found!");
            }
        
            for (AllBooks book : books) {
                System.out.println(book);
            }
        
            try {
                FileWriter writer = new FileWriter("data/Books.txt");
                writer.write(""); // Write an empty string to clear the file
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        
        }




void addBooks (ArrayList <AllBooks> books, String title, String author, String Id){
    System.out.println("enter the data for a new book");
    AllBooks newBook = new AllBooks(title, author, Id, "Available");
    books.add(newBook);
    System.out.println(newBook);
}




AllBooks searchBook(ArrayList<AllBooks> boooks, String title){

    for (AllBooks book : boooks) {
        if (book.getTitle().equals(title)) {
            System.out.println("Book found");
            return book;
        }
    }
    System.out.println("Book not found!");
    return null;
}


void endBooks(ArrayList<AllBooks> books) throws IOException{
    
    try {
        FileWriter writer = new FileWriter("data/Books.txt", false);
    
        for (AllBooks book : books) {
            writer.write(book.toString() + "\n");
        }
    
        writer.close();
    } catch (Exception ex) {
        ex.printStackTrace();
    }

}


Reader badr = new Reader();
AllBooks rent(ArrayList<AllBooks> books, String title, String id, ArrayList<Reader> readers) throws Exception{


    Reader reader = badr.searchReader(readers, id);
    if ( reader != null) {
    
        for (AllBooks book : books) {
            try {
                if (book.getTitle().equals(title)) {
                    if (book.getIsAvailable().equals("Available")) {
                    book.setIsAvailable("Rented");
                    System.out.println("Book " + title + " has been rented.");
                    
                    return book;
                } 
                else {
                System.out.println("Book" + title + " is already rented.");
            }
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    
    System.out.println("Book " + title + " is not available in the library.");
}
    else
        {System.out.println("Cant rent, incorrectid");
        }

return null;
}




public void removeBook(ArrayList<AllBooks> books, String id) {
    
    books.remove(searchBook(books, id));
    System.out.println("Book has been removed");
}

ArrayList<AllBooks> createArraybook(){
    ArrayList<AllBooks> books = new ArrayList<>();
    System.out.println("arraybook done");
    return books;
}



}