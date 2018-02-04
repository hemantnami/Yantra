import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Crud {
	public Crud(WebDriver driver)
	{
	this.driver=driver;	
	}

	     static WebDriver driver;
	     static By search = By.cssSelector("#searchsubmit");
	     static By totalnames = By.cssSelector("#main > h1");
	     static By next = By.cssSelector("#pagination > ul > li.next > a");
	     static By prev=By.cssSelector("#pagination > ul > li.prev > a");
	     static By asc=By.xpath("//SECTION[@id='main']");
	     static By add=By.xpath("//A[@id='add']");
		 static By name=By.xpath("//INPUT[@id='name']");
		 static By introdate=By.xpath("//INPUT[@id='introduced']");
		 static By discdate=By.xpath("//INPUT[@id='discontinued']");
		 static By company=By.xpath("//SELECT[@id='company']");
		 static By create=By.xpath("//*[@id='main']/form/div/input");
		 static By cancel=By.xpath("//A[@href='http://computer-database.herokuapp.com/computers']");
		 static By total=By.cssSelector("#main > div.alert-message.warning");
		 static	 By delete=By.cssSelector("#main > form.topRight > input");
		 static By save=By.cssSelector("#main > form:nth-child(2) > div > input");
		 static By select=By.cssSelector("#main > table > tbody > tr:nth-child(1) > td:nth-child(1) > a");
		 static By searchnametext = By.id("searchbox");
         static String url="http://computer-database.herokuapp.com/computers?p=1";
         static By home=By.cssSelector("body > header > h1 > a");
         
		
	public  static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver",
					"E:\\auto\\geco\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get(url);
System.out.println("Before Automation"+driver.findElement(By.cssSelector("#main > h1")).getText());
//Adding new name
driver.findElement(add).click();
driver.findElement(name).sendKeys("yantra");
driver.findElement(introdate).sendKeys("1999-05-08");
driver.findElement(discdate).sendKeys("2017-05-08");
driver.findElement(company).sendKeys("Apple");
Thread.sleep(3000);
driver.findElement(create).click();
System.out.println("After Adding new name "+driver.findElement(By.cssSelector("#main > h1")).getText());


//Updation of names

driver.findElement(home).click();
driver.findElement(searchnametext).sendKeys("yantra");
driver.findElement(search).click();
driver.findElement(select).click();
driver.findElement(name).sendKeys("tech");
driver.findElement(company).sendKeys("Apple");
Thread.sleep(3000);
driver.findElement(save).click();
System.out.println("After updation"+driver.findElement(By.cssSelector("#main > h1")).getText());



//deletion
driver.findElement(searchnametext).sendKeys("yantra");
driver.findElement(search).click();
driver.findElement(select).click();
Thread.sleep(3000);
driver.findElement(delete).click();
System.out.println("After deletion"+driver.findElement(By.cssSelector("#main > h1")).getText());

		 
		 
		 
		 
		 
		 
		 
		 

	}

}
