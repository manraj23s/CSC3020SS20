package csc3020.lecture16.gp7633;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Helper {
    static FileReader openReader(String filePath) throws FileNotFoundException {
        return new FileReader(filePath);
    }
}
