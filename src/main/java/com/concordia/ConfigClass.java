package com.concordia;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.io.IOException;

@Configuration
@EnableAspectJAutoProxy
public class ConfigClass {

    @Bean
    public LoggerClass getLogger(){return new LoggerClass();}

    FactoryClass factoryClass = new FactoryClass();

    @Bean(name="factory")
    FactoryClass getFactoryClass(){

        return factoryClass;
    }

    @Bean(name = "player")
    Player getPlayer() throws IOException {

        return factoryClass.generateRandomPlayer();
    }

    @Bean(name="team")
    Team getTeam() throws IOException {

        return factoryClass.generateRandomTeam();
    }

    @Bean(name="team2")
    Team getTeam2() throws IOException {

        return factoryClass.generateRandomTeam();
    }

    @Bean(name="team3")
    Team getTeam3() throws IOException {

        return factoryClass.generateRandomTeam();
    }

    @Bean(name="trainer")
    Trainer getTrainer() throws IOException {

        return factoryClass.generateRandomTrainer();
    }

    @Bean(name="helper")
    HelperClass getHelper(){

        return new HelperClass();
    }

    @Bean(name="batchTeamValidator")
    BatchTeamValidator BatchTeamValidator(){

        return new BatchTeamValidator();
    }

}
