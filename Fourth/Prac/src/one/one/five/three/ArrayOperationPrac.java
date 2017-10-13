package one.one.five.three;

/**
 * 
 * @author sivan
 * @todo 典型数据处理代码，以double类型作为示范
 * @time 2017年8月11日 下午10:37:35
 */
public class ArrayOperationPrac {
	
	private static double[] db = new double[10];
	
	/**
	 * 初始化数组
	 */
	public static void initArray() {
		
		//生成10个100以内的随机数，包括小数
		for (int i = 0; i < 10; i++) {
			db[i] = (double) (Math.random() * 100);
		}
	}
	
	/**
	 * 打印数组内容
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
		
		//初始化数组
		initArray();
		System.out.println("初始化后的数组为：");
		printArray();
		
		
		//找出数组最大的元素
		double max = db[0];
		for (int i = 1; i < db.length; i++) {
			
			if (max < db[i] )
			{
				max = db[i];
			}
		}
		System.out.println();
		System.out.print("数组最大元素为：" + max);
		
		
		
		//找出数组元素的平均值
		double sum = db[0];
		for (int i = 1; i < db.length; i++) {
			sum += db[i]; 
		}
		System.out.println();
		System.out.print("数组元素的平均值为：" + sum / db.length);
		
		
		//复制数组
		double[] array = new double[db.length];
		for (int i = 0; i < db.length; i++) {
			array[i] = db[i];
		}
		System.out.println();
		System.out.println("复制后的数组array如下：");
		printArray();
		
		//颠倒数组元素的顺序
		double temp = 0;
		for (int i = 0; i < db.length / 2; i++) {
			temp = db[i];
			db[i] = db[db.length - 1 - i];
			db[db.length - 1 - i] = temp;
		}
		System.out.println();
		System.out.print("颠倒数组元素的顺序为：");
		printArray();
		
		//实现方阵相乘
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
		
		System.out.println("矩阵相乘结果为：");
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
