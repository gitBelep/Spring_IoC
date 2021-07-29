package withAnnotationsOnly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmpServiceAnn {
    private EmpDaoAnn dao;

    @Autowired                  //not necessary, because there is only one constructor
    public EmpServiceAnn(EmpDaoAnn dao) {
        this.dao = dao;
    }

    public void saveEmp(String rawName){
        String trimmedName = rawName.trim();
        dao.saveEmp(trimmedName);
    }

    public List<String> listEmp(){
        return dao.listEmp();
    }

    public EmpDaoAnn getDao() {
        return dao;
    }

    public void setDao(EmpDaoAnn dao) {
        this.dao = dao;
    }

}
