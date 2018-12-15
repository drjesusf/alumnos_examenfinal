package com.ads.examenfinal.student.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ads.examenfinal.student.application.dtos.StudentDto;
import com.ads.examenfinal.student.application.service.StudentApplicationService;

@RestController
@RequestMapping("/api/students")
public class AlumnosController {
	@Autowired
	StudentApplicationService studentApplicationService;
	
	@RequestMapping(method = RequestMethod.GET, path = "", produces = "application/json; charset=UTF-8")
    @ResponseBody
    ResponseEntity<Object> getPaginated(
    		@RequestParam(value = "page", required = false, defaultValue = "0") int page,
    		@RequestParam(value = "pageSize", required = false, defaultValue = "100") int pageSize) {
		
		List<StudentDto> customers = studentApplicationService.get(page, pageSize);
		return new ResponseEntity<Object>(customers, HttpStatus.OK);
	}
	
	
	@RequestMapping(method = RequestMethod.GET, path = "", produces = "application/json; charset=UTF-8")
    @ResponseBody
    ResponseEntity<Object> calculateMontoBeca(
    		@RequestParam(value = "page", required = false, defaultValue = "0") int stidentId) {
		
		long montoBeca = studentApplicationService.calculateMontoBeca(stidentId);
		return new ResponseEntity<Object>(montoBeca, HttpStatus.OK);
	}
}
