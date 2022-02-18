package io.ahad.payload;
import java.util.Set;
import io.ahad.entity.EmployeeDirectory;

public class ManagerDTO {
    private Long id;
    private String name;
    private Set<EmployeeDirectory> employees;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<EmployeeDirectory> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<EmployeeDirectory> employees) {
		this.employees = employees;
	}
    
}