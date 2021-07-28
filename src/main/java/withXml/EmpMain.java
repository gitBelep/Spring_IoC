package withXml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.List;

public class EmpMain {

    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)){
            EmpDao dao1 = (EmpDao) context.getBean("empDao");
            EmpDao dao2 = context.getBean(EmpDao.class);
            System.out.println("dao 1&2 are the same: "+ dao1 +" "+dao2);

            dao1.saveEmp("Aba");
            dao2.saveEmp("Samu");
            EmpService empService = context.getBean(EmpService.class);
            empService.saveEmp("Xavér");

            List<Employee> emps = empService.listEmp();
            System.out.print(emps.size());
            for(Employee e : emps) {
                System.out.print(", " + e.getName());
            }
        }
    }

}
