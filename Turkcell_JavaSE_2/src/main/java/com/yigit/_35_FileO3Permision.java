package com.yigit;

import java.io.File;

enum permission {
	ADMIN, WRITER, USER;
}

public class _35_FileO3Permision {
	
	public static void main(String[] args) {
		File file = new File(_35_FileIO.MY_PATH);
		
		// String[] permissionRoles = { "ADMIN", "WRITER", "USER" };
		// permissionRoles[1] == "ADMIN"
		
		if (permission.ADMIN.toString() == "ADMIN") {
			
			boolean data = file.canExecute();
			data = file.setExecutable(false);
			if (data) {
				System.out.println("Calisma izni verilmistir");
			} else {
				System.out.println("Calisma izni verilmemistir !!!!");
			}
		} else {
			System.out.println("Writer veya User dosya degistirme izni yoktur");
		}
		
	}
	
}
