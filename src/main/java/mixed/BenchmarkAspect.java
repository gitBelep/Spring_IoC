package mixed;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@Aspect
public class BenchmarkAspect {

    @Around("execution(* mixed.EmpService.*(..))")
    public Object messExecution(ProceedingJoinPoint pjp) throws Throwable{
        long startTime = System.currentTimeMillis();
        Object[] params = pjp.getArgs();
        if(params.length == 1 && params[0] instanceof String){
            params[0] = ((String) params[0]).toUpperCase().concat(" új név");
        }
//      Object result = pjp.proceed();
        pjp.proceed(params);
        long endTime = System.currentTimeMillis();
        System.out.println("-> "+ pjp.getSignature().getName() +" "+ (endTime-startTime));
//      return result;
        return List.of("I am ready");
    }

}
