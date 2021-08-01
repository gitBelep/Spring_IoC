package mixed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackageClasses = AppConfig.class)
@ImportResource("classpath:/appl-context-mixed.xml")
@PropertySource("classpath:/app.properties")
public class AppConfig {

    @Autowired
    private Environment environment;

    @Bean
    public String printAppVersion(){
        String ver = environment.getProperty("version");
        System.out.println(ver);
        System.out.println(environment.getProperty("OS") + ": type of the OP system.");
        return ver;
    }

    // @Autowired
    //    private Environment environment;
    //
    //    @Bean
    //    public String applicationVersion() {
    //        String version = environment.getProperty("application.version");
    //        System.out.println("Version: " + version);
    //        System.out.println("OS: " + environment.getProperty("OS"));
    //        return version;
    //    }
}
