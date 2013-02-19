package no.jaf.demo.demo.business.logging;

import java.io.Serializable;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

//@PerformanceLogged
//@Interceptor
public class PerformanceLogger implements Serializable {

    public PerformanceLogger() {
    }

    /*
    @AroundInvoke
    public Object logMethodEntry(InvocationContext invocationContext)
            throws Exception {
        System.out.println("Entering method: "
                + invocationContext.getMethod().getName() + " in class "
                + invocationContext.getMethod().getDeclaringClass().getName());

        return invocationContext.proceed();
    }*/

    @AroundInvoke
    public Object measureTime(InvocationContext ctx) throws Exception {
        long beforeTime = System.currentTimeMillis();
        Object obj;
        try {
            obj = ctx.proceed();
            return obj;
        } finally {
            System.out.println(ctx.getMethod().getDeclaringClass().getName() + "." + ctx.getMethod().getName() + ": " + (System.currentTimeMillis() - beforeTime));
        }
    }
}