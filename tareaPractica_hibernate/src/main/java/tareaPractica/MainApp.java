package tareaPractica;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

import Modelo.*;



public class MainApp {

	public static void main(String[] args) {
		// Abrir sesion
		Session session = HibernateUtil.getSession();
		Query query = null;
		
		try {
			// Inicio de transaccion
			session.getTransaction().begin();
			
			/*
			 * CONSULTA 1
			 */
			query = session.createQuery("FROM Productos p");
			
			// Esto suelta toda la consulta por la consola aparte de crear una lista
			// de Productos y pasarle la lista de la consulta
			List<Productos> lista = query.list();
			
			System.out.println("\n\tConsulta 1.- Seleccion de todos los productos\n");
			for (Productos prod : lista) {
				System.out.println(prod.getProducto());
			}
			
			
			/*
			 * CONSULTA 2
			 */
			System.out.println("EJEMPLO Consulta de todos los Productos y Categoria:");

			query = session.createQuery("SELECT p, p.categorias " + "FROM Productos p");

			List<Object[]> lista1 = query.list();

			for (Object[] elem : lista1) {
				Productos p = (Productos) elem[0];
				System.out.println("PRODUCTO: " + p.getProducto());

				Categorias cat = (Categorias) elem[1];
				System.out.println("CATEGORIA DESCRIPCION: " + cat.getDescripcion());

				System.out.println("----------------------------------------------------------------");
			}

			
			/*
			 * CONSULTA 3
			 */
			System.out.println("");
			System.out.println("----- EJEMPLO Consulta de todos los Productos y Categoria: -----");

			Query query2 = session.createQuery(
					"SELECT p, p.categorias, p.categorias.categoria " 
					+ "FROM Productos p "
					+ "WHERE p.categorias.categoria = :categoria");

			query2.setParameter("categoria", "Pescado/Marisco");

			List<Object[]> lista2 = query2.list();

			for (Object[] elem : lista2) {
				Productos p = (Productos) elem[0];
				System.out.println("PRODUCTO: " + p.getProducto());

				Categorias cat = (Categorias) elem[1];
				System.out.println("CATEGORIA DESCRIPCION: " + cat.getDescripcion());

				System.out.println("CATEGORIA: " + elem[2]);

				System.out.println("----------------------------------------------------------------");
			}

			System.out.println("----------------------------------------------------------------");

			
			/*
			 * CONSULTA 4
			 */
			System.out.println("");
			System.out.println("EJEMPLO Consulta los datos del contacto Maria Anders y cu�ntos pedido tiene:");

			query = session.createQuery(
					"SELECT c, SIZE(c.pedidoses) " 
					+ "FROM Clientes c " 
					+ "WHERE c.contacto='Maria Anders'");
			List<Object[]> lista3 = query.list();

			// Puedo quitar el for porque �nicamente devolver� un objeto
			for (Object[] elem : lista3) {
				Clientes c = (Clientes) elem[0];
				int numPedidos = (Integer) elem[1];

				System.out.println(c.getContacto() + "  " + numPedidos);
			}

			
			/*
			 * CONSULTA 5
			 */
			System.out.println("");
			System.out.println("EJEMPLO Consulta los clientes con m�s de 20 pedidos:");

			query = session.createQuery(
					"SELECT c " 
					+ "FROM Clientes c " 
					+ "WHERE SIZE(c.pedidoses)>20");
			List<Clientes> lista4 = query.list();

			for (Clientes elem : lista4) {
				System.out.println(elem.getContacto());
			}
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			// Cerrar la sesión
			HibernateUtil.closeSession();
		}
	}
}
