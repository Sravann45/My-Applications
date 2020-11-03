package com.example.validatingforminput;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class PersonForm {
	
	public PersonForm() {
		System.out.println("In PerrsonForm Constructor");
	}

	@Size(min=2, max=30)
	private String name;

	@Min(18)
	private Integer age;

	
	public String toString() {
		return "Person(Name: " + this.name + ", Age: " + this.age + ")";
	}
}
