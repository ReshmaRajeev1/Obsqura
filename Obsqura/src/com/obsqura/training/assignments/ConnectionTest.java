package com.obsqura.training.assignments;

public class ConnectionTest {
	DriverClass driver;

	ConnectionTest(DriverClass driver) {
		this.driver = driver;
	}

	public String testTheConnection() {
		return driver.getConnection();

	}

}
