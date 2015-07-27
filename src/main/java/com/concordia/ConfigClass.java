package com.concordia;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

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
    Player getPlayer(){

        return factoryClass.generateRandomPlayer();
    }

    @Bean(name="team")
    Team getTeam(){

        return factoryClass.generateRandomTeam();
    }

    @Bean(name="team2")
    Team getTeam2(){

        return factoryClass.generateRandomTeam();
    }

    @Bean(name="team3")
    Team getTeam3(){

        return factoryClass.generateRandomTeam();
    }

    @Bean(name="trainer")
    Trainer getTrainer(){

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
