package com.jitu.SpringRest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    private static final Logger LOGGER= LoggerFactory.getLogger(LoggingAspect.class);


//    syntax - execution(<return type> <fully qualified class-name>.<method-name>(<args>))  //Pointcut

    @Before("execution(* com.jitu.SpringRest.service.JobService.getjob(..) ) || execution(* com.jitu.SpringRest.service.JobService.updatejob(..) )")       //**PointCut
    public void LogMethodCall(JoinPoint jp){

        LOGGER.info("Method Called: "+jp.getSignature().getName());
        //Method Called get

//        LOGGER.info(String.valueOf(jp.getSignature()));
        //JobPost com.jitu.SpringRest.service.JobService.getjob

    }

}
