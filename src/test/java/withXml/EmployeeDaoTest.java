package withXml;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class EmployeeDaoTest {
    private EmpDao dao = Mockito.mock(EmpDao.class);
    private EmpService eSe = new EmpService(dao);

    @Test
    void testSaveAndList(){
        eSe.saveEmp("Csőrös");
        //was there a call with this param?
        verify(dao).saveEmp("Csőrös");
    }

}
