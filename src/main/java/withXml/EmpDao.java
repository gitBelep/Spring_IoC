package withXml;

import java.util.ArrayList;
import java.util.List;

public class EmpDao {
    List<Employee> employees = new ArrayList<>();

    public void saveEmp(String name){
        employees.add(new Employee(name));
    }

    public List<Employee> listEmp(){
        return new ArrayList<>(employees);
    }

}
