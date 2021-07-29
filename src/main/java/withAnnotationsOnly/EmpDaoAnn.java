package withAnnotationsOnly;

import org.springframework.stereotype.Repository;
import withXml.EmployeeX;
import java.util.ArrayList;
import java.util.List;

@Repository
public class EmpDaoAnn {
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
