public class Time{
	public static void main (String[] args){
			int detik,menit,jam,sisa1,sisa2;
			detik=5900;
			
			jam = detik/3600;
			sisa1 = detik%3600;
			menit = (int) sisa1/60;
			sisa2 = sisa1%60;
		
	System.out.println("Hasil Konversi : " +detik+" Detik = "+jam+" Jam : "+menit+" Menit : "+sisa2+" Detik");	
	}
}