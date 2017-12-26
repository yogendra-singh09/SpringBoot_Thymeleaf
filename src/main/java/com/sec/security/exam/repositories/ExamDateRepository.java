package com.sec.security.exam.repositories;

import com.sec.security.exam.Model.Examdates;
import org.springframework.data.repository.CrudRepository;

public interface ExamDateRepository  extends CrudRepository<Examdates,Integer>{
}
