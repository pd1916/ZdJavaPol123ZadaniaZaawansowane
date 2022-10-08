package pl.sdacademy.java.advanced.exercises.day3.task30;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Task30 {

    public static void main(String[] args) throws IOException {
//        String product = "Ala";
//        product = product.toLowerCase();
//        product += " ma ";
//        product += "kota";
//        System.out.println(product);
//
//        StringBuilder sb = new StringBuilder("Ola");
//        sb.reverse();
//        System.out.println(sb);
        Path dirPath = Path.of("src/main/java/pl/sdacademy/java/advanced/exercises/day3/task30");
        Path inputFile = dirPath.resolve("course.txt");
        if(!inputFile.toFile().exists()) {
            System.out.println("Plik nie istnieje");
            return;
        }
        List<String> fileContent = getFileContent(inputFile);
        System.out.println("Input: " + fileContent);

        List<String> reversedFileContent = reverseFileContent(fileContent);
        System.out.println("Reversed: " + reversedFileContent);

        Path outputFile = reverseFileName(inputFile);

        saveFile(outputFile, reversedFileContent);
    }

    private static List<String> getFileContent(Path inputFile) throws IOException {
        return Files.readAllLines(inputFile, StandardCharsets.UTF_8);
    }

    private static List<String> reverseFileContent(List<String> input) {
        return input.stream()
                .map(s -> new StringBuilder(s).reverse().toString())
                .collect(Collectors.toList());
    }

    private static Path reverseFileName(Path inputFile) {
        // "src/main/java/pl/sdacademy/java/advanced/exercises/day3/task30/course.txt"
        // course.txt -> esruoc.txt
        // "src/main/java/pl/sdacademy/java/advanced/exercises/day3/task30/esruoc.txt"
        String fileName = inputFile.toFile().getName(); //course.txt
        String fileExtension = "";
        int index = fileName.indexOf('.');
        if(index > 0) { //gdy index większy od 0 to tzn że kropka jest w nazwie
            fileExtension = fileName.substring(index); // .txt
            fileName = fileName.substring(0, index); // course.txt
        }
        String reversedName = new StringBuilder(fileName).reverse().append(fileExtension).toString();
        return inputFile.getParent().resolve(reversedName);
    }

    private static void saveFile(Path outputFile, List<String> content) throws IOException {
        Files.write(outputFile, content, StandardCharsets.UTF_8);
    }

}
