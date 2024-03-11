package com.Employee.addressservice.Repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.addressservice.Entity.AddressEntity;
@RestController
public interface AddressRepository extends JpaRepository<AddressEntity, Long> {


    @Query(value= "SELECT ea.id, ea.city, ea.state FROM employe_db.address ea join employe_db.employee e on e.id = ea.employee_id where ea.employee_id=:employeeId",nativeQuery = true)
       Optional<AddressEntity> findAddressByEmployeeId(@Param("employeeId") Long employeeId);
}
	
	


