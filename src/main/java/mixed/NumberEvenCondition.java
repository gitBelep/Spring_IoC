package mixed;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class NumberEvenCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata md) {
        if (context.getEnvironment().containsProperty("even")) {
            return Boolean.parseBoolean(context.getEnvironment().getProperty("even"));
        } else {
            return false;
        }
    }

}
