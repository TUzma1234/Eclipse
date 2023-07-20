package com.xworkz;

public class CourtRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Court court=new Court();
		court.justice();
		
		
		SupremeCourt supremeCourt=new SupremeCourt();
		supremeCourt.justice();
		supremeCourt.importantCase();
		
		
		HighCourt highCourt=new HighCourt();
		highCourt.importantCase();
		highCourt.criminalCase();
		highCourt.forgeryCase();
		
		
		CivilCourt civilCourt=new CivilCourt();
		civilCourt.criminalCase();
		civilCourt.propertyCase();
		civilCourt.theftCase();
		civilCourt.forgeryCase();
		
		
		
		FamilyCourt familyCourt=new FamilyCourt();
		familyCourt.propertyCase();
		familyCourt.theftCase();
		familyCourt.forgeryCase();
		familyCourt.divorce();
		
	}

}
