package software.ulpgc.kata2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("document.txt");
        try (InputStream is = new FileInputStream(file)){
            byte[] bytes = is.readAllBytes();
            System.out.println(new String(bytes));
        }
    }
}
