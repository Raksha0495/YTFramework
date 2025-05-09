package Org.testing.Utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogsCapture {

	public static void takeLog(String classname, String msg) {

		DOMConfigurator.configure("../Practice/layout.xml");
		Logger L = Logger.getLogger(classname);
		L.info(msg);

	}
}
