package com.yigit;

public class _20_Loop {
	public static void main(String[] args) {
		// Loop
		// for
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// while
		int x = 1;
		while (x <= 10) {
			System.out.print(x + " ");
			x++;
		}
		System.out.println();
		
		// do-while
		// şart sağlansın yada sağlanmasın 1 kere çalışır
		int y = 1;
		do {
			System.out.print(y + " ");
			y++;
		} while (y <= 10);
	}
}
