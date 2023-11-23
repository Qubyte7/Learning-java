package FileWalk;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main2 {

    public static void main(String[] args) throws IOException {
        Path rootDir = Paths.get("C:\\Users\\user\\Documents\\notes\\Y2\\MATHc ");
        Files.walk(rootDir)
                .filter(Files::isRegularFile)
                .forEach(System.out::println);
    }
}


