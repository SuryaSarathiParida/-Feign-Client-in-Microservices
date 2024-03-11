package com.Employee.employeeservice.Service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Employee.employeeservice.Entity.EmployeeEntity;
import com.Employee.employeeservice.Repository.EmployeeRepository;
import com.Employee.employeeservice.Response.AddressResponse;
import com.Employee.employeeservice.Response.EmployeeResponse;
import com.Employee.employeeservice.Utility.AddressClient;

@Service
public class EmployeeService {
	
	@Autowired
    private EmployeeRepository employeeRepo;
 
    @Autowired
   private ModelMapper mapper;
// 
//    // Spring will create the implementation
//    // for this class
//    // and will inject the bean here (proxy)
    @Autowired
    private AddressClient addressClient;
 
    public EmployeeResponse getEmployeeById(Long id) {
 
        Optional<EmployeeEntity> employee = employeeRepo.findById(id);
        EmployeeResponse employeeResponse = mapper.map(employee, EmployeeResponse.class);
 
        // Using FeignClient
        ResponseEntity<AddressResponse> addressResponse = addressClient.getAddressByEmployeeId(id);
        employeeResponse.setAddressResponse(addressResponse.getBody());
 
        return employeeResponse;
    }
 

}
