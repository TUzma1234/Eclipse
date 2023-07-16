package com.xworkz.third;

public class IplTeamRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Running  IplTeamRunner ");
		IplTeam ref=new IplTeam("DC","Ishant Sharma");
		ref.setNoOfTeams(12);
		ref.printInfo();

		IplTeam ref1=new IplTeam("CSK","M.S. Dhoni");
		ref1.setNoOfTeams(12);
		ref1.printInfo();


	}

}
