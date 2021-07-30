package mixed;

import org.springframework.stereotype.Component;

@Component
public class MailServiceOk {

    public void send(){
        System.out.println(" * E-mail * ");
    }

}
