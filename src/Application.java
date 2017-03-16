import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Application {
	private int a = 0;
	
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
		
		Application app = new Application();
		app.a = 1;
		
		Properties prop;
		//List间的复制是浅复制
		List<Integer> arrList = new ArrayList<Integer>();
		arrList.add(10);
		arrList.add(100);
		List<Integer> arrList2 = arrList;
		arrList2.set(0, 1);
		System.out.println("arrList:"+arrList.toString());
	}

}
