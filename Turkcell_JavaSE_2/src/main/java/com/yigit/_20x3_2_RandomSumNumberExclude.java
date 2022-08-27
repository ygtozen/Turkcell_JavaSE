package com.yigit;

import java.util.Random;

public class _20x3_2_RandomSumNumberExclude {
	public static void main(String[] args) {
		// Örnek: 1-10 arasında 5 tane random sayı üretelim ve bu bunları toplayalım
		// ancak bu sayılardan 5'e bölünen sayıları toplamayalım
		// initial data sıfır toplamada etkisiz eleman
		
		Random rastgele = new Random();
		int sum = 0, temp = 0;
		
		for (int i = 1; i <= 5; i++) {
			// rastgele sayı üretti
			temp = (rastgele.nextInt(10) + 1);
			System.out.println(temp);
			// eğer bu rastgele sayılardan 5'e bölünen varsa alma
			if (temp % 5 == 0)
				continue;
			
			sum = sum + temp;
		}
		System.out.println("Toplam : " + sum);
	}
}
