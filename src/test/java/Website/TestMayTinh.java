package Website;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Website.MayTinh;

public class TestMayTinh {
	@Test
	public void testPhepCong() {
		assertEquals(15, MayTinh.cong(10, 5), 0.01);
	}

	@Test
	public void testPhepTru() {
		assertEquals(10, MayTinh.tru(15, 5), 0.01);
	}
}
