package ui_automation.step_definitions;

import io.cucumber.java.en.Given;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import runners.UITestRunner;



public class CleanUp {
   ///I cancel fetch
    private static Logger log = LogManager.getLogger(CleanUp.class.getName());
    @Given("I want to clean up")
    public void i_want_to_clean_up() throws FindFailed, InterruptedException {
        log.info("thsi is error");
        Screen screen = new Screen();
        Pattern window = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\window.png");
        screen.click(window);
        Thread.sleep(2000);
        Pattern windowBar = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\windowBar.png");
        screen.type("%temp%");
        screen.keyDown(Key.ENTER);
        screen.keyUp(Key.ENTER);
        Pattern view_tempFile = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\view_tempFile.png");
        screen.wait(view_tempFile, 12);
        Thread.sleep(1000);
        screen.keyDown(Key.CTRL+"a");
        screen.keyUp(Key.CTRL);
        screen.keyDown(Key.DELETE);
        Pattern cancelCleanUp = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\cancelCleanUp.png");
        screen.wait(cancelCleanUp, 12);
        screen.click(cancelCleanUp);
        Pattern view_tempFile2 = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\view_tempFile.png");
        screen.wait(view_tempFile2, 12);
        Pattern closeTempFile = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\closeTempFile.png");
        screen.hover(closeTempFile);
        screen.click();
        Pattern window2 = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\trashCan.png");
        screen.rightClick(window2);
        Pattern window3 = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\emptyTrashCan.png");
        screen.hover(window3);
        screen.click();
        Thread.sleep(1000);
        Pattern window4 = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\yes_toEmptyTrash.png");
        screen.hover(window4);
        screen.click();
    }

}

