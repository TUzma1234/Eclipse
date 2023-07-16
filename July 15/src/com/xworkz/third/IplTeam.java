package com.xworkz.third;

public class IplTeam {
	String teamName;
	double noOfTeams;
	String playerName;
	String captain;
	
	Franchise ref=new Franchise (12,"RCB",2013,"Dehli");
	Franchise ref1=new Franchise (13,"KKR",2022,"Mumbai");
	IplTeam(String teamName,String captain)
	{
			this.teamName=teamName;
			this.captain=captain;
	}
	void setNoOfTeams(double noOfTeams)
	{
		this.noOfTeams=noOfTeams;
	}
	void printInfo()
	{
			System.out.println("Team Name="+this.teamName);
			System.out.println("No Of Teams="+this.noOfTeams);
			System.out.println("Player Name="+this.playerName);
			System.out.println("Captain="+this.captain);
			this.ref.printInfo();
			this.ref1.printInfo();
			
	}
	

}
