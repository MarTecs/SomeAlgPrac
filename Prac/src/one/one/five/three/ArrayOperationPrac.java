package one.one.five.three;

/**
 * 
 * @author sivan
 * @todo �������ݴ�����룬��double������Ϊʾ��
 * @time 2017��8��11�� ����10:37:35
 */
public class ArrayOperationPrac {
	
	private static double[] db = new double[10];
	
	/**
	 * ��ʼ������
	 */
	public static void initArray() {
		
		//����10��100���ڵ������������С��
		for (int i = 0; i < 10; i++) {
			db[i] = (double) (Math.random() * 100);
		}
	}
	
	/**
	 * ��ӡ��������
	 */
	public static void printArray() {
		
		for (int i = 0; i < db.length; i++) {
			if(i % 4 == 0 && i != 0) {
				System.out.println();
			}
			System.out.print(db[i] + "\t");
		}
	}

	public static void main(String[] args) {
		
		//��ʼ������
		initArray();
		System.out.println("��ʼ���������Ϊ��");
		printArray();
		
		
		//�ҳ���������Ԫ��
		double max = db[0];
		for (int i = 1; i < db.length; i++) {
			
			if (max < db[i] )
			{
				max = db[i];
			}
		}
		System.out.println();
		System.out.print("�������Ԫ��Ϊ��" + max);
		
		
		
		//�ҳ�����Ԫ�ص�ƽ��ֵ
		double sum = db[0];
		for (int i = 1; i < db.length; i++) {
			sum += db[i]; 
		}
		System.out.println();
		System.out.print("����Ԫ�ص�ƽ��ֵΪ��" + sum / db.length);
		
		
		//��������
		double[] array = new double[db.length];
		for (int i = 0; i < db.length; i++) {
			array[i] = db[i];
		}
		System.out.println();
		System.out.println("���ƺ������array���£�");
		printArray();
		
		//�ߵ�����Ԫ�ص�˳��
		double temp = 0;
		for (int i = 0; i < db.length / 2; i++) {
			temp = db[i];
			db[i] = db[db.length - 1 - i];
			db[db.length - 1 - i] = temp;
		}
		System.out.println();
		System.out.print("�ߵ�����Ԫ�ص�˳��Ϊ��");
		printArray();
		
		//ʵ�ַ������
		int[][] a = {
				{1,2,3}, 
				{4,5,6}, 
				{7,8,9}
		};
		
		int[][] b = {
				{9,8,7},
				{6,5,4},
				{3,2,1}
		};
		
		System.out.println();
		int[][] c = new int[3][3];
		
		System.out.println("������˽��Ϊ��");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		

	}

}
