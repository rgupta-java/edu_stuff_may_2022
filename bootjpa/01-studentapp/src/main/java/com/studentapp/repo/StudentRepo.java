package com.studentapp.repo;
import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.studentapp.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{
	
	
}
