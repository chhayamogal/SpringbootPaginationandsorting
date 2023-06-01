package com.restapiproject1.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restapiproject1.entity.Students;
import com.restapiproject1.repository.StudentRepository;
import com.restapiproject1.service.IStudentService;
@RestController
public class myController {
@Autowired
private IStudentService studentService;
@Autowired
StudentRepository studentrepo;
@GetMapping("/student/{pageNo}/{pageSize}")
public List<Students>getPaginated(@PathVariable int pageNo,@PathVariable int pageSize){
return studentService.findPaginated(pageNo, pageSize);
}
//sorting
@GetMapping("/sorting")
public Iterable<Students>getAllByCols (@RequestParam String field1) {
return studentrepo.findAll(Sort.by(Direction.ASC, field1));
}
}
