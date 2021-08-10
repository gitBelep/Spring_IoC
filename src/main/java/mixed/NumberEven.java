package mixed;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
@Conditional(NumberEvenCondition.class)
public class NumberEven {

    @PostConstruct
    private void init(){
        System.out.println("Even is active");
    }

}
