//	编写一个程序，有1，2,3,4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
//public class Lian1_522 {
//	public static void main(String[] args) {
//
//	        int i = 0;//保存到百位上的数字
//	        int j = 0;//保存到十位上的数字
//	        int k = 0;//保存到个位上的数字
//	        int t = 0;//保存数字的个数
//	        for(i = 1; i <= 4; i++) {
//	            for(j = 1; j <= 4; j++) {
//	                for(k = 1; k <= 4; k++) {
//	                    if(i != j&& j != k && i!= k) {
//	                        t += 1;
//	                        System.out.println(i*100 + j*10 + k);
//	                    }
//	                }
//	            }
//	        }
//	        System.out.println("总共能够组成" + t + "个数字！");
//	}
//}

public class Lian1_522 {
	public static void main(String[] args) {
		int a =0;
		int b =0;
		int c =0;
		int d =0;
		for(a = 1;a<=4;a++){
			for(b = 1;b<=4;b++){
				for(c =1;c<=4;c++){
					if(a !=b && a !=c && b!=c){
						d += 1;
								System.out.println(a*100+b*10+c);
					}
				}
			}
			
		}
		System.out.println("总共能够组成" + d + "个数字！");
		System.out.println("1111111111111111");
	}
}