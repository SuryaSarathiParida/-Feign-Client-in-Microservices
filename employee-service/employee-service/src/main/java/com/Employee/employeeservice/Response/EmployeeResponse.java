package com.Employee.employeeservice.Response;

import lombok.Data;

@Data
public class EmployeeResponse {
	
	private int id;
    private String name;
    private String email;
    private String age;
    private AddressResponse addressResponse;

}
