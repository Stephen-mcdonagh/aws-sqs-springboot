package com.example.aws.sqs.project.Model;
import lombok.Getter;
import lombok.Setter;

public class Student {

	@Getter @Setter
	private Long id;
	@Getter @Setter
	private String name;
	@Getter @Setter
	private String rollNumber;
}
