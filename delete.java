package question6;

public class delete {
	public static void deleteElement(int[] array,int index) {
		int[] newArray = new int[array.length - 1];
		for (int i = 0, j = 0; i < array.length; i++) {
		 if (i != index) {
		 newArray[j++] = array[i];
		 }
		 if(index==0 && index>=array.length ) {
			 System.out.println("invalid index");
			 
		 }
		}
	}
  

}
