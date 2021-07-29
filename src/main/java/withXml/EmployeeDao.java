package withXml;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
    List<EmployeeX> employees = new ArrayList<>();

    public void saveEmp(String name){
        employees.add(new EmployeeX(name));
    }

    public List<String> listEmp(){
        List<String> result = new ArrayList<>();
        for(EmployeeX e : employees){
            result. add(e.getName());
        }
        return result;
    }
}
