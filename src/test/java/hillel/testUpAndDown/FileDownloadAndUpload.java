package hillel.testUpAndDown;

import hillel.wd.login.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import ua.homeTask15Pages.DownloadPage;
import ua.homeTask15Pages.UploadPage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileDownloadAndUpload extends BaseTest {
    @Test
    public void fileDownAndUp() throws FileNotFoundException {
        DownloadPage downloadPage = new DownloadPage(driver);
        downloadPage.openDownPage();

        WebElement downloadFile = driver.findElement(By.linkText("some-file"));
        downloadFile.click();

        File file = new File("target/downloads/some-file");
        PrintWriter pw = new PrintWriter(file);
        pw.println("Hello!");
        pw.println("Friends");
        pw.close();

        UploadPage uploadPage = new UploadPage(driver);
        uploadPage.openUpPage();



        WebElement uploadFile = driver.findElement(By.id("file-upload"));
        uploadFile.sendKeys(file.getAbsolutePath());

        uploadPage.fileUploadButton();

        file.exists();

    }

}
