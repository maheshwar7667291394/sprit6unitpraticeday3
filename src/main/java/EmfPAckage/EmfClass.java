package EmfPAckage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmfClass {
	
	private static EntityManagerFactory Emf;
	
	static {
		Emf=Persistence.createEntityManagerFactory("empUnit");
	}
	
	public static EntityManager getEm() {
		EntityManager em=Emf.createEntityManager();
		return em;
	}

}
