package baseDatos.modelo.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import baseDatos.modelo.Dato;
import baseDatos.modelo.bdd.BaseDeDatos;


public class ModificarTest {
	
	private BaseDeDatos base;


	@Before
	public void setUp() throws Exception {
		this.base = new BaseDeDatos();
		this.base.agregar(new Dato("C11", "kalusto"));	
		this.base.agregar(new Dato("C12", "iliada"));		
		this.base.agregar(new Dato("C13", "listanegra"));		
		this.base.agregar(new Dato("C14", "pirineo"));	
		this.base.agregar(new Dato("C15", "tierrahundida"));	
	}



	@Test
	public void testModificaEntoncesTrue() {
		boolean retorno = this.base.modificar(new Dato("C13", "deathnote"));
		System.out.println("Elemento modificado: True");
		assertTrue(retorno);	
	}

}
