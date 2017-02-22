
class NumException extends Exception {

	private int num;
	public NumException(int num) {
		this.num = num;
	}
	public String getMessage() {
		return "Error:" + num;
	}
}

public class CheckNum {
	private int num;
	public CheckNum(int num) {
		this.num = num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public void check() throws NumException {
		if (num < 0 || num > 100) {
			throw new NumException(num);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckNum cn = new CheckNum(10);
		try {
			cn.check();
		} catch (NumException e) {
			System.out.println(e.getMessage());
		}
		cn.setNum(101);
		try {
			cn.check();
		} catch (NumException e) {
			System.out.println(e.getMessage());
		}
	}
}
