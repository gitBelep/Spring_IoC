package withAnnotationsOnly;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = AppConfigAnn.class)
public class AppConfigAnn {
}
