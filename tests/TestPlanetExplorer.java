import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_createPlanet() {
		PlanetExplorer pe = new PlanetExplorer(100, 100, "");
		assertEquals(100, pe.getX());
	}
	
	@Test
	public void test_emptyCommandOnANewPlanet() {
		PlanetExplorer pe = new PlanetExplorer(100, 100, "");
		assertEquals("0,0,N" ,pe.executeCommand(""));
	}
	
	@Test
	public void test_CommandTurnLeftOnANewPlanet() {
		PlanetExplorer pe = new PlanetExplorer(100, 100, "");
		assertEquals("0,0,W" ,pe.executeCommand("l"));
	}
}
