package com.example.springboot.repository;

import com.example.springboot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Abdulakhad on 06.02.2022
 * @project spring-boot
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByName(String name);

    List<Employee> findByNameAndLastName(String name, String lastName);

    @Query("select e from Employee e where e.name =:name")
    List<Employee> findByNameQuery(@Param("name") String name);

    @Query(value = "select * from employee e where e.name =:name", nativeQuery = true)
    List<Employee> findByNameQueryNative(@Param("name") String name);

    List<Employee> findByNameLike(String name);

    List<Employee> findByNameStartingWith(String name);

    List<Employee> findByNameEndingWith(String name);

    @Query("select e from Employee e where upper(e.name) like upper(concat('%',:name,'%'))")
    List<Employee> findByLike(@Param("name") String name);

    @Query(value = "select * from employee e where e.name like concat('%' :name '%')", nativeQuery = true)
    List<Employee> findByLikeNameNativeQuery(@Param("name") String name);

}
