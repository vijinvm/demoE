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
public class TeacherService {
	@Autowired
	private TeacherRepository t;
	public List<Teacher>g1(){
		return t.findAll();
	}
	public Optional<Teacher>g2(int id){
		return t.findById(id);
	}
	public Teacher g3(Teacher teacher) {
		return t.save(teacher);
	}
	public void g4(int id) {
		t.deleteById(id);
	}
	public Page<Teacher>g5(int page,int size,String sortBy){
		Pageable pageable=PageRequest.of(page,size,Sort.by(sortBy));
			return t.findAll(pageable);
	
	}
}

