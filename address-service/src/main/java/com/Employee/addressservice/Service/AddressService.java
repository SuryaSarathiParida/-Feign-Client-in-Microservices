package com.Employee.addressservice.Service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.addressservice.Entity.AddressEntity;
import com.Employee.addressservice.Repository.AddressRepository;
import com.Employee.addressservice.Response.AddressResponse;

@Service
public class AddressService {
	
	 @Autowired
	    private AddressRepository addressRepo;
	 
	    @Autowired
	    private ModelMapper mapper;
	 
	    public AddressResponse findAddressByEmployeeId(Long employeeId) {
	        Optional<AddressEntity> addressByEmployeeId = addressRepo.findAddressByEmployeeId(employeeId);
	        AddressResponse addressResponse = mapper.map(addressByEmployeeId, AddressResponse.class);
	        return addressResponse;
	    }
	 

}
