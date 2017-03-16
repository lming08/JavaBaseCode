
/**  
 * @Title: Singleton.java
 * @Package 
 * @Description: TODO
 * @author mingliang
 * @date 2017年2月27日
 */

/**
 * @ClassName: Singleton
 * @Description: TODO
 * @author mingliang
 * @date 2017年2月27日
 *
 */

public class Singleton {

	private static Singleton singleton = new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){
        return singleton;
    }
    
	/**
	 * @Title: main
	 * @Description: TODO
	 * @param @param args
	 * @return void
	 * @throws
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
	}

}
