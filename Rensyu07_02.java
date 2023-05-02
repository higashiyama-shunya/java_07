package rensyu07;

public class Rensyu07_02 {

	public static void main(String[] args) {
		//P168　通過テスト
		//(1)
		System.out.println("(1)");
		double[] n= {12.3,13.5,11.5,13.0,12.8,12.5};
		double total=0;
		for(double num:n) {	//拡張for文で配列nの要素をnumに代入する
			total+=num;		//0に設定したtotalにnumを加算していく
		}
		double avg=total/n.length;	//合計を要素数で割って平均を出す。
		
		System.out.println("合計="+total);
		System.out.println("平均="+avg);
		
		for(double num:n) {
			System.out.print(num+"\t");
		}
		
		//(2)
		System.out.println("\n\n(2)");
		String[] name= {"田中","中村","鈴木","山本","本田"};
		double[] kokugo= {82,85,74,90,70};
		double[] eigo= {70,74,88,74,82};
		double kokutotal=0;
		double eitotal=0;
		for(double koku:kokugo) {
			kokutotal+=koku;
		}
		double kokuavg=kokutotal/kokugo.length;
		
		System.out.println("国語平均="+kokuavg);
		for(double ei:eigo) {
			eitotal+=ei;
		}
		double eiavg=eitotal/eigo.length;
		System.out.println("英語平均="+eiavg);
		
		double allavg=eiavg+kokuavg/2;
		
		for(int i=0;i<5;i++) {
			System.out.println(name[i]+"\t:\t"+(kokugo[i]+eigo[i])/2);
		}
		
		//(3)
		System.out.println("\n(3)");
		int[] n2= {1,2,3,4,5,6,7,8,9};
		for(int i=8;i>=0;i--) {
			System.out.print(n2[i]);
		}
		
	}

}
