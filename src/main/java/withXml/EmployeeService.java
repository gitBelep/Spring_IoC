package withXml;

import java.util.List;

public class EmployeeService {
    private EmployeeDao dao;

    public EmployeeService(EmployeeDao dao) {
        this.dao = dao;
    }


    public void saveEmp(String rawName){
        String trimmedName = rawName.trim();
        dao.saveEmp(trimmedName);
    }

    public List<String> listEmp(){
        return dao.listEmp();
    }

    public EmployeeDao getDao() {
        return dao;
    }

    public void setDao(EmployeeDao dao) {
        this.dao = dao;
    }

}
