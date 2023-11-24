import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // Specify the directory path
        String directoryPath = "/home/rex/Desktop/studies/y2/java/practice/study/directories/new_directory";

        // Specify the file name
        String fileName = "file.txt";

        // Create the directory
        createDirectory(directoryPath);

        // Create the file within the directory
        String filePath = directoryPath + File.separator + fileName;
        createFile(filePath);

        // Write content to the file
        String contentToWrite = "Hello, this is the content written to the file!";
        writeToFile(filePath, contentToWrite);

        // Read the content from the file
        String contentRead = readFromFile(filePath);
        System.out.println("Content read from the file:\n" + contentRead);
    }

    private static void createDirectory(String directoryPath) {
        File directory = new File(directoryPath);

        if (!directory.exists()) {
            boolean created = directory.mkdirs();
            if (created) {
                System.out.println("Directory created successfully.");
            } else {
                System.err.println("Failed to create directory.");
            }
        } else {
            System.out.println("Directory already exists.");
        }
    }

    private static void createFile(String filePath) {
        File file = new File(filePath);

        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.err.println("Error creating file: " + e.getMessage());
        }
    }

    private static void writeToFile(String filePath, String content) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(content);
            System.out.println("Content written to the file successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    private static String readFromFile(String filePath) {
        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }

        return content.toString();
    }
}