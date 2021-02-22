package com.hdyl.daily.config;

import com.hdyl.daily.aop.InoutBoundAroundAop;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @Author:zrt
 * @Date:2021/2/20 23:52
 * @version:1.0
 */
@EnableConfigurationProperties(value = AopProperties.class)
@Configuration
public class AopAutoConfiguration {

   @Bean
   public InoutBoundAroundAop inoutBoundAroundAop(){
          return new InoutBoundAroundAop();
   }
}
