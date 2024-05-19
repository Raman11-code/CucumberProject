
public class BubbleSorting {
//bubble sort is a Sorting technique where we are arranging the data in ascending order by comparing its adjacent element 
	public static void main(String[] args) {
		int[] a = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};  
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j]) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		}
		for(int i =0;i<a.length;i++) {
			System.out.print(a[i] +" ");
		}
		

	}
}
