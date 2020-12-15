import java.util.Arrays;

public class Kadai03 {

	/**
	 * 課題03
	 * 文字列の中に含まれるアルファベットを調べて、返すメソッド
	 * @param s 文字列
	 * @return sの中に入っていた文字
	 */
	char[] CharacterList(String s) {
		int k=0;
         s= s.toUpperCase();
		char[] a= s.toCharArray();
		Arrays.sort(a);
		char[] c = new char[26];
		for(int i=0;i<a.length-1;) {
			 c[k]=a[i];
			  k = k +1;
	     for(int r=1;r<a.length;r++) {
			if(a[i]==a[r]) break;
			 i=r;
			}

         }

       	return c;
		}
	}
