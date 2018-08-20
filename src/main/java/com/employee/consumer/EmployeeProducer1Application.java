package com.employee.consumer;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;

import com.employee.consumer.controller.EmployeeConsumerClient;

@SpringBootApplication
public class EmployeeProducer1Application {

	public static void main(String[] args) throws RestClientException, IOException {
		
			ApplicationContext ctx = SpringApplication.run(
					EmployeeProducer1Application.class, args);
			
			EmployeeConsumerClient consumerControllerClient=ctx.getBean(EmployeeConsumerClient.class);
			System.out.println(consumerControllerClient);
			consumerControllerClient.getEmployee();
			
		}
		
		@Bean
		public  EmployeeConsumerClient  employeeConsumerClient()
		{
			return  new EmployeeConsumerClient();
		}
}
