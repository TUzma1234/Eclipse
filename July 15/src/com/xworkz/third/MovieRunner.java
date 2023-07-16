package com.xworkz.third;

public class MovieRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.out.println("Running args ");
				Movie movie=new Movie("KGF2");
				movie.setLanguage("telgu");
				movie.printInfo();
				
				Movie movie1=new Movie("jawan");
				movie1.setLanguage("kannada");
				movie.printInfo();
				

	}

}
