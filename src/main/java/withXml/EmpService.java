package withXml;

import java.util.List;

public class EmpService {
    private EmpDao dao;

    public EmpService(EmpDao dao) {
        this.dao = dao;
    }


    public void saveEmp(String rawName){
        String trimmedName = rawName.trim();
        dao.saveEmp(trimmedName);
    }

    public List<Employee> listEmp(){
        return dao.listEmp();
    }

    public EmpDao getDao() {
        return dao;
    }

    public void setDao(EmpDao dao) {
        this.dao = dao;
    }

}
