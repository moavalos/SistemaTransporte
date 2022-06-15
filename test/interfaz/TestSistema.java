package interfaz;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import dominio.Auto;

public class TestSistema {
	
	@Test
	public void queSePuedaCrearUnAuto() {
		Auto nuevo = new Auto("JJZ526", 5, 240, 41.40338, 2.17403);
		assertEquals("JJZ526", nuevo.getPatente());
		assertEquals((Integer) 5, nuevo.getCantidadMaximaDePasajeros());
		assertEquals((Integer) 240, nuevo.getVelocidadMaxima());
	}

}
