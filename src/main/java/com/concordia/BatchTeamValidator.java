package com.concordia;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BatchTeamValidator {
    @Autowired
    FactoryClass factoryClass;

    @Autowired
    HelperClass helperClass;

    public boolean validateAllPossibleTeams(){
        for (int i=0; i< factoryClass.getMaxNumberOfTeams()-(factoryClass.existingTeams.size()); i++) {
            factoryClass.generateRandomTeam();
        }
        for (Team team: factoryClass.existingTeams){
            if (!helperClass.validateTeam(team)) {
                return false;
            }
        }
        return true;
    }
}
