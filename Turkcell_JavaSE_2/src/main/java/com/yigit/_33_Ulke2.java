package com.yigit;

// static olmayan inner class
// Ulke il ilce Mahallesi
public class _33_Ulke2 {
	
	private String ulkeAdi;
	
	public String getUlkeAdi() {
		return ulkeAdi;
	}
	
	public void setUlkeAdi(String ulkeAdi) {
		this.ulkeAdi = ulkeAdi;
	}
	
	// iç class (Ýl)
	public class _33_Il {
		private String ilAdi;
		
		public String getIlAdi() {
			return ilAdi;
		}
		
		public void setIlAdi(String ilAdi) {
			this.ilAdi = ilAdi;
		}
		
		// ilçe class
		private class _33_Ilce {
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
		_33_Ulke2 ulke = new _33_Ulke2();
		ulke.setUlkeAdi("Türkiye");
		
		_33_Ulke2._33_Il il = new _33_Ulke2().new _33_Il();
		il.setIlAdi("Balikesir");
		
		_33_Ulke2._33_Il._33_Ilce ilce = new _33_Ulke2().new _33_Il().new _33_Ilce();
		ilce.setIlceAdi("Bandirma");
		
		System.out.println(
				"Ülke Adi : " + ulke.getUlkeAdi() + " Il Adi : " + il.getIlAdi() + " Ilce Adi : " + ilce.getIlceAdi());
	}
	
}
