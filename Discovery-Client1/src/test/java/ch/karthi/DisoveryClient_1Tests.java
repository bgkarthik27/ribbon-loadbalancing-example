package ch.karthi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest
public class DisoveryClient_1Tests {

	@Autowired
	MockMvc mockMvc;

	@Test
	public void testGetFlux() throws Exception {
//		mockMvc.perform(get("/flux")).andExpect(content().string(containsString("1")));
	}

}
