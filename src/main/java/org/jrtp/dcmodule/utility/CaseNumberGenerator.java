package org.jrtp.dcmodule.utility;

import java.util.Random;

/**
 * @author vaibhav
 *@date 15-Oct-2022
 * 
 */
public class CaseNumberGenerator {

	/**
	 * @return
	 */
	public static String generateNumber() {
		StringBuilder result = new StringBuilder();
		String str = "0123456789";
		for(int i = 0; i < 10; i++) {
			int num = new Random().nextInt(str.length());
			result.append(str.charAt(num));
		}
		return result.toString();
	}

}
