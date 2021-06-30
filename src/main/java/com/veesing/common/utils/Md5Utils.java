package com.veesing.common.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;


public class Md5Utils {
	private static final String SALT = "1qazxsw2open";

	private static final String ALGORITH_NAME = "md5";

	private static final int HASH_ITERATIONS = 2;

	public static String encrypt(String pswd) {
		return new SimpleHash(ALGORITH_NAME, pswd, ByteSource.Util.bytes(SALT), HASH_ITERATIONS).toHex();
	}

	public static String encrypt(String username, String pswd) {
		return new SimpleHash(ALGORITH_NAME, pswd, ByteSource.Util.bytes(username + SALT),HASH_ITERATIONS).toHex();
	}

	public static String digest(String aValue) {
		aValue = aValue.trim();
		byte[] value;
		try {
			String encodingCharset = "UTF-8";
			value = aValue.getBytes(encodingCharset);
		} catch (UnsupportedEncodingException e) {
			value = aValue.getBytes();
		}
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			return null;
		}
		return toHex(md.digest(value));

	}

	public static String toHex(byte[] input) {
		if (input == null) {
			return null;
		}
		StringBuilder output = new StringBuilder(input.length * 2);
		for (byte b : input) {
			int current = b & 0xff;
			if (current < 16) {
				output.append("0");
			}
			output.append(Integer.toString(current, 16));
		}
		return output.toString();
	}

}
