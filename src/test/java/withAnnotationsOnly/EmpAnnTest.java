package withAnnotationsOnly;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppConfigAnn.class)
class EmpAnnTest {

    @Autowired
    private EmpServiceAnn eSe;

    @Test
    void testSaveThanList() {
        eSe.saveEmp("   Kond  ");

        assertEquals( List.of("Kond"), eSe.listEmp() );
    }

}
