package com.restapiproject1.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.restapiproject1.entity.Students;
import com.restapiproject1.repository.StudentRepository;

@Service
public class StudentService implements IStudentService {
@Autowired
private StudentRepository repository;
public List<Students>findPaginated(int pageNo, int pageSize) {

Pageable paging=PageRequest.of(pageNo, pageSize) ;
Page<Students>pagedResult = repository.findAll(paging);
return pagedResult.toList();
}

}
