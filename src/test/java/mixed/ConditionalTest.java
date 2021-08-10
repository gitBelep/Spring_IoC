package mixed;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppConfig.class)
public class ConditionalTest {

    @Autowired(required = false)
    private NumberOdd nrOdd;

    @Autowired(required = false)
    private NumberEven nrEven;

    //odd = true
    @Test
    void testOdd(){
        assertTrue(nrOdd instanceof NumberOdd);
        assertTrue(nrEven == null);
    }

}
