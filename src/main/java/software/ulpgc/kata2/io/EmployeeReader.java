package software.ulpgc.kata2.io;

import software.ulpgc.kata2.model.Employee;
import java.util.List;

public interface EmployeeReader {
    List<Employee> load();
}
