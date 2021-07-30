package mixed;

import java.util.List;

//@Service                                      //not needed
public class EmpService {
    private EmpDao dao;                         //interface

    public EmpService(@SimpleDao EmpDao dao) {  //which class
        this.dao = dao;
        System.out.println("created EmpService");
    }


    public void saveEmp(String rawName){
        String trimmedName = rawName.trim();
        dao.saveEmp(trimmedName);
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
