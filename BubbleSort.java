public class BubbleSort {
	static int[] array = {9,8,7,19,4,4,3,2,1,0};
	static int current;
	public static void main(String[] args){
		boolean sorted = true;
        
		while(sorted){
			sorted = false;
			//begin search array
			for(int i = 0; i<array.length-1;i++){
				//switch with number ahead if current is bigger than next
				if(array[i] > array[i+1]){
					
					current=array[i+1];
					array[i+1] = array[i];
					array[i] = current;
					
					sorted = true;
				} 
			
			}
		}
		for(int j=0;j<array.length;j++){
			System.out.print("    " + array[j]);
		}
	}
}
