package software.ulpgc.kata2;

import software.ulpgc.kata2.io.UrlEmployeeReader;
import software.ulpgc.kata2.model.Employee;

import java.io.*;
import java.net.URL;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://raw.githubusercontent.com/sachin365123/CSV-files-for-Data-Science-and-Machine-Learning/refs/heads/main/Employee%20Dataset%20-%20TSV.txt");
        List<Employee> employees = new UrlEmployeeReader(url).load();
        for (Employee employee : employees){
            System.out.println(employee);
        }
    }
}
