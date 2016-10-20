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
	public void test_CommandTurnLeftThreeTimesOnANewPlanet() {
		PlanetExplorer pe = new PlanetExplorer(100, 100, "");
		pe.executeCommand("l");
		pe.executeCommand("l");
		String result = pe.executeCommand("l");
		assertEquals("0,0,E" , result);
	}
	
	@Test
	public void test_CommandTurnLeftFourTimesOnANewPlanet() {
		PlanetExplorer pe = new PlanetExplorer(100, 100, "");
		pe.executeCommand("l");
		pe.executeCommand("l");
		pe.executeCommand("l");
		String result = pe.executeCommand("l");
		assertEquals("0,0,N" , result);
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
	
	@Test
	public void test_CommandMoveForwardOnceOnANewPlanet() {
		PlanetExplorer pe = new PlanetExplorer(100, 100, "");
		String result = pe.executeCommand("f");
		assertEquals("0,1,N" , result);
	}
	
	@Test
	public void test_CommandMoveForwardTwoTimesOnANewPlanet() {
		PlanetExplorer pe = new PlanetExplorer(100, 100, "");
		pe.executeCommand("f");
		String result = pe.executeCommand("f");
		assertEquals("0,2,N" , result);
	}
	
	@Test
	public void test_CommandMoveForwardAndBackwardOnceOnANewPlanet() {
		PlanetExplorer pe = new PlanetExplorer(100, 100, "");
		pe.executeCommand("f");
		String result = pe.executeCommand("b");
		assertEquals("0,0,N" , result);
	}
	
	@Test
	public void test_CommandMoveBackwardTwiceAndForwardOnceWhileHeadingIsWestOnANewPlanet() {
		PlanetExplorer pe = new PlanetExplorer(100, 100, "");
		pe.executeCommand("l");
		pe.executeCommand("b");
		pe.executeCommand("b");
		String result = pe.executeCommand("f");
		assertEquals("1,0,W" , result);
	}
	
	@Test
	public void test_CommandMoveBackwardTwiceAndForwardOnceWhileHeadingIsSouthOnANewPlanet() {
		PlanetExplorer pe = new PlanetExplorer(100, 100, "");
		pe.executeCommand("l");
		pe.executeCommand("l");
		pe.executeCommand("b");
		pe.executeCommand("b");
		String result = pe.executeCommand("f");
		assertEquals("0,1,S" , result);
	}
	
	@Test
	public void test_CommandMoveForwardTwiceAndBackwardOnceWhileHeadingIsEastOnANewPlanet() {
		PlanetExplorer pe = new PlanetExplorer(100, 100, "");
		pe.executeCommand("l");
		pe.executeCommand("l");
		pe.executeCommand("l");
		pe.executeCommand("f");
		pe.executeCommand("f");
		String result = pe.executeCommand("b");
		assertEquals("1,0,E" , result);
	}
	
	@Test
	public void test_CommandMoveForwardTwoTimesWithASingleCommandOnANewPlanet() {
		PlanetExplorer pe = new PlanetExplorer(100, 100, "");
		String result = pe.executeCommand("ff");
		assertEquals("0,2,N" , result);
	}
	
	@Test
	public void test_CommandMoveForwardTwoTimesTurnRightMoveForwardTwoTimesOnANewPlanet() {
		PlanetExplorer pe = new PlanetExplorer(100, 100, "");
		String result = pe.executeCommand("ffrff");
		assertEquals("2,2,E" , result);
	}
	
	@Test
	public void test_CommandMoveBackwardOnceOnANewPlanet() {
		PlanetExplorer pe = new PlanetExplorer(100, 100, "");
		String result = pe.executeCommand("b");
		assertEquals("0,99,N" , result);
	}
	
	@Test
	public void test_CommandMoveBackwardOnceWhileHeadingIsEastOnANewPlanet() {
		PlanetExplorer pe = new PlanetExplorer(100, 100, "");
		pe.executeCommand("r");
		String result = pe.executeCommand("b");
		assertEquals("99,0,E" , result);
	}
	
	@Test
	public void test_CommandMoveForwardOnceWhileHeadingIsEastOnPosition99_99() {
		PlanetExplorer pe = new PlanetExplorer(100, 100, "");
		pe.setCurrentPosition(99, 99, 'E');
		String result = pe.executeCommand("f");
		assertEquals("0,99,E" , result);
	}
}
