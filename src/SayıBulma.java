
public class SayıBulma {
	public static void main(String[] args) {
		int[] sayılar = {1,3,5,7,9};
		int aranacak = 1;
		boolean sayı = false;
		for(int i = 0; i<sayılar.length;i++) {
			if(aranacak == sayılar[i]) {
				sayı = true;
			}
			
		}
		if(sayı == true) {
			System.out.println("Bu sayı listede mevcut");
			
		}
		else {
			System.out.println("Bu sayı mevcut değil ");
		}

	}
}
