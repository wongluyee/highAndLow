package jp.co.fl.app.highandlow;

import java.util.Scanner;

public class HighAndLowS05 {

	public static void main(String[] args) {
		// ゲームタイトル
		System.out.println("*".repeat(14));
		System.out.println("* High & Low *");
		System.out.println("*".repeat(14));

		int leftCard = (int) (Math.random() * 9) + 1;
		int rightCard = (int) (Math.random() * 9) + 1;

		System.out.println("[問題表示]");
		System.out.println(" *****  ***** ");
		System.out.println(" *   *  * * *");
		System.out.println(" * " + leftCard + " *  * * * ");
		System.out.println(" *   *  * * * ");
		System.out.println(" *****  ***** ");

		Scanner sc = new Scanner(System.in);
		System.out.println("High or Low? (h/l)");
		String select = sc.next();

		if (select.equals("h")) {

			System.out.println("You selected high.");
		} else if (select.equals("l")) {

			System.out.println("-->You selected low.");
		} else {
			System.out.println("Please select from h or l.");
		}

		System.out.println("[結果表示]");
		System.out.println(" *****  ***** ");
		System.out.println(" *   *  * * *");
		System.out.println(" * " + leftCard + " *  * " + rightCard + " * ");
		System.out.println(" *   *  * * * ");
		System.out.println(" *****  ***** ");

		// 終了メッセージ
		System.out.println("**ゲーム終了**");
	}

}
