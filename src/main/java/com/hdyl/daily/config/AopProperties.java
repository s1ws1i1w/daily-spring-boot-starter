package com.hdyl.daily.config;

import com.hdyl.daily.aop.InoutBoundAroundAop;
import lombok.Data;
import org.springframework.aop.aspectj.AspectJExpressionPointcutAdvisor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Author:zrt
 * @Date:2021/2/20 23:30
 * @version:1.0
 */
@Component
@ConfigurationProperties(prefix = "aop.daily")
@Data
public class AopProperties {

    /**
     * 切入点表达式
     */
    private String poinCut;

    @Bean
    public AspectJExpressionPointcutAdvisor configurabledvisor(){
        AspectJExpressionPointcutAdvisor advisor = new AspectJExpressionPointcutAdvisor();
        advisor.setExpression(poinCut);
        advisor.setAdvice(new InoutBoundAroundAop());
        return advisor;
    }
}
