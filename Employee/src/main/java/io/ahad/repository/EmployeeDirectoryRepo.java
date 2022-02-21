package io.ahad.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import io.ahad.entity.EmployeeDirectory;

	@Repository
	public interface EmployeeDirectoryRepo  extends JpaRepository<EmployeeDirectory, Long> {
	}


