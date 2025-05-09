package Org.testing.assertion;

import Org.testing.Utilities.LogsCapture;

public class SoftAssertion {

	public static void assertion1(String actual, String expected, String classname) {

		if (actual.equals(expected)) {
			LogsCapture.takeLog(classname, "Assertion has been PASSED");
		} else {
			LogsCapture.takeLog(classname, "Assertion has been FAILED");
		}
	}
}
