package withJava;

import java.util.List;

public class EmpService2 {
    private EmpDao dao;

    public EmpService2(EmpDao dao) {
        this.dao = dao;
    }

    public void init(){
        System.out.println("EmpService2 init");
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

    public void setDao(EmpDao dao) {
        this.dao = dao;
    }

}
