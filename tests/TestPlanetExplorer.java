import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_createPlanet() {
		Planet p = new Planet(100, 100);
		assertEquals(100,p.getX());
	}
}
