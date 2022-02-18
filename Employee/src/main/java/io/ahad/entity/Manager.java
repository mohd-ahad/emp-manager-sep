package io.ahad.entity;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Manager")
public class Manager {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;
//	    @OneToMany(mappedBy = "emp", cascade = CascadeType.ALL, orphanRemoval = true)
//	     private Set<EmployeeDirectory> employeeDirectory;
		
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
//		public Set<EmployeeDirectory> getEmployeeDirectory() {
//			return employeeDirectory;
//		}
//		public void setEmployeeDirectory(Set<EmployeeDirectory> employeeDirectory) {
//			this.employeeDirectory = employeeDirectory;
//		}
	    
	    
	}
