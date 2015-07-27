 package com.concordia;

    import org.aspectj.lang.annotation.Aspect;
    import org.aspectj.lang.annotation.Before;
    import org.aspectj.lang.annotation.Pointcut;


 @Aspect
    public class LoggerClass {

        @Pointcut("execution(* com.concordia.HelperClass.validateTeam(Team))" + "&& args(team)")
        public void teamValidationPointcut(Team team){
        }

        @Before("teamValidationPointcut(team)")
        public void printTeam(Team team){
            System.out.println();
            System.out.println("The team: \""+ team.getName()+"\" was founded in "+ team.getYearOfFoundation());
            System.out.println("/ "+"And the trainer is: "+ team.getTrainer().getFirstName()+", "+ team.getTrainer().getLastName()+" who is: "+ team.getTrainer().getAge()+" years old, this should be a secret but his salary is: "+ team.getTrainer().getAnnualSalary().getFormatedValue()+")");
            System.out.println("/ "+"-------------"+"Besides the former team"+(team.getTrainer().getPreviousTeamList().size()>1? "s:":":"));
            for (Team trainerTeam: team.getTrainer().getPreviousTeamList())
                System.out.println("/ "+"-------------"+trainerTeam.getName());
            int counter=1;
            for (Player player: team.getPlayers())
                System.out.println("/ Integrated by" + "Player # " + counter++ + " " + player.getFirstName() + " " + player.getLastName()+" ["+"playing the position: "+player.getPosition().name()+"; "+"he born in: "
                        +player.getCountryOfBirth()+"; "+"So hi's: "+player.getAge()+" years old; "+"with the statistic: "+player.getStatisticsClass().getNumberOfGoals()+"; "+"and booking: "+player.getStatisticsClass().getNumberOfBookings()+"; "+"Also should be a secret, however here you are his incoming year salary: "+player.getAnnualSalary().getFormatedValue()+"]");
        }
    }


