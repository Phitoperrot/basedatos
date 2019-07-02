package baseDatos.modelo.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import baseDatos.modelo.Dato;
import baseDatos.modelo.bdd.BaseDeDatos;


public class ListarTest {
	
	private BaseDeDatos base;


	@Before
	public void setUp() throws Exception {
		this.base= new BaseDeDatos();

	}



	@Test
	public void testListaTamañoRetornaValorTrue() {
			
			this.base.agregar(new Dato("C6", "martinrivas"));
			this.base.agregar(new Dato("C7", "cartero"));
			this.base.agregar(new Dato("C8", "resplandor"));
			this.base.agregar(new Dato("C9", "kybalion"));
			this.base.agregar(new Dato("C10", "demian"));

			
			
			int largo = this.base.listar().size();
			System.out.println("lista elementos: True" + largo);
			assertTrue("ES" + largo + "TRUE" , largo ==5);
			
		}

	}


