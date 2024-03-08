package edu.badpals.cotxox.tarifa;
import org.junit.Test;

import edu.badpals.cotxox.carrera.Carrera;

import static org.junit.Assert.assertEquals;

import org.junit.Before;    
    
public class TarifaTest {
    private Carrera carrera;
    
    @Before
    public void setup(){
        /* 
		 * Configuracion del usuario
		 * y de la Carrera. 
		 */

		String tarjetaCredito = "4916119711304546";
		String origen = "Aeroport Son Sant Joan";
		String destino = "Magaluf";
		double distancia = 7.75;
		int tiempoEsperadoMinutos = 10;

		carrera = new Carrera(tarjetaCredito);
		carrera.setOrigen(origen);
		carrera.setDestino(destino);
		carrera.setDistancia(distancia);
		carrera.setTiempoEsperado(tiempoEsperadoMinutos);
    }
        
    @Test
    public void testCarreraGetCosteEsperado() {
        double expResult = 13.9625;
        assertEquals(expResult, Tarifa.getCosteTotalEsperado(carrera), 0);
    }
}
    