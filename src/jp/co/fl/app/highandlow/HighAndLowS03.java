package jp.co.fl.app.highandlow;

public class HighAndLowS03 {

	public static void main(String[] args) {
		// ゲームタイトル
		System.out.println("*".repeat(14));
		System.out.println("* High & Low *");
		System.out.println("*".repeat(14));

		int leftCard = (int) (Math.random() * 9) + 1;

		System.out.println("[問題表示]");
		System.out.println(" *****  ***** ");
		System.out.println(" *   *  * * *");
		System.out.println(" * " + leftCard + " *  * * * ");
		System.out.println(" *   *  * * * ");
		System.out.println(" *****  ***** ");

		// 終了メッセージ
		System.out.println("**ゲーム終了**");
	}

}
