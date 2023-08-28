package com.zura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zura.model.Software;

@Repository
public interface SoftwareRepository extends JpaRepository<Software, Long> {

}
