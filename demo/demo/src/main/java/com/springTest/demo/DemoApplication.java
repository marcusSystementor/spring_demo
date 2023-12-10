package com.springTest.demo;

import com.springTest.demo.dao.HomeAddressDAO;
import com.springTest.demo.dao.StudentDAO;
import com.springTest.demo.model.HomeAddress;
import com.springTest.demo.model.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO, HomeAddressDAO homeAddressDAO) {

		return runner -> {
			addStudent(studentDAO);
			//addHomeAddress(homeAddressDAO);

		};
	}

	private void addStudent(StudentDAO studentDAO) {
		Student student = new Student("Clas", "Ohlson", "clas@ohlson.com");
		studentDAO.addStudent(student);
	}

	private void addHomeAddress(HomeAddressDAO homeAddressDAO) {
		HomeAddress homeAddress = new HomeAddress("TestCity", 41522);
		homeAddressDAO.addHomeAddress(homeAddress);
	}

}