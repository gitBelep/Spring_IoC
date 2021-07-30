package mixed;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

//@Service                                      //not needed
public class EmpService {
    private MailServiceFalse eMailFalse;
    private MailServiceOk eMailOk;
    private EmpDao dao;                         //interface

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
