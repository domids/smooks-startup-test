package org.example.smooks;

import org.smooks.Smooks;
import org.xml.sax.SAXException;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException, SAXException {
		Smooks smooks = new Smooks("smooks-config.xml");
	}
}
