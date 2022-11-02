
public class ArkadasSayı {
	public static void main(String[] args) {
		int sayı1 = 220;
		int sayı2 = 284;
		int toplam1= 0;
		int toplam2 = 0;
		
		for(int i = 1; i<sayı1;i++) {
			if(sayı1 % i == 0) {
				toplam1 = i + toplam1;
			}
		}
		for (int i = 1; i < sayı2; i++) {
			if(sayı2 % i == 0) {
				toplam2 = i + toplam2;
			}
		}
		if (toplam1 == sayı2 && toplam2 == sayı1) {
			System.out.println("Bu Sayılar birer arkadaş sayıdır");

		}
		else {
			System.out.println("Bu sayılar arkadaş değildir");
		}
		
	}
}
