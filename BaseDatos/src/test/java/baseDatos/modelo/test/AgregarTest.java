package baseDatos.modelo.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import baseDatos.modelo.Dato;
import baseDatos.modelo.bdd.BaseDeDatos;


public class AgregarTest {
	
	private BaseDeDatos base;


	@Before
	public void setUp() throws Exception {
		
		this.base= new BaseDeDatos();

	}



	@Test
	public void testAgregaNuevoElementoTrue() {
		
		boolean retorno = this.base.agregar(new Dato("C0", "binarios"));
		System.out.println("agregado elemento: TRUE");
		assertTrue(retorno);
	}
}

