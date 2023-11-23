package  FileWalk;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
public class Main{
    public static void main(String[] args) throws IOException {
        Path rootDir = Paths.get("C:\\Users\\user\\Documents\\notes\\Y2\\MATH");

        Files.walkFileTree(rootDir, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                System.out.println("Found file: " + file);
                return FileVisitResult.CONTINUE;
            }
            @Override
            public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
                System.err.println("Error accessing file: " + file + " - " + exc.getMessage());
                return FileVisitResult.CONTINUE;
            }
        });
    }
}
