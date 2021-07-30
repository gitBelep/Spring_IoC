package mixed;
import javax.annotation.PostConstruct;
import java.util.List;

public interface EmpDao {

    void saveEmp(String name);

    List<String> listEmp();

    @PostConstruct
    default void initMethod(){
        System.out.println(this.getClass().getCanonicalName() + " default init");
    }

}
