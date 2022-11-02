
public class AsalSayı {
public static void main(String[] args) {
		
		for(int i= 3; i<20; i++) {
			boolean isPrime = true;
			for(int j = 2; j<i; j++) {
				if(i % j == 0) {
					
					isPrime = false;
				}
			
				}
		if(isPrime) {
			System.out.println(i+"= Bu Sayı Asaldır");
		
		}
		else{
			System.out.println(i+"= Bu Sayı Asal Değildir");
			}
		
			}
			
				
			
				
	}


}
