package com.xworkz.third;

public class Director {
		String movieName;
		int age;
		String nationality;
		int yearOfExperience;
		Director(String movieName,int age,String nationality,int yearOfExperience)
		{
				this.movieName=movieName;
				this.age=age;
				this.nationality=nationality;
				this.yearOfExperience=yearOfExperience;
		}
		void printInfo()
		{
			System.out.println("Movie Name="+this.movieName);
			System.out.println("Age="+this.age);
			System.out.println("Nationality="+this.nationality);
			System.out.println("YearOfExperience="+this.yearOfExperience);
			
		}

}
