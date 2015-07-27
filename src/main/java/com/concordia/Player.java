package com.concordia;

import org.springframework.stereotype.Component;


@Component
public class Player {
    private String firstName;
    private String lastName;
    private Integer age;
    private String countryOfBirth;
    private CurrencyClass annualSalary;
    private Position position;
    private StatisticsClass statisticsClass;

    public Player(String firstName, String lastName, Integer age, String countryOfBirth, CurrencyClass annualSalary, Position position, StatisticsClass statisticsClass) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.countryOfBirth = countryOfBirth;
        this.annualSalary = annualSalary;
        this.position = position;
        this.statisticsClass = statisticsClass;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public Integer getAge() {

        return age;
    }

    public void setAge(Integer age) {

        this.age = age;
    }

    public String getCountryOfBirth() {

        return countryOfBirth;
    }

    public void setCountryOfBirth(String countryOfBirth) {

        this.countryOfBirth = countryOfBirth;
    }

    public CurrencyClass getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(CurrencyClass annualSalary) {
        this.annualSalary = annualSalary;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public StatisticsClass getStatisticsClass() {
        return statisticsClass;
    }

    public void setStatisticsClass(StatisticsClass statisticsClass) {
        this.statisticsClass = statisticsClass;
    }
}
