package com.jsp.Project;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
public class JUnit extends TestCase {

	public JUnit(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(JUnit.class);
	}

	@org.junit.jupiter.api.Test
	public void testApp() throws MalformedURLException, IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the URL to read html");
		String URL = scanner.nextLine();

		Service service = new Service();
		String output = service.readHTML(URL);
		String content = null;
		URLConnection connection = null;

		connection = new URL(URL).openConnection();
		Scanner scan = new Scanner(connection.getInputStream());
		scan.useDelimiter("\\Z");
		content = scan.next();
		scanner.close();
		scan.close();

		assertEquals(output, content);;
	}
}
public class JUnit extends TestCase {

	
	public static Test suite() {
		return new TestSuite(JUnit.class);
	}
    public JUnit(String testName) {
		super(testName);
	}
      @org.junit.jupiter.api.Test
	public void testApp() throws MalformedURLException, IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the URL to read html");
		String URL = scanner.nextLine();

		Service service = new Service();
		String output = service.readHTML(URL);
		String content = null;
		URLConnection connection = null;

		connection = new URL(URL).openConnection();
		Scanner scan = new Scanner(connection.getInputStream());
		scan.useDelimiter("\\Z");
		content = scan.next();
		scanner.close();
		scan.close();

		assertEquals(output, content);;
	}
}

