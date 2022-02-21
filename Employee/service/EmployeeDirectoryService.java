package emp.portal.service;
import java.util.List;
import org.springframework.stereotype.Service;
import emp.portal.entity.*;


@Service
public interface EmployeeDirectoryService {
    public List<EmployeeDirectory> getAll();
    public EmployeeDirectory getById(long id);
    public EmployeeDirectory add(EmployeeDirectory employeeDirectory);
    public void update(long id, EmployeeDirectory employeeDirectory);
    public void delete(long id);
}


