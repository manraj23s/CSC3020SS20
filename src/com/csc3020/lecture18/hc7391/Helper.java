package csc3020.lecture18.hc7391;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Helper {
    static FileReader openReader(String filePath) throws FileNotFoundException {
        return new FileReader((filePath));
    };

    static FileWriter openWriter(String filePath)throws IOException {
        return new FileWriter(filePath);
    }
}