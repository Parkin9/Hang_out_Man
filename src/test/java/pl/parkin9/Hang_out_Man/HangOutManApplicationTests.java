package pl.parkin9.Hang_out_Man;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.parkin9.Hang_out_Man.controller.IndexController;
import pl.parkin9.Hang_out_Man.service.CodewordService;
import pl.parkin9.Hang_out_Man.service.ReadFromFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HangOutManApplicationTests {

	@Autowired
	private IndexController indexController;
	@Autowired
	private ReadFromFile readFromFile;
	@Autowired
	private CodewordService codewordService;

///////////////////////////////////////////////////////////

	@Test
	public void contextLoads() {

		assertNotNull(indexController);
	}

	@Test
	public void readFromFileContent() throws IOException {

		List<String> contentOfFileTest = readFromFile.getContentFile();

		assertFalse(contentOfFileTest.isEmpty());
	}

	@Test
	public void shouldReturnRandomCodewordFromFileContent() throws IOException {

		String randResult1 = codewordService.getRandCodeword();
		String randResult2 = codewordService.getRandCodeword();
		String randResult3 = codewordService.getRandCodeword();
		String randResult4 = codewordService.getRandCodeword();

		assertFalse((randResult1.equals(randResult2))
							&& (randResult1.equals(randResult3))
							&& (randResult1.equals(randResult4)));
	}
}
