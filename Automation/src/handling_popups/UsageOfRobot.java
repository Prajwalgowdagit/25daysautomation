package handling_popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class UsageOfRobot {
public static void main(String[] args) throws AWTException, InterruptedException, IOException {
	Thread.sleep(1000);
	Runtime.getRuntime().exec("notepad");
	Robot r=new Robot();Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_SHIFT);Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_R);Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_C);Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_B);Thread.sleep(1000);
	r.keyRelease(KeyEvent.VK_SHIFT);Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_CONTROL);Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_S);Thread.sleep(1000);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_R);Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_C);Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_B);Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_ENTER);
}
}