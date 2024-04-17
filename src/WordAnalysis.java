import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordAnalysis {
    public static void main(String[] args) {
        // Осуществить подсчет слов
        try {
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);

            int wordCount = 0;

            while (scanner.hasNext()) {
                scanner.next();
                wordCount++;
            }

            System.out.println("Количество слов в файле: " + wordCount);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
        }

        // Найти самое длинное слово
        try {
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);

            String longestWord = "";

            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }

            System.out.println("Самое длинное слово: " + longestWord);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
        }

        // Вычислить частоту слов
        try {
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);

            Map<String, Integer> wordFrequency = new HashMap<>();

            while (scanner.hasNext()) {
                String word = scanner.next();
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }

            System.out.println("Частота слов в файле:");
            for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
        }
    }
}
