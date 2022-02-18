package io.ahad.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.ahad.entity.EmployeeDirectory;
import io.ahad.repository.EmployeeDirectoryRepo;

@Service
public class EmployeeDirectoryImpl implements EmployeeDirectoryService {

	 @Autowired
	 private EmployeeDirectoryRepo repository;

	@Override
	public List<EmployeeDirectory> getAll() {
		return repository.findAll();
	}

	@Override
	public EmployeeDirectory getById(long id) {
		return repository.getById(id);
	}

	@Override
	public EmployeeDirectory add(EmployeeDirectory employeeDirectory) {
		return repository.save(employeeDirectory);
	}

	@Override
	public void update(long id, EmployeeDirectory employeeDirectory) {
		repository.save(employeeDirectory);
		
	}

	@Override
	public void delete(long id) {
		repository.deleteById(id);
		
	}

}

