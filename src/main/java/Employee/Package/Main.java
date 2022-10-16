package Employee.Package;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import EmfPAckage.EmfClass;

public class Main {
	
	public static void main(String[] args) {
		EntityManager em=EmfClass.getEm();
		
		Department department=new Department();
		department.setDname("HR");
		department.setLocation("patna");
		
		Employee emp1=new Employee();
		emp1.setName("mahesh");
		emp1.setSalary(50000);
	
		Employee emp2=new Employee();
		emp2.setName("maehs");
		emp2.setSalary(40000);
		
		emp1.setDept(department);
		emp2.setDept(department);
		
		department.getEmpl().add(emp2);
		department.getEmpl().add(emp1);
		
		em.getTransaction().begin();
		em.persist(department);
		em.getTransaction().commit();
//		em.close();
		System.out.println("done........");
		
		

	}

}
