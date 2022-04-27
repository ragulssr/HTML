package basic;

public class GetSet {
	
	public static void main(String[] args) {
		
		Loan l =new Loan();
		l.getName();
		l.setLoanerId(101);
		l.setName("Ragul");
		System.out.println(l.getLoanerId());
		System.out.println(l.getName());
	}

}

class Loan{ // right click goto source -> generate getter and setters.
	
	private String name;
	private int LoanerId=100;
	private int code =1111;
	private String ofc_add="xxx yyy zzz";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLoanerId() {
		return LoanerId;
	}
	public void setLoanerId(int loanerId) {
		LoanerId = loanerId;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getOfc_add() {
		return ofc_add;
	}
	public void setOfc_add(String ofc_add) {
		this.ofc_add = ofc_add;
	}
}