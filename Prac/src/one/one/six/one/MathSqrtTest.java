package one.one.six.one;

/**
 * 
 * @author sivan
 * @todo TODO ���һ�� double ���͵�ƽ����
 * @time 2017��8��12�� ����11:18:56
 */
public class MathSqrtTest {
	
	
	public static void main(String[] args) {
		
		double a = 4;
		System.out.println(getSqrt(11));
		
	}
	
	/**
	 * ���һ������ƽ����
	 * @param number
	 */
	public static double getSqrt(double number)
	{
		if ( number < 0 ) {
			return Double.NaN;
		}
		
		double err = 1e-15;
		double err2 = 1e-99;
		System.out.println(err2);
		double t = number;
		while ( Math.abs(t - number / t) > err * t )
			t = ( number / t + t ) / 2.0;
		return t;
	}

}
