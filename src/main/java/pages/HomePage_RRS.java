package pages;

import java.awt.AWTException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class HomePage_RRS extends ProjectMethods{
	
	public HomePage_RRS() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//div[@id='specialist2']/div/form/div/input[@value='SEARCH']")
	private WebElement searchbutton;
	
	public HomePage_RRS verifysearchbutton()
	{
		verifyDisplayed(searchbutton);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'FIT FINDER')]")
	private WebElement FIRELE;
	
	public FitFinder clickFitFinder()
	{
		refresh();
		click(FIRELE);
		return new FitFinder();
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'search2 ui-autocomplete-input')]")
	private WebElement searchfield;
	
	@FindBy(how=How.XPATH,using="//*[contains(@href,'/rrs/brand/?cm_sp=nav-_-brands-_-brands')]")
	private WebElement brands;
	
	public HomePage_RRS searchbrands()
	{
		refresh();
		mouseHover(brands);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@title,'R Gear, Shop Now')]")
	private WebElement rgear;
	
	public Searchresults rgearbrand()
	{
		click(rgear);
		return new Searchresults();
	}

	
	public Searchresults entersearchkey(String xpath,String data)
	{


		refresh();
		
		smallWait();
		verifyDisplayed(searchfield);
		
		explicitWaitsend(xpath,data);
		
		click(searchbutton);
		return new Searchresults();
		
	}
	
	public Searchresults entersearchkeyandscrolltobottom(String data)
	{


		refresh();
		type(searchfield, data);
		
		click(searchbutton);
		scrollBottom();
		return new Searchresults();
		
	}

	@FindBy(how=How.XPATH,using="//div[@class='login-section']/ul/li/a")
	private WebElement myaccountlink;
	
	public MyAccounts clickmyaccount()
	{
		refresh();
		click(myaccountlink);
		return new MyAccounts();
	}


	public Login clickaccount()
	{
		refresh();
		highLighterMethod(driver, myaccountlink);
		click(myaccountlink);
		return new Login();
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@name,'coop dual column')]")
	private WebElement shopnowlink;
	
	public ShopNow clickshopNow()
	{
		refresh();
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(shopnowlink);
		return new ShopNow();
	}
			
	@FindBy(how=How.XPATH,using="//*[contains(@class,'search2 ui-autocomplete-input')]")
	private WebElement searchfields;
	@FindBy(how=How.XPATH,using="//*[contains(@value,'SEARCH')]")
	private WebElement sbutton;	
	public ViewCart enterprodname(String name)
	{
		
		type(searchfields,name);
		click(sbutton);
		return new ViewCart();
	}
	
	@FindBy(how=How.XPATH,using="//div[@id='specialist2']/div/form/div/input[@value='SEARCH']")
	private WebElement searchbuttons;

	
	public Searchresults entersearch(String data)
	{


		refresh();
		FluentWait();
		
		verifyDisplayed(searchfield);
		highLighterMethod(driver, searchfield);
		
		type(searchfield, data);
		
		click(searchbuttons);
		return new Searchresults();
		
	}
	
	
	
	
	

}