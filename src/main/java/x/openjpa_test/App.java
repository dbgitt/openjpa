package x.openjpa_test;

import javax.persistence.EntityManager;

public class App {

    public static void main(String[] args) {
	System.out.println("Hello World!");

	// JPA
	TableTest tableTest = new TableTest();
	System.out.println("1name: " + tableTest.getName());
	tableTest.setName("testJPA");
	System.out.println("2name: " + tableTest.getName());
	EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
	em.getTransaction().begin();
	em.persist(tableTest);
	em.flush();
	em.getTransaction().commit();
	em.close();
	PersistenceManager.INSTANCE.close();
	System.out.println("end!");
    }

}
