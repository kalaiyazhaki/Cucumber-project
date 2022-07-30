package pom.pojo;

import org.openqa.selenium.By;
import org.utilities.BaseClass;

public class ForgotPassword extends BaseClass {
public static void main(String[] args) throws InterruptedException {
	
	launchChrome();
	loadUrl(" https://www.zappos.com/");
	winMax();
    toPrintTitle();
	printcurrentUrl();
	ForgotPojoClass e=new ForgotPojoClass();
	btnClick(e.getSignIn());
	maxiWait(3000);
	btnClick(e.getLogin());
	maxiWait(5000);
	cusorTo(e.getForgot());
	fill(e.getEmail(), "anu234@gmail.com");
	maxiWait(10000);
	btnClick(e.getContin());
	maxiWait(10000);
	printText(e.getText());
	txtToPre(By.xpath("//h4[text()='There was a problem']"));
}
}