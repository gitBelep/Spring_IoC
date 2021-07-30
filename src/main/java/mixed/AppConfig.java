package mixed;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackageClasses = AppConfig.class)
@ImportResource("classpath:/appl-context-mixed.xml")
public class AppConfig {

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
