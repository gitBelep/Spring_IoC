package mixed;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import java.util.concurrent.atomic.AtomicInteger;

@Component
@Aspect
public class CounterAspect {
    private AtomicInteger counter = new AtomicInteger();


    @Before("execution(* mixed.EmpService.*(..))")
    public void inc(){
        counter.incrementAndGet();
    }

    public int getCounter(){
        return counter.get();
    }

    public void resetCounter(){
        counter.set(0);
    }

}
