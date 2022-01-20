package com.zensar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableEurekaClient
@EnableHystrixDashboard
@SpringBootApplication
@EnableAutoConfiguration
public class MacysHyrtixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(MacysHyrtixDashboardApplication.class, args);
	}

}
