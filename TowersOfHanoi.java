public class TowersOfHanoi{
	
	public static void main(String[] args) {
		TowersOfHanoi tOH= new TowersOfHanoi();
		tOH.towersOfHanoi(4, 'A', 'B', 'C');
	}

	private void towersOfHanoi(int n, char source, char destination, char helper) {
		//Base case, If there is only one disk move it direct from source to destination
		if(n==1){
			System.out.println("Move from "+source+" to "+destination);
		}
		else{
			//Step1: Move the top n-1 disks from source to helper
			towersOfHanoi(n-1, source, helper, destination);
			//Step2: Move the nth disk from source to destination
			System.out.println("Move from "+source+" to "+destination);
			/*Step3: Move the n-1 disks(those you moved from source to helper in step1) 
			 * from helper to destination, using source(empty after step2) as helper
			 */
			towersOfHanoi(n-1, helper, destination, source);
		}
	}

}