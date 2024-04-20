package kadai_015;

public class CarExec_Chapter15 {
	public static void main(String[] args) {
	// 車クラスのインスタンス
	Car_Chapter15 CarGear = new Car_Chapter15(1,10);
	// gearメソッドの実行
	CarGear.gearChange(3);
	// runメソッドの実行
	CarGear.run();
	}
}
