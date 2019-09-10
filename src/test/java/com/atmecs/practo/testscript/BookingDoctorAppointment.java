package com.atmecs.practo.testscript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import com.atmecs.practo.constant.Constant;
import com.atmecs.practo.testbase.Base;

public class BookingDoctorAppointment extends Base {
	static Properties property1=new Properties();
	
	static FileInputStream stream;
	
	@Test
	public static void findAndBooking() throws IOException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		stream=new FileInputStream(Constant.identifier_path);
		
		property1.load(stream);
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath(property1.getProperty("loc_doctor_xpath_clk"))).click();
	}

}
