package mixed;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmpServiceWithMultipleDao {
    private List<EmpDao> daoList;

    public EmpServiceWithMultipleDao(List<EmpDao> daoList) {
        this.daoList = daoList;
        System.out.println("created multiple "+ daoList);
    }

    public void saveEmp(String name){
        for(EmpDao dao : daoList){
            dao.saveEmp(name);
        }
    }

    public List<String> listEmp(){
        List<String> result = new ArrayList<>();
        for(EmpDao dao : daoList){
            result.addAll( dao.listEmp() );
//          result.add( dao.listEmp().toString() );   //names are not separate Strings
        }
        return result;
    }

}
