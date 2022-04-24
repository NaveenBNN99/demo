package com.example.demo;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path="Students" , collectionResourceRel="Students")
public interface StudentsRepository extends JpaRepository<Students, Integer> {
}
