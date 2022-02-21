package io.ahad.entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class EmployeeDirectory {
	
		@Id
	    @Column(
	    		name="Emp_Id"
	    		)
	    
	    private long id;
	    
	    @Column(
	    		name="Emp_Name"
	    		)
	    private String name;
	    
	    @Column(
	    		name="Emp_Designation"
	    		)
	    private String designation;
	    
	    @Column(
	    		name="Account_Mapped"
	    		)
	    private String  acc_Mapped;
	    
	    @Column(
	    		name="Reporting_Manager"
	    		)
	    private String  rep_Manager;
	    
	    @ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	    @JoinColumn(name = "mg_id", nullable = false)
	    private Manager manager;
	    
	    @ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	    @JoinColumn(name = "acc_id", nullable = false)
	    private Account account;
	    

	    public EmployeeDirectory(){}
	    
	    


		public EmployeeDirectory(long id, String name, String designation, String acc_Mapped, String rep_Manager,
				Manager manager, Account account) {
			this.id = id;
			this.name = name;
			this.designation = designation;
			this.acc_Mapped = acc_Mapped;
			this.rep_Manager = rep_Manager;
			this.manager = manager;
			this.account = account;
		}




		public long getId() {
			return id;
		}


		public void setId(long id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getDesignation() {
			return designation;
		}


		public void setDesignation(String designation) {
			this.designation = designation;
		}


		public String getAcc_Mapped() {
			return acc_Mapped;
		}


		public void setAcc_Mapped(String acc_Mapped) {
			this.acc_Mapped = acc_Mapped;
		}


		public String getRep_Manager() {
			return rep_Manager;
		}


		public void setRep_Manager(String rep_Manager) {
			this.rep_Manager = rep_Manager;
		}


		public Manager getManager() {
			return manager;
		}


		public void setManager(Manager manager) {
			this.manager = manager;
		}


		public Account getAccount() {
			return account;
		}


		public void setAccount(Account account) {
			this.account = account;
		}
	    
}

		