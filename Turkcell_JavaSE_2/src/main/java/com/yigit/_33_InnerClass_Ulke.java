package com.yigit;

import com.yigit._33_InnerClass_Ulke._33_Il._33_Ilce;

// Inner Class : 1 tane pubkþc classýmýz vardý(inner class haric)
// Inner Class : static class olmaz (inner class haric)
// Çok tane class oluþturmadan tek ir class mantýðýnda çözümlenmedir.
// Single Inheritence (Tek kalýtýmdýr)
// Çok kalýtým gibi kendisini gösterir.

// static olan inner class
// static olmayan inner class
// Local inner class
// Anonymous inner class

// Nested(Ülke)
public class _33_InnerClass_Ulke {
	
	private String ulkeAdi;
	
	public String getUlkeAdi() {
		return ulkeAdi;
	}
	
	public void setUlkeAdi(String ulkeAdi) {
		this.ulkeAdi = ulkeAdi;
	}
	
	// iç class (Ýl)
	public static class _33_Il {
		private String ilAdi;
		
		public String getIlAdi() {
			return ilAdi;
		}
		
		public void setIlAdi(String ilAdi) {
			this.ilAdi = ilAdi;
		}
		
		// ilçe class
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
		ulke.setUlkeAdi("Türkiye");
		
		_33_Il il = new _33_Il();
		il.setIlAdi("Balikesir");
		
		_33_Ilce ilce = new _33_Ilce();
		ilce.setIlceAdi("Bandirma");
		
		System.out.println(
				"Ülke Adi : " + ulke.getUlkeAdi() + " Il Adi : " + il.getIlAdi() + " Ilce Adi : " + ilce.getIlceAdi());
	}
	
}
