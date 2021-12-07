package org.example.smooks;

import org.junit.jupiter.api.Test;
import org.smooks.Smooks;
import org.xml.sax.SAXException;

import java.io.IOException;

public class SmooksStartupTest {
	@Test
	void startupSmooks() throws IOException, SAXException {
		final long start = System.currentTimeMillis();
		Smooks smooks = new Smooks("smooks-config.xml");
		System.out.println(System.currentTimeMillis() - start);
	}
}
