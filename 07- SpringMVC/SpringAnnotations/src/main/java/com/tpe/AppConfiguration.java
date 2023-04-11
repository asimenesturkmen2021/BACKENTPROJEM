package com.tpe;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration//bu classta config olacak
@ComponentScan("com.tpe")//bu packagedaki componentları tara, default: "com.tpe"
public class AppConfiguration {

    @Bean//random classından bir tane bean oluşturuluyor.
    public Random random(){
        return new Random();
    }


}
