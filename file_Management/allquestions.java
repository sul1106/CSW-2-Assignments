package file_Management;
import java.util.*;
import java.io.*;
import java.nio.file.*;
public class allquestions {
 static Scanner scanner=new Scanner(System.in);
public static void main(String[] args) {
    while (true) {
        System.out.println("\nFile Handling Operations:");
        System.out.println("1. Create and Write to a File");
        System.out.println("2. Read from a File");
        System.out.println("3. Append Content to an Existing File");
        System.out.println("4. List Files and Directories");
        System.out.println("5. Filter and List Specific File Types");
        System.out.println("6. Delete a Specific File");
        System.out.println("7. Copy File Content");
        System.out.println("8. Rename a File");
        System.out.println("9. Display File Metadata");
        System.out.println("10. Recursive Directory Listing");
        System.out.println("11. Exit");
        System.out.print("Choose an operation: ");
        int c = scanner.nextInt(); 
        scanner.nextLine(); // consume the newline 
        switch (c) {
        case 1:
        createAndWriteFile();
        break;
        case 2:
        readFile();
        break;
        case 3:
        appendToFile();
        break;
        case 4:
        listFilesAndDirectories();
        break;
        case 5:
        filterAndListTxtFiles();
        break;
        case 6:
        deleteSpecificFile();
        break;
        case 7:
       copyFileContent();
        break;
        case 8:
        renameFile();
        break;
        case 9:
        displayFileMetadata();
        break;
        case 10:
        recursiveDirectoryListing();
        break;
        case 11:
        System.exit(0);
        default:
        System.out.println("Invalid c, please choose again.");
        }
        }
}
private static void createAndWriteFile() //function to create and write in the file
{
    Date curDate = new Date();
    String Date = curDate.toString();
    File fPath = new File("D:\\jpmorgan practice\\file_Management\\text.txt");
    try
    {
        
        if(fPath.exists()) //checking if file exists already
        {
            System.out.println("File already exists..");
        }
        System.out.println("Enter your diary:");
        String diary = scanner.nextLine();
        FileWriter fileWriter = new FileWriter(fPath);
        
        fileWriter.write(Date + "\n");
        fileWriter.write(diary + "\n");
        fileWriter.close();

        System.out.println("Diary entry saved successfully.");
    } 
    catch (IOException e)
    {
        System.out.println("An error occurred while writing to the diary file."+e);
        e.printStackTrace();
    }
}
private static void readFile() //function to read the file
{
    try
    {
         File fPath = new File("D:\\jpmorgan practice\\file_Management\\text.txt");
    if(!fPath.exists())
    {
        throw new FileNotFoundException("Where file?");
    }
    Scanner sc=new Scanner(fPath);
    while(sc.hasNextLine())
    System.out.println(sc.nextLine());
    }
    catch(FileNotFoundException e)
    {
        System.out.println("File not found"+ e.getMessage());
    }
   

}
private static void appendToFile() //function to append to file
{
    try
    {
        File fPath = new File("D:\\jpmorgan practice\\file_Management\\text.txt");
        if(!fPath.exists())
        {
            System.out.println("doesnt exist only");
           createAndWriteFile();
           return; 
        }
        System.out.println("enter your diary entry");
        String entry=scanner.nextLine();
        FileWriter fileWriter = new FileWriter(fPath,true);
            
        Date curDate = new Date();
            String Date = curDate.toString();
            fileWriter.write(Date + "\n");
            fileWriter.write(entry + "\n");
            fileWriter.close();

            System.out.println("Diary entry saved successfully.");
    }
    catch (IOException e)
        {
            System.out.println(""+e);
            e.printStackTrace();
        }
    }
    private static void listFilesAndDirectories() //function to list files and dirs
    {
        System.out.print("Enter the directory path: ");
        String directoryPath = scanner.nextLine();
        File directory = new File(directoryPath);
        if (!directory.exists()||  !directory.isDirectory()) {
            System.out.println("Directory does not exist or is not a directory.");
            return;
            }
            String[] fileList = directory.list();
            if (fileList != null) {
            for (String file : fileList) {
            System.out.println(file);
            }
            }
    }
   private static void filterAndListTxtFiles() //function to filter files based on type
   { 
    System.out.print("Enter the directory path to filter .txt files: ");
    String directoryPath = scanner.nextLine();
    File directory = new File(directoryPath);
    if (!directory.exists()||!directory.isDirectory()) {
    System.out.println("Directory does not exist or is not a directory.");
    return;
    }
    File[] files = directory.listFiles((dir, name)-> name.endsWith(".txt"));
 if (files != null) {
 for (File file : files) {
 System.out.println(file.getName());
 }
 }
   }
   private static void deleteSpecificFile() { //function to delete file data
    System.out.print("Enter the file name to delete: ");
    String fileName = scanner.nextLine();
    File file = new File(fileName);
    if (!file.exists()) {
    System.out.println("File does not exist.");
    return;
    }
    if (file.delete()) {
    System.out.println("File deleted successfully.");
    } else {
    System.out.println("File could not be deleted.");
    }
    }
   private static void copyFileContent() //Functino to copy file content
   {
    try
    {
         System.out.print("Enter source file path: ");
        String sourcePath = scanner.nextLine();
        System.out.print("Enter destination file path: ");
        String destPath = scanner.nextLine();
        Path source = Paths.get(sourcePath);
        Path destination = Paths.get(destPath);
        Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("File copied successfully.");
    }
    catch(IOException e)
    {
        System.out.println("Exception");
    }
       
   }
   private static void renameFile() { //Function to rename a file
    System.out.print("Enter current file name: ");
    String currentName = scanner.nextLine();
    System.out.print("Enter new file name: ");
    String newName = scanner.nextLine();
    File file = new File(currentName);
    File newFile = new File(newName);
    // Check if the file exists before renaming
    if (!file.exists()) {
    System.out.println("File does not exist.");
    return;
    }
    if (file.renameTo(newFile)) {
    System.out.println("File renamed successfully.");
   } else {
    System.out.println("File could not be renamed.");
    }
    }
    private static void displayFileMetadata() { //function to display file Meta data
        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);
        if (!file.exists()) { // Check if the file exists 
        System.out.println("File does not exist.");
        return;
        }
        System.out.println("File Metadata:");
        System.out.println("Size: " + file.length() + " bytes");
        System.out.println("Last Modified: " + new Date(file.lastModified()));
        }
        private static void recursiveDirectoryListing() {
            System.out.print("Enter the directory path: ");
            String directoryPath = scanner.nextLine();
            File directory = new File(directoryPath);
            if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Directory does not exist or is not a directory.");
            return;
            }
            System.out.println("Recursive Directory Listing:");
            listDirectory(directory, 0);
            }
            private static void listDirectory(File dir, int level) {
                if (!dir.isDirectory()) {
                return;
                }
                File[] files = dir.listFiles();
                if (files != null) {
                for (File file : files) {
                for (int i = 0; i < level; i++) {
               System.out.print(" ");
                }
                System.out.println(file.getName());
                if (file.isDirectory()) {
                listDirectory(file, level + 1);
                }
                }
            }}           
    }