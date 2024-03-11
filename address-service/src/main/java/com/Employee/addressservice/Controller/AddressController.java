package com.Employee.addressservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.addressservice.Response.AddressResponse;
import com.Employee.addressservice.Service.AddressService;

@RestController
public class AddressController {
	
	 @Autowired
	    private AddressService addressService;
	 
	    @GetMapping("/address/{employeeId}")
	    public ResponseEntity<AddressResponse> getAddressByEmployeeId(@PathVariable("employeeId") Long employeeId) {
	        AddressResponse addressResponse = addressService.findAddressByEmployeeId(employeeId);
	        return ResponseEntity.status(HttpStatus.OK).body(addressResponse);
	    }
	
	

}
