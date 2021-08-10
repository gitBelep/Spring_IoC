package mixed;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import java.util.List;

//@Service                                      //not needed
public class EmpService {
    private MailServiceFalse eMailFalse;
    private MailServiceOk eMailOk;
    private ApplicationEventPublisher publisher;
    private EmpDao dao;                         //interface
    private final static Logger LOGGER = LoggerFactory.getLogger(EmpService.class);

    public EmpService(@SimpleDao EmpDao dao) {  //which class
        this.dao = dao;
        System.out.println("created EmpService");
    }

    @Autowired(required = false)
    public void seteMailOk(MailServiceOk eMailOk) {
        this.eMailOk = eMailOk;
    }

    @Autowired(required = false)                    //it wont be injected
    public void seteMailFalse(MailServiceFalse eMailFalse) {
        this.eMailFalse = eMailFalse;
    }

    public void saveEmp(String rawName){
        String trimmedName = rawName.trim();
        dao.saveEmp(trimmedName);

        if(eMailFalse != null) eMailFalse.send2();   //it IS null
        if(eMailOk != null) eMailOk.send();

        if(publisher != null){
            EmpCreatedEvent event = new EmpCreatedEvent(this, trimmedName);
            publisher.publishEvent(event);
        }

        LOGGER.info("Employee has created with name: "+ trimmedName +"  ~ logger");
    }

    @Autowired(required = false)
    public void setPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public List<String> listEmp(){
        return dao.listEmp();
    }

    public EmpDao getDao() {
        return dao;
    }

    public void setDao(SimpleEmpDao dao) {
        this.dao = dao;
    }

}
