package com.xworkz.Runner;
import com.xworkz.Implementation.MisaelRocket ;
import com.xworkz.Implementation.SpaceRocket;

public class RocketRunner {
	
	
		public static void main(String[] args) {
			SpaceRocket spaceRocket = new SpaceRocket();
			spaceRocket.launch();
			spaceRocket.land();
			spaceRocket.deploySatellite();

			MisaelRocket misaelRocket = new MisaelRocket();
			misaelRocket.launch();
			misaelRocket.land();
		}
	}
