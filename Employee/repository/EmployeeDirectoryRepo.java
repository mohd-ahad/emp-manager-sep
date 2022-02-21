package emp.portal.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import emp.portal.entity.EmployeeDirectory;

	@Repository
	public interface EmployeeDirectoryRepo  extends JpaRepository<EmployeeDirectory, Long> {
	}


