/**
 * 
 */
package com.example.demo.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * File： MD5EncodeUtils.java<br>
 * Title: <br>
 * Description: 密码使用MD5编码方式加密<br>
 * Company: <br>
 * 
 * @author
 * @version
 */
public class MD5EncodeUtils {

	/**
	 * 
	 * @param text
	 * @return String <br>
	 */
	public static String encodeMD5Lower32Bit(String text) {

		String result = null;

		try {
			// 设置MD5加密计算方式
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			byte[] byteText = text.getBytes();
			messageDigest.digest(byteText);
			byte[] byteResult = messageDigest.digest();

			// 计算字符串byte的位运算
			StringBuffer stringBuffer = new StringBuffer();
			for (byte b : byteResult) {
				int byteValue = b & 0xff;
				if (byteValue < 16) {
					stringBuffer.append(0);
				}

				stringBuffer.append(Integer.toHexString(byteValue));
				result = stringBuffer.toString();
			}
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	/**
	 * 
	 * @param text 加密字符串
	 * @return String <br>
	 */
	public static String encodeMD5Upper32Bit(String text) {

		String result = encodeMD5Lower32Bit(text);
		return result.toUpperCase();
	}
}
