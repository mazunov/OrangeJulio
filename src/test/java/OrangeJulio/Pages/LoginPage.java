package OrangeJulio.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import OrangeJulio.Steps.ButtonPages;

public class LoginPage {
	
	//Esto es un driver
	private WebDriver driver;
	private ButtonPages buttonPages;
	
		@FindBy(how = How.ID, using = "txtUsername")
		// nombre de la variable que guarda @FindBy
		private WebElement inputUserName;
		
		@FindBy(how = How.ID, using = "txtPassword")
		// nombre de la variable que guarda @FindBy
		private WebElement inputPassword;
	
	//Esto es un constructor
	public LoginPage(WebDriver driver) {
		//Esta linea es la que toma los elementos web
		PageFactory.initElements(driver, this);
		this.buttonPages = new ButtonPages(driver);
		
	}
	
	//Funcionalidad de logeo
	public void ingresarLogin (String userName, String pass) {
		inputUserName.sendKeys(userName);
		inputPassword.sendKeys(pass);
		buttonPages.botnLogin();
	}

}
