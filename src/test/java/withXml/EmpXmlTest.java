package withXml;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "classpath:/appl-context.xml")
class EmpXmlTest {

    @Autowired
    private EmployeeService eSe;

    @Test
    void saveAndList(){
        eSe.saveEmp("Ünő");
        eSe.saveEmp("Kőrisfás");
        List<String> employees = eSe.listEmp();

        assertEquals(2, employees.size());
        assertEquals("Kőrisfás", employees.get(employees.size() - 1));
    }

}
