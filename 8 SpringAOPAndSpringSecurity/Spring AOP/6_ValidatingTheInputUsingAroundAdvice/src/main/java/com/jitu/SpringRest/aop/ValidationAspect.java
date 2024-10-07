package com.jitu.SpringRest.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ValidationAspect {

    private static final Logger LOGGER= LoggerFactory.getLogger(ValidationAspect.class);


    @Around("execution(* com.jitu.SpringRest.service.JobService.getjob(..)) && args(postid)")
    public Object ValidateAndUpdate(ProceedingJoinPoint jp, int postid) throws Throwable {

        if(postid<0){
            LOGGER.info("Negative postid found");
            postid=-postid;
            LOGGER.info("postid change to : "+postid);
        }

        Object obj = jp.proceed(new Object[]{postid});



        return obj;
    }



}
