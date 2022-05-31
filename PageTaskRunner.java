package com.runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pom.Pom_Class;

public class PageTaskRunner extends Base_class {

	public static WebDriver driver = getbrowser("chrome");

	public static Pom_Class pom = new Pom_Class(driver);

	public static void main(String[] args) throws InterruptedException {

		// Launch browser
		geturl("https://ehr.vozo.xyz:444/");

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		// Enter User name
		sendkeys(pom.getinstance().getUsername(), "tech1");

		// Enter Password
		sendkeys(pom.getinstance().getPassword(), "capminds@03");

		// Click Sign In Button '
		Clickonelement(pom.getinstance().getSigninbtn());

		// Click On Month Option
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

//    // Click Task button
		Clickonelement(pom.getPageTask().getClickTaskButton());

		// Click Edit button
		Clickonelement(pom.getPageTask().getClickEditButton());

		// EnterNew category name
		sendkeys(pom.getPageTask().getEnterNewCategory(), "Tes");

		// Click Task button
		Clickonelement(pom.getPageTask().getClickNewCategory());

		Thread.sleep(2000);
		Clickonelement(pom.getPageTask().getclickClose());

		Thread.sleep(2000);
		// Click staues edit button
		Clickonelement(pom.getPageTask().getclickStatusEdit());

		// EnterNew Status Name
		sendkeys(pom.getPageTask().getEnterStausName(), "Arrived");

		// Click status
		Clickonelement(pom.getPageTask().getClickStatus());

		// select In progress
		Clickonelement(pom.getPageTask().getSelectInProgress());

		// Click Category
		Clickonelement(pom.getPageTask().getClickCategory());

		// select Fever
		Clickonelement(pom.getPageTask().getSelectFever());

		// Click New Statuses button
		Clickonelement(pom.getPageTask().getClickNewsStatses());

		// close th edialogue box
		Clickonelement(pom.getPageTask().getClickClose());

		// Thread.sleep(2000);
		// driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		// Click Edit Task Templates
		// Clickonelement(pom.getPageTask().getClickEditTaskTemplate());
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		WebElement element2 = wait2
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Task Template')]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element2);
		// Click Create New Templates
		Clickonelement(pom.getPageTask().getClickCreateNewTemplate());

		// Enter Title
		sendkeys(pom.getPageTask().getEnterTitle(), "Capminds");

		// Click Assignee
		Clickonelement(pom.getPageTask().getCickAssignee());

		// Select Tech1 Test
		Clickonelement(pom.getPageTask().getselectTech1Test());

		// EnterTemplate Name
		sendkeys(pom.getPageTask().getEnterTemplateName(), "Capminds");

		// Enter Day
		sendkeys(pom.getPageTask().getEnterDay(), "2");

		// Enter Hour
		sendkeys(pom.getPageTask().getEnterHour(), "2");

		// Enter Minute
		sendkeys(pom.getPageTask().getEnterMin(), "2");

		// Click Category
		Clickonelement(pom.getPageTask().getSelectcategory());

		// click priority
		Clickonelement(pom.getPageTask().getClickPriority());

		// Select Medium
		Clickonelement(pom.getPageTask().getSelectmedium());

		// click Status
		Clickonelement(pom.getPageTask().getClickStatus1());

		// Select Arrived
		Clickonelement(pom.getPageTask().getSelectArrived());

		// Enter Notes
		sendkeys(pom.getPageTask().getEnterNotes(), "WELCOME");

		// click SAVE
		// Clickonelement(pom.getPageTask().getSelectSave());

		// click CANCEL
		Clickonelement(pom.getPageTask().getSelectCancel());

		Thread.sleep(3000);

		// click back
		Clickonelement(pom.getPageTask().getClickBack());

////////////////TASK FILTERS ///////////////
// get Task
//
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//
//		Clickonelement(pom.getPageTask().getTaskcli());

// sele assign

// Clickonelement(pom.getPageTask().getTask());

		Selectone(pom.getPageTask().getseleassign(), "tech1 test");

// sele assign

// Clickonelement(pom.getPageTask().getseleprio());

		Selectone(pom.getPageTask().getseleprio(), "Medium");

// sele due date

		Selectone(pom.getPageTask().getduedate(), "2022-05-28 09:15:00");

// sele archive

		Clickonelement(pom.getPageTask().getarchi());

// sele task

		Selectone(pom.getPageTask().getseletask(), "Task One");

// cli res fil

		Clickonelement(pom.getPageTask().getresfil());

////////////////ADD NEW TASK  ///////////////

// add task
		Thread.sleep(2000);

		Clickonelement(pom.getPageTask().getaddnewtas());

// sele temp

		Selectone(pom.getPageTask().getseletem(), "Task1 new");

// get tak ti

		Thread.sleep(4000);

		Selectone(pom.getPageTask().getcatsele(), "Documents");

// get ass ti

		Selectone(pom.getPageTask().getstatse(), "In Progress");

//			// get ass ti
//
//			gettext(pom.getPageTask().getcate());
//
//			// get ass ti
//
//			gettext(pom.getPageTask().getstat());

// Note

// sendkeys(pom.getPageTask().getseletem(), "New 123");

// sele asso
		Thread.sleep(5000);

		Selectone(pom.getPageTask().getaddass(), "Patient");

// sele temp

// selectone(pom.getPageTask().getseletem(), "Dem02");

// sele ass it
		Thread.sleep(4000);

		Selectone(pom.getPageTask().getaddass(), "Appointment");

// sele ass it
		Thread.sleep(4000);

		sendkeys(pom.getPageTask().getpatna(), "John");

		Clickonelement(pom.getPageTask().getselepat());

		Thread.sleep(5000);

// cli sav

		Clickonelement(pom.getPageTask().getclisav());

////////// CLICK EDIT ///////////////
// cli edit

		Thread.sleep(3000);

		Clickonelement(pom.getPageTask().getclied());

// cli clo

		Clickonelement(pom.getPageTask().getcliclo());
	}

}
