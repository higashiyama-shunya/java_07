package rensyu07;

public class Rensyu07_01 {

	public static void main(String[] args) {
		//P152 練習問題7-1
		double[] x= {167.5,180.3,177.6,166.7,182.5,175.4};
		double total=0;		//合計の変数に0を代入
		
		for(int i=0;i<x.length;i++) {
			total+=x[i];	//totalにfor文で繰り返し配列の中の要素を足していく
		}
		double avg=total/x.length;	//合計に要素数で割って平均を出す。
		
		System.out.println(total);
		System.out.println(avg);	//出した合計と平均を表示する
		
		//P154 練習問題7-2
		System.out.println("");
		double[] val= {188.2,175.6,154.5,168.2,178.0};
		for(int i=0;i<val.length;i++) {
			System.out.println(val[i]);	//double型の配列からfor文でiを取り出す
		}
		double total2=0;
		for(int i=0;i<val.length;i++) {
			total2+=val[i];
			System.out.println(total2);
		}
		
		double mean=total2/val.length;
		System.out.println(mean);
		
		for(int i=0;i<val.length;i++) {
			System.out.println(Math.pow(val[i]-mean, 2));
		}
	}

}
