package com.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.modal.EmployeeV1;
import com.api.modal.EmployeeV2;

@RestController
@RequestMapping(value = "/api")
public class EmployeeController {

	/*
	 *  URI Based Versioning - v1
	 *  Call using request url - v1/getEmpDetails
	 */
	@GetMapping("v1/getEmpDetails")
	public EmployeeV1 getEmpV1() {
		return new EmployeeV1("Ryan Stark", 20);
	}
	
	/*
	 *  URI Based Versioning - v2
	 *  Call using request url - v2/getEmpDetails
	 */
	@GetMapping("v2/getEmpDetails")
	public EmployeeV2 getEmpV2() {
		return new EmployeeV2("Ryan","Stark", 20);
	}
	
	/*
	 *  RequestParam Based Versioning - v1
	 *  Call using request param /getEmpDetails/param?version=1
	 */
	@GetMapping(value = "/getEmpDetails/param", params = "version=1")
	public EmployeeV1 getEmpParamV1() {
		return new EmployeeV1("Ryan Stark", 20);
	}
	
	/*
	 *  RequestParam Based Versioning - v2
	 *  Call using request param /getEmpDetails/param?version=2
	 */
	@GetMapping(value = "/getEmpDetails/param", params = "version=2")
	public EmployeeV2 getEmpParamV2() {
		return new EmployeeV2("Ryan","Stark", 20);
	}
	
	/*
	 *  HeaderParam Based Versioning - v1
	 *  Call using header param X-API-VERSION=1
	 */
	@GetMapping(value = "/getEmpDetails/header", headers = "X-API-VERSION=1")
	public EmployeeV1 getEmpHeaderV1() {
		return new EmployeeV1("Ryan Stark", 20);
	}
	
	/*
	 *  HeaderParam Based Versioning - v2
	 *  Call using header param X-API-VERSION=2
	 */
	@GetMapping(value = "/getEmpDetails/header", headers = "X-API-VERSION=2")
	public EmployeeV2 getEmpHeaderV2() {
		return new EmployeeV2("Ryan","Stark", 20);
	}
	
	
	/*
	 *  MIME type Versioning - v1
	 *  Call using accept header accept=application/emp-v1+json
	 */
	@GetMapping(value = "/getEmpDetails", produces = "application/emp-v1+json")
	public EmployeeV1 getEmpProducesV1() {
		return new EmployeeV1("Ryan Stark", 20);
	}
	
	/*
	 *  MIME type Versioning - v2
	 *  Call using accept header accept=application/emp-v2+json
	 */
	@GetMapping(value = "/getEmpDetails", produces = "application/emp-v2+json")
	public EmployeeV2 getEmpProducesV2() {
		return new EmployeeV2("Ryan","Stark", 20);
	}
	
}
