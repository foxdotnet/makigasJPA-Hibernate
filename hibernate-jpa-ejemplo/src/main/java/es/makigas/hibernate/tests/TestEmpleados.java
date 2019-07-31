package es.makigas.hibernate.tests;

import es.makigas.hibernate.modelo.Direccion;
import es.makigas.hibernate.modelo.Empleado;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestEmpleados {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistencia");
		EntityManager manager = emf.createEntityManager();

		Empleado e1 = new Empleado(10L, "García Lorenzo", "Domingo", LocalDate.of(1969, 6, 17));
		Empleado e2 = new Empleado(11L, "Ruiz Jimenez", "Maria Pilar", LocalDate.of(1970, 5, 18));
		e1.setDireccion(new Direccion(18, "C. Pozo 12", "Lalin", "PO", "ES"));
		manager.getTransaction().begin();

		manager.persist(e1);
		manager.persist(e2);
		e1.setNombre("Domin");
		manager.getTransaction().commit();

		List<Empleado> empleados = (List<Empleado>) manager.createQuery("FROM Empleado").getResultList();
		manager.close();
		
		if (empleados == null) {
			System.out.println("empleados NULL");
		} else {
			System.out.println("Hay " + empleados.size() + " empleados.");
			for (Empleado emp : empleados) {
				System.out.println(emp.toString());
			}
		}
	}

}
