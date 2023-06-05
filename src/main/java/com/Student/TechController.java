package com.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TechController {
	@Autowired
	TechologyRepository techRep;
	
	@GetMapping("/getTech/{techId}")
  public Technology getTechology(@PathVariable int techId) {
		return techRep.findTechnology(techId);
	}
}
