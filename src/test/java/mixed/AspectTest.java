package mixed;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppConfig.class)
public class AspectTest {

    @Autowired
    private CounterAspect counterAspect;

    @Autowired
    private EmpService empService;

    @Test
    void testAnyMethodsInEmpService(){
        counterAspect.resetCounter();
        empService.saveEmp("  Aba");
        empService.saveEmp(" Benő ");
        empService.listEmp();
        empService.saveEmp("Dr. Ede  ");
        empService.listEmp();

        assertEquals(5, counterAspect.getCounter());
    }

}
