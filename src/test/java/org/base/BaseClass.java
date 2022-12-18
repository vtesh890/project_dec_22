
package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.Table.Cell;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

		
		public static WebDriver driver;
		public static WebDriver browserLaunch(String browsername) {
			
		if(browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		return driver;
		}
		
//		public static WebDriver browserLaunch1(String browsername) {
//			switch(browsername) {
//			case "chrome":
//				WebDriverManager.chromedriver().setup();
//				 driver=new ChromeDriver();
//				break;
//			case "firefox":
//				 WebDriverManager.firefoxdriver().setup();
//				  driver=new FirefoxDriver();
//				  break;
//				  
//			case "edge":
//				WebDriverManager.edgedriver().setup();
//				  driver=new EdgeDriver();
//				  break;
//			}
//			return driver;
//		}
	
				  
			
			

		public static WebDriver chromeBrowser() {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			return driver;
		}

		public static WebDriver firefoxBrowser() {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			return driver;
		}
		
		public static WebDriver edgeBrowser() {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			return driver;
		}
		
		public static void urlLaunch(String url) {
			driver.get(url);
		}
		
		public static void maximize() {
			driver.manage().window().maximize();
			
		}
		
		public static void implicitwait(long secs) {
			driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);
		}
		
		public static void sendkeys(WebElement e, String value) {
		e.sendKeys(value);
		}
		
		
			
			
	
		
		public static void click(WebElement e) {
			e.click();
		}
		
		
		
		public static void close() {
			driver.close();
		}
		public static void quit() {
			driver.quit();
		}
		
		public static String getcurrenturl() {
			String url = driver.getCurrentUrl();
			return url;
			
		}
		
		public static String currentTitle() {
			String Title=driver.getTitle();
			return Title;
		}
		
		public static String getText(WebElement e) {
			String text=e.getText();
			return text;
		}
		
		public static String getAttribute(WebElement e) {
			String att=e.getAttribute("value");
			return att;
		}
		
		public static String getAttribute1(WebElement e) {
			String text1=e.getAttribute("innerText");
			return text1;
		}
		
		public static void moveToElement(WebElement target) {
			Actions a=new Actions(driver);
			a.moveToElement(target).perform();
		}
		
		public static void dragAndDrop(WebElement src,WebElement des) {
			Actions a=new Actions(driver);
			a.dragAndDrop(src, des).perform();
		}
		
		public static void doubleclick(WebElement target) {
			Actions a=new Actions(driver);
			a.doubleClick(target).perform();
		}
		
		public static void contextclick(WebElement target) {
			Actions a=new Actions(driver);
			a.contextClick(target).perform();
		}
		
		public static void clickandHold(WebElement target) {
			Actions a=new Actions(driver);
			a.clickAndHold(target).perform();
		}
		
		public static void accept(WebElement e) {
			Alert e1=driver.switchTo().alert();
			e1.accept();
		}
		
		public static void dismiss(WebElement e) {
			Alert e1=driver.switchTo().alert();
			e1.dismiss();
		}
		
		public static void accept1(WebElement e,String value) {
			Alert e1=driver.switchTo().alert();
	         e1.sendKeys(value); 
	         e1.accept();
	         
		}
		
		
		
		
		public static void selectbyindex(WebElement e,int index) {
			Select s=new Select(e);
			s.selectByIndex(index);
		}
		
		public static void selectbyvisibleText(WebElement e,String text) {
			Select s=new Select(e);
			s.selectByVisibleText(text);
			
		}
		
		public static void selectbyvalue(WebElement e,String value) {
			Select s=new Select(e);
			s.selectByValue(value);
		}
		
		public void select (WebElement e) {
		Select s=new Select(e);
		s.getFirstSelectedOption();
		}
		
		public static void deselectbyindex(WebElement e,int index) {
			Select s=new Select(e);
			s.deselectByIndex(index);
		}
		
		public static void deselectbyvisibleText(WebElement e,String text) {
			Select s=new Select(e);
			s.deselectByValue(text);
		}
		
		public static void deselectbyvalue(WebElement e,String value) {
			Select s=new Select(e);
			s.deselectByValue(value);
		}
		
		
		
		public static void Screenshot(String imagename)throws IOException {
			TakesScreenshot tk=(TakesScreenshot)driver;
			File src =tk.getScreenshotAs(OutputType.FILE);
			File des=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshot\\"+imagename+".png");
			
			FileUtils.copyFile(src, des);
		}
		 
		
	   public static void executeScript(WebElement e ,String name) {
		   JavascriptExecutor js=(JavascriptExecutor)driver;
		   js.executeScript("arguments[0].setAttribute('value",e);
		   js.executeScript("arguments[0].click()", e);
		
	   }
	   
	   public static void frame(WebElement e,int index) {
		   driver.switchTo().frame(index);
	   }
	   
	   public static void frame(WebElement e,String name) {
		   driver.switchTo().frame(name);
	   }
	   public static boolean waiturl(long sec,String partialUrl) {
		   WebDriverWait w=new WebDriverWait(driver, sec);
		   return w.until(ExpectedConditions.urlContains(partialUrl));
	   }
		   
	   public static  WebElement displayed(WebElement e) {
	        boolean displayed = e.isDisplayed();
			return e;
	   }
	   
	   public static WebElement enabled(WebElement e) {
		   boolean enabled = e.isEnabled();
		return e;
	   }
	   
    
	   
	   
	   public static WebElement selected(WebElement e) {
  	   boolean selected = e.isSelected();
		return e;
       }
       
         
       
	   
	     
//		public static String getData(String filename,String sheetname,int rowno,int cellno) throws IOException {
//		File f=new File("C:\\Users\\VENKATESH\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64\\MavenSample1\\src\\test\\resources\\"+filename+".xlsx");
//		FileInputStream fi=new FileInputStream(f);
//	    Workbook w=new XSSFWorkbook(fi);
		//cell
//		Cell Cell= w.getSheet(sheetname).getRow(rowno).getCell(cellno);
	    // get cell Type
//	              int type=cell.getcellType();
//		

	//type 1-------text
	//type 0-----number,date
//		String value=null;
		
//	if(type==1) {
//	  value= cell.getStringCellValue();

//	}
//	else {
//	if(DateUtil.isCellDateFormatted(cell)) {
//		if(DateUtil.isCellDateFormatted(cell)) {
//			value=new simpleDateFormat("dd-MM-yyyy").format(cell.getDateCellValue());
//	
//
//
//	}
//		else {
//			value=String.valueOf(long).cell.getNumericCellValue());
//		}
//	}
//	return value;	
//		
	   }
	      
	
	   
	   








