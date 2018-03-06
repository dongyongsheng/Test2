package exportPDF;

public class testudp {
	public static void main(String args[]){
		
		int addr = 1*64*64 + 2*64 + 15;
		addr = addr *2;
		int gao=(addr>>8) & 0xFF;
		int di=addr & 0xFF;
		System.out.println("高位为："+gao+"低位为： "+di);
	}

}
