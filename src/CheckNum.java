
// 继承Exception可以使得NumException能够被throw/throws
class NumException extends Exception {

	private int num;
	public NumException(int num) {
		this.num = num;
	}
	@Override
	public String getMessage() {
		return "[NumException Error]:" + num;
	}
}

class NumRuntimeException extends RuntimeException {

    private int num;
    public NumRuntimeException(int num) {
        this.num = num;
    }
    @Override
    public String getMessage() {
        return "[NumRuntimeException Error]:" + num;
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
	
	// 注意这里的throws/throw
	public void check() throws NumException {
		if (num < 0 || num > 100) {
			throw new NumException(num);
		}
	}

	// 可以不使用throw抛出异常
	public void check_with_no_throw() throws NumException {
		CheckNum cn = new CheckNum(this.num);
		cn.check();
	}

	// 使用throw抛出RuntimeException后, 调用方是可以不用try catch处理的
    public void check_with_no_trycatch() {
        if (this.num < 0 || this.num > 100) {
            throw new NumRuntimeException(this.num);
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
		cn.setNum(-1);
		try {
			cn.check_with_no_throw();
		} catch (NumException e) {
            System.out.println(e.getMessage());
		}
		cn.check_with_no_trycatch();
	}
}
