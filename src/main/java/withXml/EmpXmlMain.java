package withXml;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

public class EmpXmlMain {

    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext ctx =
                    new ClassPathXmlApplicationContext("/appl-context.xml")){
            EmployeeService service = ctx.getBean(EmployeeService.class);
            service.saveEmp("Ünő");
            service.saveEmp("Kőrisfás");

            List<String> emloyees = service.listEmp();
            System.out.println(emloyees.size() +" "+ emloyees);
        }
    }

}
