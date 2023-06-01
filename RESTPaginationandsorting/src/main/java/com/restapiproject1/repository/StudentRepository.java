package com.restapiproject1.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.restapiproject1.entity.Students;

public interface StudentRepository extends PagingAndSortingRepository<Students,Long>{

}
