package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.github.dockerjava.api.model.Task;
import com.page.Billing;
import com.page.BillingNergativeCases;
import com.page.Calender;
import com.page.ERXPage;
import com.page.PageTask;
import com.page.Patient;
import com.page.PatientModuleNegativeCases;
import com.page.Payment;
import com.page.PaymentNegativeCases;
import com.page.Reports;
import com.page.ScheduleNegativeCases;
import com.page.Settings;
import com.page.SettingsNegativeCases;
import com.page.SignIn;
import com.page.TaskNegativeCases;
import com.paral.New_Appointment;

public class Pom_Class {


	public  static RemoteWebDriver driver;

	private SignIn sp;

	private Calender cp;
	
	private Patient pa;
	
	private Reports rp;

	private Settings st;
    
	private New_Appointment na;

	private Payment py;

	private Billing BL;
	
	private PageTask TK;
	
	private ERXPage ERX;
	
	private PatientModuleNegativeCases PANE;
	private BillingNergativeCases BLNC;
	
	private SettingsNegativeCases STNC;
	
	private TaskNegativeCases TKNC;
	
	private PaymentNegativeCases PANC;
	
	private ScheduleNegativeCases SCNC;

	public Pom_Class(WebDriver driver2) {
		
		this.driver = (RemoteWebDriver) driver2;

	}

	public Settings getSettings() {
	
		if (st== null) {
	
			st = new Settings(driver);
	
		}
		return st;
	}

	public SignIn getinstance() {

		if (sp == null) {

			sp = new SignIn(driver);
   
		}
		return sp;
	}

	public Calender getCalender() {

		if (cp == null) {

			cp = new Calender(driver);

		}
		return cp;
	}
	
	public Patient getPatient() {

		if (pa== null) {

			pa = new Patient(driver);

		}
		return pa;
	}
	
	public Reports getReports() {

		if (rp== null) {

			rp = new Reports(driver);

		}
		return rp;
	}
	
	public New_Appointment getnewappointment() {

		if (na == null) {

			na = new New_Appointment(driver);

		}
		return na;

	}
	
	public Payment getPayment() {

		if (py== null) {

			py = new Payment(driver);

		}
		return py;
	}
	
	public Billing getBilling() {

		if (BL== null) {

			BL = new Billing(driver);

		}
		return BL;
	}
	public PageTask getPageTask() {

		if (TK== null) {

			TK = new PageTask(driver);

		}
		return TK;
	}
	public ERXPage getERXPage() {

		if (ERX== null) {

			ERX = new ERXPage(driver);

		}
		return ERX;
	}
	public PatientModuleNegativeCases getNegativeTestCase() {

		if (PANE== null) {

			PANE = new PatientModuleNegativeCases(driver);

		}
		return PANE;
	}
	
	public BillingNergativeCases getBillingNergativeCases() {

		if (BLNC== null) {

			BLNC = new BillingNergativeCases(driver);

		}
		return BLNC;
	}
	public SettingsNegativeCases getSettingsNegativeCases() {

		if (STNC== null) {

			STNC = new SettingsNegativeCases(driver);

		}
		return STNC;
	}
	public TaskNegativeCases getTaskNegativeCases() {

		if (TKNC== null) {

			TKNC = new TaskNegativeCases(driver);

		}
		return TKNC;
	}
	public PaymentNegativeCases getPaymentNegativeCases() {

		if (PANC== null) {

			PANC = new PaymentNegativeCases(driver);

		}
		return PANC;
	}
	public ScheduleNegativeCases getScheduleNegativeCases() {

		if (SCNC== null) {

			SCNC = new ScheduleNegativeCases(driver);

		}
		return SCNC;
	}
	
	
	
	
	
	
	
	
	
	
}