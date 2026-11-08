package software.ulpgc.kata2;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        String str = "Hola mundo";
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(bytes));
        System.out.println(new String(bytes, StandardCharsets.UTF_8));
    }
}
