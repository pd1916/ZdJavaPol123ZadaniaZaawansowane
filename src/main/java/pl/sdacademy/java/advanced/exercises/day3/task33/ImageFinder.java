package pl.sdacademy.java.advanced.exercises.day3.task33;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ImageFinder {

    public static List<String> find(Path director) {
        try (Stream<Path> walk = Files.walk(director)) {
            return walk
                    .map(Path::toFile)
                    .map(File::getName)
                    .filter(name -> name.endsWith(".png") || name.endsWith(".jpg"))
                    .collect(Collectors.toList());
        } catch(IOException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
