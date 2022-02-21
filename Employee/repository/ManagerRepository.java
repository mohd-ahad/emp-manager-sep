package emp.portal.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import emp.portal.entity.Manager;

public interface ManagerRepository extends JpaRepository<Manager, Long>  {

}
