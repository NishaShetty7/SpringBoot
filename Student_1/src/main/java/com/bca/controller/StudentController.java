package com.bca.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bca.entity.Student;
import com.bca.service.StudentService;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class StudentController {
 @Autowired
 StudentService ss;
 @GetMapping("/view")
 public List<Student>view_stud(){
    return ss.view_stud();
}
@PostMapping("/save")
public String Save_stu(@RequestBody Student s) {
    
    return ss.Save_stu(s);
}

@GetMapping("/view/{id}")
public Optional<Student> view_one_stu(@PathVariable Long id) {
    return ss.view_one_stu(id);
}
@DeleteMapping("/del/{id}")
public String del_stu(@PathVariable Long id)
{
	return ss.del_stu(id);
}
}
