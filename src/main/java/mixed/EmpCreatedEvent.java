package mixed;

import org.springframework.context.ApplicationEvent;

public class EmpCreatedEvent extends ApplicationEvent {
    private  String name;

    public EmpCreatedEvent(Object source, String name){
        super(source);
//        System.out.println(">>>  Source is an: "+ source);   //mixed.EmpService@4218500f
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
