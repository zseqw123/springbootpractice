package tw.fang.springbootdemo.server;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


    @Bean
    @ConditionalOnBean(value = OrderService.class)
    public UserService userService(){
        return new UserService();
    }


}
