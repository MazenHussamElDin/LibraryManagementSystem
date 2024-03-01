package app;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BookOrderList {
    private Reader reader;
    private AllBooks allBooks;

    public BookOrderList(Reader reader, AllBooks allBooks) {
        this.reader = reader;
        this.allBooks = allBooks;
    }

    public BookOrderList(){};

    public void addOrder(AllBooks book) {
        try {
            File file = new File("data/BookOrderList.txt");
            StringBuilder fileContent = new StringBuilder();
            boolean userExists = false;

            if (file.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(", ");
                    if (parts.length == 3 && parts[0].equals(this.reader.getID())) {
                        fileContent.append(line).append(", ").append(book.getID()).append(", ").append(book.getTitle()).append("\n");
                        userExists = true;
                    } else {
                        fileContent.append(line).append("\n");
                    }
                }
                reader.close();
            }

            if (!userExists) {
                fileContent.append(reader.getID()).append(", ").append(book.getID()).append(", ").append(book.getTitle()).append("\n");
            }

            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(fileContent.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




    public void removeOrder(AllBooks book) {
        try {
            File file = new File("data/BookOrderList.txt");
            if (file.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                StringBuilder fileContent = new StringBuilder();
                boolean bookFound = false;
    
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(", ");
                    List<String> updatedParts = new ArrayList<>();
    
                    for (String part : parts) {
                        if (!part.equals(book.getID()) && !part.equals(book.getTitle())) {
                            updatedParts.add(part);
                        } else {
                            bookFound = true;
                        }
                    }
    
                    if (!updatedParts.isEmpty()) {
                        fileContent.append(String.join(", ", updatedParts)).append("\n");
                    }
                }
                reader.close();
    
                if (bookFound) {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                    writer.write(fileContent.toString());
                    writer.close();
                } else {
                    System.out.println("Book not found.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        
}
