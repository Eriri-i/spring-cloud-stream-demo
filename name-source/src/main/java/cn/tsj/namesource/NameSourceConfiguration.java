package cn.tsj.namesource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Supplier;

@Configuration
public class NameSourceConfiguration {
    @Bean
    public Supplier<String> supplierName(){
        return () -> "coke";
    }
}
