package interfaz;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import dominio.Auto;
import dominio.Bicicleta;
import dominio.Moto;
import dominio.Tren;

public class TestSistema {

	@Test
	public void queSePuedaCrearUnAuto() {
		Auto nuevo = new Auto("JJZ526", 5, 240, 41.40338, 2.17403);
		assertEquals("JJZ526", nuevo.getPatente());
		assertEquals((Integer) 5, nuevo.getCantidadMaximaDePasajeros());
		assertEquals((Integer) 240, nuevo.getVelocidadMaxima());
		assertEquals((Double) 41.40338, nuevo.getLatitud());
		assertEquals((Double) 2.17403, nuevo.getLongitud());
	}

	@Test
	public void queSePuedaCrearUnaMoto() {
		Moto nuevo = new Moto("094AB5", 200, 41.40338, 2.17403);
		assertEquals("094AB5", nuevo.getPatente());
		assertEquals((Integer) 2, nuevo.getCANTIDAD_MAXIMA_DE_PASAJEROS());
		assertEquals((Integer) 200, nuevo.getVelocidadMaxima());
		assertEquals((Double) 41.40338, nuevo.getLatitud());
		assertEquals((Double) 2.17403, nuevo.getLongitud());
	}

	@Test
	public void queSePuedaCrearUnaBicicleta() {
		Bicicleta nuevo = new Bicicleta(41.40338, 2.17403);
		assertEquals((Double) 41.40338, nuevo.getLatitud());
		assertEquals((Double) 2.17403, nuevo.getLongitud());

	}

	@Test
	public void queSePuedaCrearUnTren() {
		Tren nuevo = new Tren(15, 250, 100, 41.40338, 2.17403);
		assertEquals((Integer) 15, nuevo.getCantidadDeVagones());
		assertEquals((Integer) 250, nuevo.getCantidadDePasajerosPorVagon());
		assertEquals((Integer) 100, nuevo.getVelocidadMaxima());
		assertEquals((Double) 41.40338, nuevo.getLatitud());
		assertEquals((Double) 2.17403, nuevo.getLongitud());

	}

}
