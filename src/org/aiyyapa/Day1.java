package org.aiyyapa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Day1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Davanathan\\Downloads\\class\\eclipse-epsilon-1.5-win32-x86_64\\eclipse\\DEVA\\Demo\\Driver\\chromedriver.exe");
		WebDriver deva=new ChromeDriver();
		deva.get("http://www.greenstechnologys.com/");
		String title = deva.getTitle();
		System.out.println(title);
		String URL = deva.getCurrentUrl();
		System.out.println(URL);
		
	}

}
