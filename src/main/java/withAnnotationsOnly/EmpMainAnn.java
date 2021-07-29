package withAnnotationsOnly;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.List;

public class EmpMainAnn {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(AppConfigAnn.class)) {
            EmpServiceAnn service = context.getBean(EmpServiceAnn.class);
            service.saveEmp("  Ünő Ann ");
            service.saveEmp("KőrisfásAnn    ");

            List<String> emloyees = service.listEmp();
            System.out.println(emloyees.size() + " " + emloyees);
        }
    }

}
