package com.yigit;

import com.yigit._33_InnerClass_Ulke._33_Il._33_Ilce;

// Inner Class : 1 tane pubk�c class�m�z vard�(inner class haric)
// Inner Class : static class olmaz (inner class haric)
// �ok tane class olu�turmadan tek ir class mant���nda ��z�mlenmedir.
// Single Inheritence (Tek kal�t�md�r)
// �ok kal�t�m gibi kendisini g�sterir.

// static olan inner class
// static olmayan inner class
// Local inner class
// Anonymous inner class

// Nested(�lke)
public class _33_InnerClass_Ulke {
	
	private String ulkeAdi;
	
	public String getUlkeAdi() {
		return ulkeAdi;
	}
	
	public void setUlkeAdi(String ulkeAdi) {
		this.ulkeAdi = ulkeAdi;
	}
	
	// i� class (�l)
	public static class _33_Il {
		private String ilAdi;
		
		public String getIlAdi() {
			return ilAdi;
		}
		
		public void setIlAdi(String ilAdi) {
			this.ilAdi = ilAdi;
		}
		
		// il�e class
		public static class _33_Ilce {
			private String ilceAdi;
			
			public String getIlceAdi() {
				return ilceAdi;
			}
			
			public void setIlceAdi(String ilceAdi) {
				this.ilceAdi = ilceAdi;
			}
			
		}
	}
	
	// main test
	public static void main(String[] args) {
		_33_InnerClass_Ulke ulke = new _33_InnerClass_Ulke();
		ulke.setUlkeAdi("T�rkiye");
		
		_33_Il il = new _33_Il();
		il.setIlAdi("Balikesir");
		
		_33_Ilce ilce = new _33_Ilce();
		ilce.setIlceAdi("Bandirma");
		
		System.out.println(
				"�lke Adi : " + ulke.getUlkeAdi() + " Il Adi : " + il.getIlAdi() + " Ilce Adi : " + ilce.getIlceAdi());
	}
	
}
