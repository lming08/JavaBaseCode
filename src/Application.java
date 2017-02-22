
public class Application {
	
	public static void change(int []p) {
		p[0] = 10;
		p = new int[2];
		p[0] = 100;
		p[0] = 101;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a={1,2};
		int [] b = a;
		b[1] = 5;
		System.out.println(a[1]);
		change(b);
		System.out.println(b[0] +","+ b[1]);
		
		String str1 = "123";
		String str2 = new String("123");
		str2 += "fdsa"; // 返回一个新的堆地址， 数据也发生变化
		System.out.println("****"+str2);
	}

}
