public class FloatDetail{	
 	public static void main(String[] args){
 		//Java �ĸ����ͳ���(����ֵ)Ĭ��Ϊdouble����,����float�ͳ���,����'f' ���� 'F'
 		//float num1 = 1.1; //����,��һ��double���ʹ洢��һ��float�����оͻ�������ȵ���ʧ
 		float num2 = 1.1F;//��
 		double num3 = 1.1;//��
 		double num4 = 1.1f;//��

 		//ʮ��������ʽ :��:5.12  512.0f   .512(������С����)
 		double num5 = .123;//�ȼ���0.123
 		System.out.println(num5);

 		//ʹ�ÿ�ѧ��������ʽ:��:5.12e2[5.12 * 10��2�η�]
 		//5.12E-2 [5.12 * 10 ��-2�η�]
 		System.out.println(5.12e2);//��Ϊ�����double���͵�����,Ĭ���ڸ�λ�������С����
 		System.out.println(5.12E-2);

 		//ͨ�������,Ӧ��ʹ��double����,��Ϊ����float�͸��ӵľ�ȷ
 		// double num9 = 2.1234567851;float num10 = 2.123456781F
 		double num9 = 2.1234567851;
 		float num10 = 2.123456781F;
 		System.out.println(num9);
 		System.out.println(num10);//��float������������ȱʧ

 		//��������ʹ������: 2.7 �� 8.1 / 3 �Ƚ�
 		//����һ�δ���
 		double dnum1  = 2.7;
 		double dnum2 = 8.1 / 3;
 		System.out.println(dnum1);
 		System.out.println(dnum2);
 		//2.7
		//2.6999999999999997 ����ó��Ľ����������2.7
		
		//�õ�һ����Ҫ��ʹ�õ�:�����Ƕ���������С���Ľ�������ж���,ҪС��
		//�����С����ȷ��,Ӧ�������������Ĳ�ֵ�ľ���ֵ,��ĳһ�����ȷ�Χ�����ж�
		if (dnum1 == dnum2) {
			System.out.println("���");		
		}

		//��ȷ��д��
		if(Math.abs(dnum1 - dnum2) < 0.000001) {
			System.out.println("��ֵ�ǳ���С,���ҵĹ涨����,��Ϊ���...");
		}
		System.out.println(Math.abs(dnum1 - dnum2));

		//ϸ��:�����ֱ�Ӳ�ѯ�õ���С������ֱ�Ӹ�ֵ,�ǿ����ж���ȵ�
 }
}