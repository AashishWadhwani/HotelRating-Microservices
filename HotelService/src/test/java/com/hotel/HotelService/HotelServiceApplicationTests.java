package com.hotel.HotelService;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class HotelServiceApplicationTests {

	Calculator cal = new Calculator();

	@Test
	void contextLoads() {
	}

	@Test
	void testSum(){
		int actual = cal.doSum(2,3,6);
		int expected = 11;
		assertThat(actual).isEqualTo(expected);
	}

	@Test
	void testMul(){
		int actual = cal.doMul(2,3);
		int expected = 6;
		assertThat(actual).isEqualTo(expected);
	}
}
