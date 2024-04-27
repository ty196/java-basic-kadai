package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	public  void dictinary(String[] words) {
		//HashMapを宣言
		HashMap<String,String> fruits = new HashMap<String,String>();
		//英単語と意味の追加
		fruits.put("apple","りんご");
		fruits.put("peach","桃");
		fruits.put("banana","バナナ");
		fruits.put("lemmon","レモン");
		fruits.put("pear","梨");
		fruits.put("kiwi","キウィ");
		fruits.put("strawberry","いちご");
		fruits.put("grape","ぶどう");
		fruits.put("muscat","マスカット");
		fruits.put("cherry","さくらんぼ");
		//英単語が辞書に追加されているか判定
		for(String word: words) {
			//調べたい単語が存在する場合
			if(fruits.containsKey(word)) {
				System.out.println(word + "の意味は" + fruits.get(word));
			} else {
				System.out.println(word +"は辞書に存在しません");
			}
			
		}
		}

	}


