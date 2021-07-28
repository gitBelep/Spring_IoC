package withJava;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class EmployeeIntegrationTest {

    @Test
    void testSaveAndList(){
        try(AnnotationConfigApplicationContext ctx =
                    new AnnotationConfigApplicationContext(AppConfig.class)){
            EmpService empService = ctx.getBean(EmpService.class);
            empService.saveEmp("Őűéá");

            assertEquals(List.of("Őűéá"), empService.listEmp());
        }
    }

}
