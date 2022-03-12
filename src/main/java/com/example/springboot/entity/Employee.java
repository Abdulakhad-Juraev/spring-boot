package com.example.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Abdulakhad on 06.02.2022
 * @project spring-boot
 */
@Entity
public class Employee{

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   @Column
   private String name;
   @Column
   private String lastName;


   public Employee(Long id, String name, String lastName) {
      this.id = id;
      this.name = name;
      this.lastName = lastName;
   }

   public Employee() {

   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public Employee(String name, String lastName) {
      this.name = name;
      this.lastName = lastName;
   }
}
