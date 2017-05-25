package javase.basic.junit;

public class Largest {
	
	/**
	 * 返回list数组中最大的数
	 * @param list 整数数组list
	 * @return 返回给定list数组的最大数
	 */
	public static int largest(int[] list){
		int index,max=Integer.MIN_VALUE;
		if(list.length==0){
			throw new RuntimeException("Empty lsit");
		}
		for (index = 0;index<list.length;index++){
			if(list[index]>max){
				max=list[index];
			}
		}
		return max;
	}
}
