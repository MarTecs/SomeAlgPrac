package 排序算法类的模板;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class Example {
	
	/**
	 * 排序核心算法写在里面
	 * @param a
	 */
	public static void sort (Comparable[] a)
	{
		
	}
	
	
	private static boolean less (Comparable v, Comparable w)
	{
		return v.compareTo(w) < 0;		//v < w 返回true
	}
	
	private static void exch (Comparable[] a, int i , int j)
	{
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	private static void show (Comparable[] a)
	{
		for ( int i = 0; i < a.length; i++ )
			StdOut.print(a[i] + " ");
		StdOut.println();
	}
	
	public static boolean isSorted(Comparable[] a)
	{
		//测试数组元素是否有序
		for ( int i = 0; i < a.length; i++ )
			if ( less(a[i], a[i-1]))
				return false;
		return true;
	}
	
	public static void main(String[] args)
	{
		//从标准输入读取字符串，将它们排序并输出
		String[] a = In.readStrings();
		sort(a);
		assert isSorted(a);
		show(a);
	}
	
}