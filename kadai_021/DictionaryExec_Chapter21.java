package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		//辞書クラスのインスタンス作成
		Dictionary_Chapter21 fruitsDictinary = new Dictionary_Chapter21(); 
		//英単語を配列にセット
		String[] words = {"apple","banana","grape","orange"};
		//辞書を調べる
		fruitsDictinary.dictinary(words);

	}

}
