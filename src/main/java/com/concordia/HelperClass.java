package com.concordia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
@EnableAspectJAutoProxy
public class HelperClass {

    @Autowired
    FactoryClass factoryClass;

    List<Position> positionList=new ArrayList<Position>(Position.values().length);
    public HelperClass() {
        for (Position position: Position.values())
            positionList.add(position);
    }

    public boolean validateTeam(Team team){
        if ( team==null) {
            return false;
        }
        if ( team.getName()==null) {
            return false;
        }
        if ( team.getName().trim().equals("")) {
            return false;
        }
        if (team.getTrainer()==null) {
            return false;
        }
        if (team.getPlayers()==null) {
            return false;
        }
        if (team.getPlayers().length!=22) {
            return false;
        }
        for (Player player: team.getPlayers()){
            if (player==null) return false;
        }
        if (team.getYearOfFoundation()==null) {
            return false;
        }
        if (team.getYearOfFoundation()<1920) {
            return false;
        }
        return true;
    }

    public boolean validateTrainer(Trainer trainer){
        if (trainer ==null) {
            return false;
        }
        if (trainer.getFirstName()==null) {
            return false;
        }
        if (trainer.getFirstName().trim().equals("")) {
            return false;
        }
        if(trainer.getFirstName().matches(".*\\d.*")) {
            return false;
        }
        if (trainer.getLastName()==null) {
            return false;
        }
        if (trainer.getLastName().trim().equals("")) {
            return false;
        }
        if(trainer.getLastName().matches(".*\\d.*")) {
            return false;
        }
        if (trainer.getAge()==null) {
            return false;
        }
        if (trainer.getAge()<40) {
            return false;
        }
        if (trainer.getAnnualSalary()==null) {
            return false;
        }
        if (trainer.getAnnualSalary().getAmount()==null) {
            return false;
        }
        if (trainer.getPreviousTeamList()==null) {
            return false;
        }
        if (trainer.getPreviousTeamList().size()<1) {
            return false;
        }
        for (Team team: trainer.getPreviousTeamList()){
            if (team==null) {
                return false;
            }
        }


        return true;
    }

    public boolean validatePlayer(Player player){
        if (player.getFirstName()==null) {
            return false;
        }
        if (player.getFirstName().trim().equals("")) {
            return false;
        }
        if(player.getFirstName().matches(".*\\d.*")) {
            return false;
        }
        if (player.getLastName()==null) {
            return false;
        }
        if (player.getLastName().trim().equals("")) {
            return false;
        }
        if(player.getLastName().matches(".*\\d.*")) {
            return false;
        }
        if (player.getAge()==null) {
            return false;
        }
        if (player.getAge()<20) {
            return false;
        }
        if (player.getAge()>30) {
            return false;
        }
        if (player.getCountryOfBirth()==null) {
            return false;
        }
        if (player.getCountryOfBirth().trim().equals("")) {
            return false;
        }
        if(player.getCountryOfBirth().matches(".*\\d.*")) {
            return false;
        }
        if (player.getAnnualSalary()==null){
            return false;
        }
        if (player.getAnnualSalary().getAmount()==null) {
            return false;
        }
        if (!validatePosition(player.getPosition())) {
            return false;
        }
        if (!validateStatistics(player.getStatisticsClass())) {
            return false;
        }
        return true;
    }

    public boolean validateStatistics(StatisticsClass statisticsClass){
        if (statisticsClass ==null) {
            return false;
        }
        if (statisticsClass.getNumberOfBookings()==null) {
            return false;
        }
        if (statisticsClass.getNumberOfGoals()==null) {
            return false;
        }
        if (statisticsClass.getNumberOfBookings()<0) {
            return false;
        }
        if (statisticsClass.getNumberOfGoals()<0) {
            return false;
        }
        return true;
    }

    public boolean validatePosition(Position position){
        if (position==null) {
            return false;
        }
        if (!positionList.contains(position)) {
            return false;
        }
        return true;
    }


}
