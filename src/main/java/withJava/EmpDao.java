package withJava;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

public class EmpDao {
    List<Employee> employees = new ArrayList<>();

    @PostConstruct          //must run immediately after creating an EmpDao
    public void initMethod(){
        System.out.println("EmpDao init");
    }

    public void saveEmp(String name){
        employees.add(new Employee(name));
    }

    public List<String> listEmp(){
        List<String> result = new ArrayList<>();
        for(Employee e : employees){
            result. add(e.getName());
        }
        return result;
    }

}
