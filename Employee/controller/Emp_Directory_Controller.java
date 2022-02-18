package emp.portal.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import emp.portal.entity.EmployeeDirectory;
import emp.portal.payload.ManagerDTO;
import emp.portal.service.EmployeeDirectoryService;
import emp.portal.service.ManagerService;


@RestController
@RequestMapping("/api/auth/emp")
public class Emp_Directory_Controller {

	
	    @Autowired
	    private EmployeeDirectoryService service;

	    @Autowired
	    private ManagerService managerService;

	    
	    @GetMapping("/empDir")
	    public List<EmployeeDirectory> getAll(){
	        return this.service.getAll();
	    }

	    @GetMapping("/empDir/{id}")
	    public EmployeeDirectory getBookById(@PathVariable("id") int id) {
	        return this.service.getById(id);
	    }

	    @PostMapping("/empDir")
	    public EmployeeDirectory addBook(@RequestBody EmployeeDirectory employeeDirectory){
	        return this.service.add(employeeDirectory);
	    }
	   

	    @PutMapping("/empDir/{id}")
	    public String updateBook( @PathVariable("id") long id, @RequestBody EmployeeDirectory employeeDirectory){
	        this.service.update(id, employeeDirectory);
	        return "updated successfully";
	    }

	    @DeleteMapping("/empDir/{id}")
	    public String delete(@PathVariable("id") long id){
	        this.service.delete(id);
	        return "deleted successfully";
	    }
	    
	}
