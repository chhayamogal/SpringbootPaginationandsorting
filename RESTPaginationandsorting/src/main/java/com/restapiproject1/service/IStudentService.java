package com.restapiproject1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.restapiproject1.entity.Students;
@Service
public interface IStudentService {
List<Students>findPaginated(int pageNo,int PigeSize);
}
