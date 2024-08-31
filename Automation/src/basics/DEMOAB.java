package basics;

public class DEMOAB {
public static void demoA() throws InterruptedException {
	Thread.sleep(2000);
}
public static void demoB()  {
	try {
		demoA();
	} catch (InterruptedException e) {
	}
}
public static void main(String[] args) {
	demoB();
}
}
