package mixed;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class NumberOddCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata md) {
        if (context.getEnvironment().containsProperty("odd")){
            return Boolean.parseBoolean( context.getEnvironment().getProperty("odd") );
        } else {
            return false;
        }
    }

}
