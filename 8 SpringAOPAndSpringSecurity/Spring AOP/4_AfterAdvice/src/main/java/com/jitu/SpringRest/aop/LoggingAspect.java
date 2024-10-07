package com.jitu.SpringRest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    private static final Logger LOGGER= LoggerFactory.getLogger(LoggingAspect.class);


//    syntax - execution(<return type> <fully qualified class-name>.<args>) **PointCut

    @Before("execution(* com.jitu.SpringRest.service.JobService.getjob(..) ) || execution(* com.jitu.SpringRest.service.JobService.updatejob(..) )")       //**PointCut
    public void LogMethodCall(JoinPoint jp){

        LOGGER.info("Method Called: "+jp.getSignature().getName());
        //Method Called get

//        LOGGER.info(String.valueOf(jp.getSignature()));
        //JobPost com.jitu.SpringRest.service.JobService.getjob

    }


    @After("execution(* com.jitu.SpringRest.service.JobService.getjob(..) ) || execution(* com.jitu.SpringRest.service.JobService.updatejob(..) )")       //**PointCut
    public void LogMethodExecuted(JoinPoint jp){

        LOGGER.info("Method Executed: "+jp.getSignature().getName());

    }



    @AfterThrowing("execution(* com.jitu.SpringRest.service.JobService.getjob(..) ) || execution(* com.jitu.SpringRest.service.JobService.updatejob(..) )")       //**PointCut
    public void LogMethodCrash(JoinPoint jp){

        LOGGER.info("Method Has some issues: "+jp.getSignature().getName());

    }


    @AfterReturning("execution(* com.jitu.SpringRest.service.JobService.getjob(..) ) || execution(* com.jitu.SpringRest.service.JobService.updatejob(..) )")       //**PointCut
    public void LogMethodExecutedSuccessfully(JoinPoint jp){

        LOGGER.info("Method Executed Successfully: "+jp.getSignature().getName());

    }

}
