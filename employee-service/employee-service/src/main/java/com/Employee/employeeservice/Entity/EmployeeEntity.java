package com.Employee.employeeservice.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Table(name="employee" )
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeEntity {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private Long id;
	 
	    @Column(name = "name")
	    private String name;
	 
	    @Column(name = "email")
	    private String email;
	 
	    @Column(name = "age")
	    private String age;
}
