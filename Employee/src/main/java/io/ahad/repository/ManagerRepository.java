package io.ahad.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.ahad.entity.Manager;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, Long>  {

}
