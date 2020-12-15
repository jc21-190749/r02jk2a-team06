import java.util.Arrays;

public class Kadai03 {

	/**
	 * 課題03
	 * 文字列の中に含まれるアルファベットを調べて、返すメソッド
	 * @param s 文字列
	 * @return sの中に入っていた文字
	 */
	char[] CharacterList(String s) {
         s= s.toUpperCase();
		char[] a= s.toCharArray();
		Arrays.sort(a);
		char[] c = new char[26];
		for(int i=0;i<a.length-1;i++) {
			for(int r=0;r<a.length-1;i++) {
				if(c[i]==a[r]) {
					break;
	      	}
			 c[i]=a[r];
         }
		}
       	return c;
		}
	}
