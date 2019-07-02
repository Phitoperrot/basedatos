package baseDatos.modelo.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import baseDatos.modelo.Dato;
import baseDatos.modelo.bdd.BaseDeDatos;



public class EliminarTest {
	
	private BaseDeDatos base;


	@Before
	public void setUp() throws Exception {
		
		this.base = new BaseDeDatos();
		this.base.agregar(new Dato("C1", "Fuenteovejuna"));	
		this.base.agregar(new Dato("C2", "100años"));		
		this.base.agregar(new Dato("C3", "papelucho"));		
		this.base.agregar(new Dato("C4", "principito"));	
		this.base.agregar(new Dato("C5", "siddartha"));	
	}


	/*@Test
	public void testEliminaElementoSiEsTrue() {
		
		this.base.eliminar("C1");
		int largo = this.base.listar().size();
		assertTrue("ES" + largo + "pero deberia ser", largo == 4);
	}*/
	
	@Test
	public void testEliminaElementoTrue() {
		boolean respuesta = this.base.eliminar("C2");
		System.out.println("eliminar elemento: TRUE");
		assertTrue(respuesta);
		
	}

	

}
