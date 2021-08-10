package mixed;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
@Conditional(NumberOddCondition.class)
public class NumberOdd {

    @PostConstruct
    private void init(){
        System.out.println("Odd is active");
    }

}
