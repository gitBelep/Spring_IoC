package withXml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public EmpDao empDao(){
        return new EmpDao();
    }

    @Bean
    public EmpService empService(){
        return new EmpService(empDao());
    }

}
