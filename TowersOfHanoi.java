public class TowersOfHanoi{
	public void towersOfHanoi(int n, char start, char aux, char end) {
		
		//If there is only one disk, shift it to end Tower
        if (n == 1) {
            System.out.println(start + " shifting to -> " + end);
        } else {
        	//Move top n-1 disks from start A to B using C as Auxiliary 
        	towersOfHanoi(n - 1, start, end, aux);
        	//Move the nth (only remaining) disk from start A to  destination C
            System.out.println(start + " shifting to -> " + end);
            //move the top n-1 disk from aux B to end C using A as Auxiliary
            towersOfHanoi(n - 1, aux, start, end);
        }
}

public static void main(String[] args) {

	TowersOfHanoi towersOfHanoi = new TowersOfHanoi();

        System.out.print("Enter number of discs: ");
        int discs = 10;
        towersOfHanoi.towersOfHanoi(discs, 'A', 'B', 'C');
}

}