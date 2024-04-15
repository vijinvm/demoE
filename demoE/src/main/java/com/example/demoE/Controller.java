package com.example.demoE;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;

@RestController
@RequestMapping
public class Controller {
	
	@Autowired
	private TeacherService u;
	@Autowired
	private CourseService v;
	
	@GetMapping("/paged1")
	public Page<Teacher>g5(@RequestParam(defaultValue="0")int page,@RequestParam(defaultValue="10" )int size,@RequestParam(defaultValue="id")String sortBy){
		return u.g5(page, size, sortBy);
	}
	@GetMapping("/paged2")
	public Page<Course>a5(@RequestParam(defaultValue="0")int page,@RequestParam(defaultValue="10" )int size,@RequestParam(defaultValue="id")String sortBy){
		return v.a5(page, size, sortBy);
	}
	@GetMapping("/teacher")
	public List<Teacher>g1(){
		return u.g1();
	}
  @GetMapping("/Course")
  public List<Course>a1(){
	return v.a1();
}
  @PostMapping("/t")
  public Teacher g3(@RequestBody Teacher teacher) {
	  return u.g3(teacher);
  }
  @PostMapping("/c")
  public Course a3(@RequestBody Course course) {
	  return v.a3(course);
  }
  @DeleteMapping("/course/{id}")
    public void a4(@PathVariable int id) {
	  v.a4(id);
  }
  @DeleteMapping("/teacher/{id}")
  public void g4(@PathVariable int id) {
	  u.g4(id);
}
}
