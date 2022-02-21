package io.ahad.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.ahad.entity.Account;
import io.ahad.entity.EmployeeDirectory;
import io.ahad.entity.Manager;
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
		return repository.findById(id).get();
	}

	@Override
	public EmployeeDirectory add(EmployeeDirectory employeeDirectory) {
		Account account=new Account();
		account.setName(employeeDirectory.getAcc_Mapped());
		account.setId(account.getId());
		Manager manager=new Manager();
		manager.setName(employeeDirectory.getRep_Manager());
		manager.setId(manager.getId());
		employeeDirectory.setAccount(account);
		employeeDirectory.setManager(manager);
		return repository.save(employeeDirectory);
	}

	@Override
	public void update(long id, EmployeeDirectory employeeDirectory) {
		Account account=new Account();
		EmployeeDirectory empdir=repository.findById(id).get();
		empdir.setId(id);
		empdir.setName(employeeDirectory.getName());
		empdir.setAcc_Mapped(employeeDirectory.getAcc_Mapped());
		empdir.setDesignation(employeeDirectory.getDesignation());
		empdir.setManager(employeeDirectory.getManager());
		
		account.setName(employeeDirectory.getAcc_Mapped());
		account.setId(account.getId());
		Manager manager=new Manager();
		manager.setName(employeeDirectory.getRep_Manager());
		manager.setId(manager.getId());
		empdir.setAccount(account);
		empdir.setManager(manager);
		repository.save(empdir);
		
	}

	@Override
	public void delete(long id) {
		repository.deleteById(id);
		
	}

}

