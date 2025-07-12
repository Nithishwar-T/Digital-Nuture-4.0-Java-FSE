package com.cognizant.springlearn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		LOGGER.info("Inside main()");

		displayDate();

		// Load bean from beans.xml
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		SampleBean bean = (SampleBean) context.getBean("sampleBean");
		bean.displayMessage();
	}

	private static void displayDate() {
		ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
		try {
			Date parsedDate = format.parse("31/12/2018");
			System.out.println("Parsed Date: " + parsedDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
