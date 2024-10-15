package day12;

public class AccountMain {

	public static void main(String[] args) {
		
		Account acc=new Account();
		
		acc.setAccno(102);
		acc.setName("Aslam");
		acc.setAmunt(10000);
		
		System.out.println(acc.getAccno());
		System.out.println(acc.getName());
		System.out.println(acc.getAmunt());
		

	}

}
