package com.Student;

import org.springframework.stereotype.Component;

@Component
public class TechologyRepository {
Technology[] techAr= {
		new Technology(1000,"java"),
		new Technology(2000,"mysql"),
		new Technology(3000,"aws"),
		new Technology(4000,"python"),
};
public Technology findTechnology(int techid) {
	for(Technology t:techAr) {
		if(t.getTechId()==techid) {
			return t;
		}
	}
	return null;
}
}
