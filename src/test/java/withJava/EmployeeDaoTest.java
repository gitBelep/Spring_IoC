package withJava;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class EmployeeDaoTest {
//a)    private EmpDao dao = Mockito.mock(EmpDao.class);
//a)    private EmpService eSe = new EmpService(dao);
// or b)
    @Mock
    private EmpDao dao;

    @InjectMocks
    private EmpService eSe;


    @Test
    void testSaveAndList(){
        eSe.saveEmp("Csőrös");
        //was there a call with this param?
        verify(dao).saveEmp("Csőrös");
    }

}
