package org.example.smooks;

import org.smooks.Smooks;
import org.xml.sax.SAXException;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException, SAXException {
		final long start = System.currentTimeMillis();
		Smooks smooks = new Smooks("smooks-config.xml");
		System.out.println(System.currentTimeMillis() - start);
	}
}
