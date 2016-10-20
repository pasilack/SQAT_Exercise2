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
	
	@Test
	public void test_CommandTurnLeftTwoTimesOnANewPlanet() {
		PlanetExplorer pe = new PlanetExplorer(100, 100, "");
		pe.executeCommand("l");
		String result = pe.executeCommand("l");
		assertEquals("0,0,S" , result);
	}
	
	@Test
	public void test_CommandTurnRightOnANewPlanet() {
		PlanetExplorer pe = new PlanetExplorer(100, 100, "");
		assertEquals("0,0,E" ,pe.executeCommand("r"));
	}
	
	@Test
	public void test_CommandTurnRightTwoTimesOnANewPlanet() {
		PlanetExplorer pe = new PlanetExplorer(100, 100, "");
		pe.executeCommand("r");
		String result = pe.executeCommand("r");
		assertEquals("0,0,S" , result);
	}
	
	@Test
	public void test_CommandTurnRightThreeTimesOnANewPlanet() {
		PlanetExplorer pe = new PlanetExplorer(100, 100, "");
		pe.executeCommand("r");
		pe.executeCommand("r");
		String result = pe.executeCommand("r");
		assertEquals("0,0,W" , result);
	}
	
	@Test
	public void test_CommandTurnRightFourTimesOnANewPlanet() {
		PlanetExplorer pe = new PlanetExplorer(100, 100, "");
		pe.executeCommand("r");
		pe.executeCommand("r");
		pe.executeCommand("r");
		String result = pe.executeCommand("r");
		assertEquals("0,0,N" , result);
	}
}
