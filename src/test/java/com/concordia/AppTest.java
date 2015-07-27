package com.concordia;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConfigClass.class)
public class AppTest
{
    public AppTest() {
    }

    @Autowired
    Player player;

    @Autowired
    Trainer trainer;

    @Autowired
    Team team;

    @Autowired
    Team team2;

    @Autowired
    Team team3;

    @Autowired
    HelperClass helperClass;

    @Autowired
    BatchTeamValidator batchTeamValidator;

    @Autowired
    FactoryClass factoryClass;

    @Test
    public void playersAreValid() {
        Assert.assertTrue(helperClass.validatePlayer(player));
        Assert.assertTrue(helperClass.validatePlayer(factoryClass.generateRandomPlayer()));
    }

    @Test
    public void trainersAreValid() {
        Assert.assertTrue(helperClass.validateTrainer(trainer));
        Assert.assertTrue(helperClass.validateTrainer(factoryClass.generateRandomTrainer()));
    }

    @Test
    public void teamsAreValid() {
        Assert.assertTrue(helperClass.validateTeam(team));
        Assert.assertTrue(helperClass.validateTeam(team2));
        Assert.assertTrue(helperClass.validateTeam(team3));
        Assert.assertTrue(helperClass.validateTeam(factoryClass.generateRandomTeam()));
        Assert.assertTrue(batchTeamValidator.validateAllPossibleTeams());
    }


}