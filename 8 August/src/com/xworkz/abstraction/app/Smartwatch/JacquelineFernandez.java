package com.xworkz.abstraction.app.Smartwatch;

public class JacquelineFernandez {
	
	SmartWatch showtime;

	public JacquelineFernandez(SmartWatch showtime) {
		super();
		this.showtime = showtime;
	}
	public void showTime()
	{
		if(showtime!=null)
		{
			System.out.println("show the time........");
			this.showtime.price();
		}
		else
		{
			System.err.println("showtime.......");
		}
	}
}


