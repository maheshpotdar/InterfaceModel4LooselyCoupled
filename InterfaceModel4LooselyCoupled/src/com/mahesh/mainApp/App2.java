package com.mahesh.mainApp;

import com.mahesh.Model.Company;
import com.mahesh.Model.Country;
import com.mahesh.Model.Employee2;
import com.mahesh.Model.MainInterface;

public class App2 {

	public static void main(String[] args) {

		// losely coupled.

		MainInterface m1 = new Country();
		MainInterface m2 = new Company();
		MainInterface m3 = new Employee2();
		m1.info();
		m2.info();
		m3.info();
	}

}
