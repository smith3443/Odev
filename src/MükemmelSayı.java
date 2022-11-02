
public class MükemmelSayı {
	public static void main(String[] args) {
		int sayı = 7;
		int toplam = 0;
		for(int i =1; i<sayı; i++) {
			if(sayı%i == 0) {
				toplam = i + toplam;
			}
		
		}
		if(toplam == sayı) {
			System.out.println(sayı+"= Bu Sayı Mükemmel Bir Sayıdır");}
		else {
			System.out.println(sayı+"= Bu Sayı Mükemmel Değildir!!!");
		}
		

	}
}
