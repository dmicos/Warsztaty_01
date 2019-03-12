package site;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;

public class PopularWords {
    public static String[] filter = new String[]{"oraz", "ostatnia", "ponieważ"};

    public static void main(String[] args) {
        Connection connect = Jsoup.connect("http://www.onet.pl/");
        try (
                BufferedWriter writer = new BufferedWriter(new FileWriter("popular_words.txt"))
        ) {
            Document document = connect.get();
            Elements links = document.select("span.title");
            for (Element elem : links) {
                for (String word : elem.text().replaceAll("\\p{Punct}", " ").toLowerCase().split("\\s+")) {
                    if (word.length() > 3) {
                        writer.write(word);
                        writer.newLine();
                    }
                }
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        filteredWords();
    }

    public static void filteredWords() {
        try (
                BufferedReader reader = new BufferedReader(new FileReader("popular_words.txt"));
                BufferedWriter writer = new BufferedWriter(new FileWriter("filtered_popular_words.txt"))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!checkFilter(line)) {
                    writer.write(line);
                    System.out.println(
                            line
                    );
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static boolean checkFilter(String word) {
        for (String filterWords : filter) {
            if (filterWords.equals(word)) {
                return true;
            }
        }
        return false;
    }
}
