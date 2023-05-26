package cn.tsj.nameprocessor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;
import java.util.function.Function;

@Configuration
public class NameProcessConfiguration {
  @Bean
  public Function<String, Person> processName() {
    return name -> new Person(name, new Date().getTime());
  }
}
