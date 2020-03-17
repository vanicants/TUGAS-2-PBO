public class coba{
	int p; double q;
	//construktor default
	public coba(){
	p = 12;
	q = 4.0;
}
	//construktor berparameter
	public coba(int s){
	p = s;
}
public static void main(String[] args){
	coba coba1 = new coba();
	coba coba2 = new coba(50);
	
	System.out.println(coba1.q);
	System.out.println(coba2.p);
}
}