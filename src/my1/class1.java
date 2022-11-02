package my1;

import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hhhhhhh");
		
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\MyChromDriver\\chromedriver.exe");  
        
         
         String URL="http://127.0.0.1:5500/index.html";
          WebDriver driver = new ChromeDriver();
          driver.get(URL);// enter to webpage
      
         
          
        List<WebElement> myATag=driver.findElements(By.tagName("option"));
  
        
        
      for(int i=0;i<myATag.size();i++) {
 
       System.out.println(myATag.get(i).getText());
       
       }
       
          
         
     	
        
        
	}

}
