package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		//Scannerクラスのオブジェクト生成
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		
		//じゃんけんの手を判定
		if(input.equals("r") || input.equals("s") || input.equals("p")) {
			scanner.close();
		}else {
			System.out.println("じゃんけんの手ではない為、再度入力してください");
		}
		
		return input;
	}
	
	    //じゃんけんの手を乱数で選ぶ
	  public String getRandom() {
		  //配列にじゃんけんの手をセット
		  String[] jankenArray = {"r","s","p"};
		  String choice = jankenArray[(int) Math.floor(Math.random()* 3)];
		  return choice;
	  }
	  
	  public void playGame() {
		  //自分と対戦相手のじゃんけんの手を出力
		  HashMap<String,String> hashmap = new HashMap<String,String>();
		  hashmap.put("r","グー");
		  hashmap.put("s","チョキ");
		  hashmap.put("p","パー");
		  
		  //自分と対戦相手のじゃんけんの手を取得
		  String rsp = getMyChoice();
		  String random = getRandom();
		  
		  System.out.println("自分の手は" + hashmap.get(rsp) +","+ "対戦相手の手は" + hashmap.get(random));
		  
		  //自分と対戦相手のじゃんけんの手の比較
		  if(rsp.equals(random)) {
			  System.out.println("あいこです");
		  } else if((rsp.equals("r") && random.equals("s")) || (rsp.equals("s") && random.equals("p")) || (rsp.equals("p") && random.equals("r"))) {
			  System.out.println("自分の勝ちです");
		  } else
		      System.out.println("自分の負けです");
	      
	    	  
	  }

}
