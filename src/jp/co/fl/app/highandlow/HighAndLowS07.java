package jp.co.fl.app.highandlow;

import java.util.Scanner;

public class HighAndLowS07 {

	public static void main(String[] args) {
		// ゲームタイトル
		System.out.println("*".repeat(14));
		System.out.println("* High & Low *");
		System.out.println("*".repeat(14));
		
		//　ゲームスタート
		while (true) {
			// 右と左のカードをランダムにする（1-9)
			int leftCard = (int) (Math.random() * 9) + 1;
			int rightCard = (int) (Math.random() * 9) + 1;

			System.out.println("[問題表示]");
			System.out.println(" *****  ***** ");
			System.out.println(" * * *  * * *");
			System.out.println(" * " + leftCard + " *  * * * ");
			System.out.println(" * * *  * * * ");
			System.out.println(" *****  ***** ");

			// select 変数を作成する
			String select = null;
			boolean isSelected = false;

			Scanner sc = new Scanner(System.in);

			while (isSelected == false) {
				System.out.println("High or Low? (h/l)");
				select = sc.next();

				if (select.equals("h")) {
					System.out.println("You selected high.");
					isSelected = true;
				} else if (select.equals("l")) {
					System.out.println("-->You selected low.");
					isSelected = true;
				} else {
					System.out.println("Please select from h or l.");
				}
			}

			System.out.println("[結果表示]");
			System.out.println(" *****  ***** ");
			System.out.println(" *   *  * * *");
			System.out.println(" * " + leftCard + " *  * " + rightCard + " * ");
			System.out.println(" *   *  * * * ");
			System.out.println(" *****  ***** ");

			String result;

			if (leftCard > rightCard) {
				result = "h";
			} else if (leftCard < rightCard) {
				result = "l";
			} else {
				result = "予想した変数 select の値";
			}

			if (select.equals(result)) {
				System.out.println("You Win!");
			} else {
				System.out.println("You Lose...");
				break;
			}
		}
		// 終了メッセージ
		System.out.println("**ゲーム終了**");
	}

}
