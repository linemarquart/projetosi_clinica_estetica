package com.fatec.Clinica.cryptography;

public class EncriptaDecriptaOTP {

	public String criptografa(String mensagem, String chave) {
		if (mensagem.length() != chave.length())
			error("O tamanho da mensagem e da chave devem ser iguais.");
		int[] im = charArrayToInt(mensagem.toCharArray());
		int[] ik = charArrayToInt(chave.toCharArray());
		int[] data = new int[mensagem.length()];

		for (int i = 0; i < mensagem.length(); i++) {
			data[i] = im[i] + ik[i];
		}

		return new String(intArrayToChar(data));
	}

	public String decriptografa(String mensagem, String chave) {
		if (mensagem.length() != chave.length())
			error("O tamanho da mensagem e da chave devem ser iguais.");
		int[] im = charArrayToInt(mensagem.toCharArray());
		int[] ik = charArrayToInt(chave.toCharArray());
		int[] data = new int[mensagem.length()];

		for (int i = 0; i < mensagem.length(); i++) {
			data[i] = im[i] - ik[i];
		}

		return new String(intArrayToChar(data));
	}

	public String genKey(int tamanho) {
		String keyBase = "puvURd6Vy7f0E3AiSkhNqU9r3u2t5bL7nhYKYll5XN3iM5lgJ5Lt5O37g01P7EfGfPQ9ID9QTfCwfkLHtxcJZqfUDQG0bbpfpb5UYuuyJmYTFPGtv4hc9F3KHn2qVGYARziHDbBtFgXA7DTXv3MuT8cvjmR1aBE7llOwDOUXCAtYPk9bNzGugHHa67rknkvQbHIzG6LPIXZbE8QAjd0aaaRxruZogTaVrLMMh48WGYEYV33Kj18J55nHweAfJ1cNfsljEzwoDXV1yTopi6m8hFh474w6TtAN6sknv5j2i2zrOTHy8ojMQgfT4UxC9v2f6UePa7en1VZIfabfqzfdupuRd8uRaw8MnvY8wkJFBDk1H78jPWBzspAwUmS2KdvP4l8b0pc7hGyxLyXYoW9zkGl2GDp4tm2h4IshOsKInV9gyKFhDkVmkr3n9LctStDggcoQSk7dtzsCOq0GUzukBbw53q6nbz5k7sWrdMd6sXy1SvWXkNhA8ZqeZmaWHdaJ73PF2CVCiE3k6WDDcuQK77Gx2159Sq7V7kn9GtKt655WX72hv9kaTZXbjo2YBvtEfnCFFxfNZCMUBXOZgJSJsVtTluJLjZhmeC3Hdv1MObjCWcyQErPAUJFqPRGdVSalnC2OCL61yOMFCgl9XC0dqhqCowj9zDTKIrBwd5Uh9UwKMTF1yPa4rKgrChFtb0ny2G8gDUGtI7GyIeBWSJRgyxKVu0KBohNRJyiyRq0W6pQ4QcioDrg8qohwDmTzc9O2MuWaVvrXHdHcsX82bJdkdrFnsGGnb3T4KlHTyY7FAQ6utJFILf9eAx85w1XibuBiFTixWRCTzWGAhOMqAEGY4chEdMRkJ3TLk71dDDvMTWDgsM74E8vYQOLnGRWxNjpBSZ1XHzxOxd4aG2sktsZHVNk8hQpnkRIIdTsCPofml6HNtzy4DWY2uyYL3rZRKVgFZaVKULg2LzH3XCmdtWj5dA0NyrDzZmKa7Rw74H8p";
	
		char[] key = new char[tamanho];
		for (int i = 0; i < tamanho; i++) {
			key[i] = keyBase.charAt(i);
		}
		return new String(key);
	}

	private int chartoInt(char c) {
		return (int) c;
	}

	private char intToChar(int i) {
		return (char) i;
	}

	private int[] charArrayToInt(char[] cc) {
		int[] ii = new int[cc.length];
		for (int i = 0; i < cc.length; i++) {
			ii[i] = chartoInt(cc[i]);
		}
		return ii;
	}

	private char[] intArrayToChar(int[] ii) {
		char[] cc = new char[ii.length];
		for (int i = 0; i < ii.length; i++) {
			cc[i] = intToChar(ii[i]);
		}
		return cc;
	}

	private void error(String msg) {
		System.out.println(msg);
		System.exit(-1);
	}
}