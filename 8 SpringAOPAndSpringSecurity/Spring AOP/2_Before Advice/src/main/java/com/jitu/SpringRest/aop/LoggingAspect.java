package com.jitu.SpringRest.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    private static final Logger LOGGER= LoggerFactory.getLogger(LoggingAspect.class);


//    syntax - execution(<return type> <fully qualified class-name>.<method-name>(<args>))

    @Before("execution(* com.jitu.SpringRest.service.JobService.*(..) )")
    public void LogMethodCall(){

        LOGGER.info("Before AOP  called!");

    }

}
