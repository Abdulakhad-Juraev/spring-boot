package com.example.springboot.repository;

import com.example.springboot.entity.FileStorage;
import com.example.springboot.entity.enums.FileStorageStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Abdulakhad on 12.03.2022
 * @project spring-boot
 */
@Repository
public interface FileStorageRepository extends JpaRepository<FileStorage, Long> {

    FileStorage findByHashId(String hashId);

    List<FileStorage> findAllByFileStorageStatus(FileStorageStatus fileStorageStatus);

}
