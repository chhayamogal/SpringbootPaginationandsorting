package com.restapiproject1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapiproject1.entity.Students;

public interface Studentrepo extends JpaRepository<Students,Long>  {

}
