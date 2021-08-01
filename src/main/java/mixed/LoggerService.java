package mixed;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class LoggerService implements ApplicationListener<EmpCreatedEvent>{

    @Override
    public void onApplicationEvent(EmpCreatedEvent empCreatedEvent) {
        String name = empCreatedEvent.getName();
        System.out.println("Event: "+ name + " created");
    }

}
