/**
 *
 */
package jp.exert.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author KATO
 *
 */
public class HelloConsole {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("Hello Console");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("文字列を入力してください。");
		String str = in.readLine();
		System.out.println("入力した文字列は " + str + " です。");

	}

}
