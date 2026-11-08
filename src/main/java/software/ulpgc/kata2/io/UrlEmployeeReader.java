package software.ulpgc.kata2.io;

import software.ulpgc.kata2.model.Employee;
import software.ulpgc.kata2.model.Gender;

import java.io.*;
import java.net.URL;
import java.util.List;
import java.util.ArrayList;


public class UrlEmployeeReader implements EmployeeReader {

    public UrlEmployeeReader(URL url) {
        this.url = url;
    }

    private final URL url;

    @Override
    public List<Employee> load() {
        try (InputStream is = url.openStream()){
            return loadFrom(is);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    private List<Employee> loadFrom(InputStream is) throws IOException{
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
            return loadFrom(reader.lines().toList());
        }
    }

    private List<Employee> loadFrom(List<String> lines) {
        List<Employee> list = new ArrayList<>();
        for (int i=1;i<lines.size();i++){
            list.add(loadFrom(lines.get(i)));
        }
        return list;
    }

    private Employee loadFrom(String line){
        return loadFrom(line.split("\t"));
    }

    private Employee loadFrom(String[] fields) {
        String genderStr = (fields.length > 5 && (fields[5].equals("Male") ||fields[5].equals("Female")))
                ? fields[5]
                : (fields.length > 1 ? fields[1] : "");
        return new Employee(fields[0], Gender.from(genderStr));
    }
}
