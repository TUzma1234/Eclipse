package com.xworkz.Abstraction;

public abstract class OperatingSystem {
	public abstract void boot();

	public void shutdown() {
		System.out.println("Operating system shut down.");
	}

}
