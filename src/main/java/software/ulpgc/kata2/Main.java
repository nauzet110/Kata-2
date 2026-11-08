package software.ulpgc.kata2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("document.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            while (true){
                String line = reader.readLine();
                if (line == null) break;
                System.out.println(line);
            }
        }
    }
}
