//	��дһ��������1��2,3,4�����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ�������Ƕ��٣�
//public class Lian1_522 {
//	public static void main(String[] args) {
//
//	        int i = 0;//���浽��λ�ϵ�����
//	        int j = 0;//���浽ʮλ�ϵ�����
//	        int k = 0;//���浽��λ�ϵ�����
//	        int t = 0;//�������ֵĸ���
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
//	        System.out.println("�ܹ��ܹ����" + t + "�����֣�");
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
		System.out.println("�ܹ��ܹ����" + d + "�����֣�");
		System.out.println("1111111111111111");
	}
}