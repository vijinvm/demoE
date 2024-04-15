package com.example.demoE;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import com.example.demoC.Author;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	@Autowired
	private CourseRepository c;
	public List<Course>a1(){
		return c.findAll();
	}
	public Optional<Course>a2(int id){
		return c.findById(id);
	}
	public Course a3( Course course) {
		return c.save(course);
	}
	public void a4(int id) {
		c.deleteById(id);
	}
	public Page<Course>a5(int page,int size,String sortBy){
		Pageable pageable=PageRequest.of(page,size,Sort.by(sortBy));
			return c.findAll(pageable);
	
	}
}

