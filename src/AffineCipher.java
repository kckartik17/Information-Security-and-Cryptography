class AffineCipher {
	public static String encryptMessage(String msg, int x, int y) {
		String cipher = "";
		for (int i = 0; i < msg.length(); i++) {

			if (msg.charAt(i) != ' ')

				cipher = cipher + (char) ((((x * (msg.charAt(i) - 'A')) + y) % 26) + 'A');
			else
				cipher += msg.charAt(i);
		}
		return cipher;
	}

	public static String decryptMessage(String cipher, int x, int y) {
		String msg = "";
		int a_inv = 0;
		int flag = 0;

		for (int i = 0; i < 26; i++) {
			flag = (x * i) % 26;

			if (flag == 1) {
				a_inv = i;
			}
		}
		for (int i = 0; i < cipher.length(); i++) {
			if (cipher.charAt(i) != ' ')

				msg = msg + (char) (((a_inv * ((cipher.charAt(i) + 'A' - y)) % 26)) + 'A');
			else
				msg += cipher.charAt(i);
		}

		return msg;
	}

	public static void main(String[] args) {
		String msg = "cryptography is an easy subject";

		System.out.println("Original msg : " + msg);
		String encryptmsg = encryptMessage(msg, 7, 1);
		System.out.println("Encrypted Message : " + encryptmsg);
		System.out.println("Decrypted Message : " + decryptMessage(encryptmsg, 7, 1));
	}

}
