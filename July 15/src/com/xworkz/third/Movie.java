package com.xworkz.third;

public class Movie {
			String movieName;
			double ticketCost;
			String language;
			double duration;
			
			Director ref=new Director ("RRR",500,"hindi",3);
			Director ref1=new Director("War",700,"english",4);
			Movie(String movieName)
			{
					System.out.println("Running movie const");
					this.movieName=movieName;
			}
			void setLanguage(String language)
			{
					System.out.println("Running instance method");
					this.language=language;
			}
			void printInfo()
			{
					System.out.println("print all info movie");
					System.out.println("Movie Name="+this.movieName);
					System.out.println("Ticket Codt="+this.ticketCost);
					System.out.println("Duration="+this.duration);
					this.ref.printInfo();
					this.ref1.printInfo();
			}
}
					
			
			

