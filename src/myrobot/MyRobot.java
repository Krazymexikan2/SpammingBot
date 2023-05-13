
package myrobot;

import com.sun.java.accessibility.util.EventID;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;


public class MyRobot {

    
    public static void main(String[] args) throws AWTException, InterruptedException {
        
        JR jr = new JR();
        jr.setLocationRelativeTo(null);
        jr.setVisible(true);
        
        
//       Robot robot = new Robot();
//       Scanner scan = new Scanner(System.in);
//       String str = scan.nextLine();
//       StringSelection stringSelection = new StringSelection(str);
//       Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
//       clipboard.setContents(stringSelection, null);
//        System.out.println("the spamming will start in 2 seconds");
//        Thread.sleep(5000);
//        while (true) {            
//            
//            
//            robot.keyPress(KeyEvent.VK_CONTROL);
//            robot.keyPress(KeyEvent.VK_V);
//            Thread.sleep(250);
//            robot.keyRelease(KeyEvent.VK_CONTROL);
//            robot.keyRelease(KeyEvent.VK_V);
//            Thread.sleep(250);
//            robot.keyPress(KeyEvent.VK_ENTER);
//            robot.keyRelease(KeyEvent.VK_ENTER);
//        }
    }
    
}
