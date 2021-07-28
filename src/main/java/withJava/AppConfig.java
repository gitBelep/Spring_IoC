package withJava;

import org.springframework.context.annotation.*;

@Configuration
@Lazy                         //NotNeededBean wont be created
public class AppConfig {

    @Bean
    @DependsOn("initBean")    //InitBean must be created first
    @Scope("prototype")       //independent EmpDao-s for the two empService-s..
    public EmpDao empDao(){
        System.out.println("@Bean: empDao");
        return new EmpDao();
    }

    @Bean
    public EmpService empService(){
        System.out.println("@Bean: empService");
        return new EmpService(empDao());
    }

    @Bean(initMethod = "init")   //must run after creating
    public EmpService2 empService2(){
        System.out.println("@Bean: empService2");
        return new EmpService2(empDao());
    }

    @Bean
    public NotNeededBean notNeededBean(){
        System.out.println("@Bean: notNeededBean");
        return new NotNeededBean();
    }

    @Bean
    public InitBean initBean(){
        System.out.println("@Bean: initBean");
        return new InitBean();
    }

}
