package software.ulpgc.kata2;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://raw.githubusercontent.com/sachin365123/CSV-files-for-Data-Science-and-Machine-Learning/refs/heads/main/Employee%20Dataset%20-%20TSV.txt");
        try (InputStream is = url.openStream();
        OutputStream os = new FileOutputStream("Empleado.tsv")){
            byte[] bytes = is.readAllBytes();
            os.write(bytes);
        }
    }
}
