package com.ruoyi.onfire.aop;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.framework.datasource.DynamicDataSourceContextHolder;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class FireDataSourceAspect {

    @Pointcut(value = "execution(* com.ruoyi.onfire.service..*.*(..))")
    public void servicePoint(){}

    @Around("servicePoint()")
    public Object around(ProceedingJoinPoint point) throws Throwable
    {
        try
        {
            // 固定走从库
            DynamicDataSourceContextHolder.setDataSourceType(DataSourceType.SLAVE.name());
            return point.proceed();
        }
        finally
        {
            // 销毁数据源 在执行方法之后
            DynamicDataSourceContextHolder.clearDataSourceType();
        }
    }

}
