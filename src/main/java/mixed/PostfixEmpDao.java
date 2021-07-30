package mixed;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
@PostfixDao
public class PostfixEmpDao implements EmpDao {
    List<Employee> employees = new ArrayList<>();

    @Override
    public void saveEmp(String name){
        employees.add(new Employee(name));
    }

    @Override
    public List<String> listEmp(){
        List<String> result = new ArrayList<>();
        for(Employee e : employees){
            result. add( e.getName() +" ("+ e.getName().length() +")" );
        }
        return result;
    }

}
