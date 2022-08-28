package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CorejavaPage;
import pomPages.SkillraryPage;
import pomPages.WishListPage;

public class Testacse3  extends BaseClass{

	@Test
	public void tc3() throws IOException, InterruptedException {
	SkillraryPage s=new SkillraryPage(driver);
	s.serachtextbox(pdata.getData("serachtextbox"));
	s.serachbutton();
	
	CorejavaPage c=new CorejavaPage(driver);
	c.seleniumcourse();
	
	WishListPage w=new WishListPage(driver);
	driverutilies.switctoframe(driver);
	w.playbutton();
	Thread.sleep(10000);
	w.pausebutton();
	driverutilies.switchbackframe(driver);
	w.wishlistbtn();
	
	
	}
}
