package mixed;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppConfig.class)
class EmpServiceWithMultipleDaoTest {

    @Autowired
    private EmpServiceWithMultipleDao sm;

    @Autowired
    private EmpService empService;

    @Autowired
    private ApplicationContext context;


    @Test
    void saveEmpWithMultiple() {
        sm.saveEmp("Álmos");
        sm.saveEmp("Előd");

        List<String> names = sm.listEmp();
        System.out.println(names);
        assertTrue(names.contains("Álmos (5)"));
        assertTrue(names.contains("Előd"));
    }

    @Test
    void saveEmpWithSimple() {
        empService.saveEmp("  Álmos");
        empService.saveEmp("Előd  ");

        List<String> names2 = empService.listEmp();
        System.out.println(names2);

        assertTrue(names2.contains("Álmos"));
        assertTrue(names2.contains("Előd"));
    }

    @Test
    void testContext(){
        EmpDao dao2 = (EmpDao) context.getBean("simpleEmpDao");

        assertTrue(dao2 instanceof SimpleEmpDao);
    }

}
