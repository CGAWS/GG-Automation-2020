package com.sacs.PageOjects;

public enum ProductionPlanningPaxForecastEnum {

	PRODUCTION_PLANNING("productionplanning","id"),
	SEARCH_FIELD(".//*[@id='articlesearch']", "xpath"),
	SEARCH_SUBMIT("searchSubmit", "className"),
	TOAST_MESSAGE("toast-message","className"), 
	PAGETITILE("//*[@id='contentHeader']/div[1]/h1","xpath"), 
	FORCAST_PLANNING("//*[@id='forecastplanning']/a","xpath"),
	PAX_FORECAST_TAB("//*[@id='paxForecastTab']/h1","xpath"),
	FROM("//*[@id='PassengerForecastModel_StartDate']","xpath"),
	TO("//*[@id='PassengerForecastModel_EndDate']","xpath"),
	CUSTOMER("//*[@id='PassengerForecastModel_CustomerCode']","xpath"),
	OK("//*[@id='paxOK']","xpath"),
	FLIGHT_NO_XPATH("//*[@id='resultsDetails']//div[contains(@class, 'grid-canvas-left')]/div/div[1]","xpath"),
	TOTALFLIGHTS("//*[@id='resultsDetails']/div[6]/div/div/div/div[1]","xpath"),
	FIRST_FLIGHT("//*[@id='resultsDetails']/div[6]/div/div/div[1]/div[1]","xpath"),
	PAX_FIGURES("//*[@id='resultsDetails']/div[7]/div/div/div[1]/div","xpath"),
	PAX_FIGURES_INPUT("//*[@id='resultsDetails']/div[7]/div/div/div[1]/div/input","xpath"),
	MENU("//*[@id='forecastWrapper']/ul/li[1]/div","xpath"),
	SET_FIGURE_EQUAL("//*[@id='forecastWrapper']/ul/li[1]/ul/li/a","xpath"),
	SET_FIGURE_EQUAL_POPUP("//*[@id='setFigsEqual']","xpath"),
	CONTINUE_ON_SET_FIGURE_EQUAL_POPUP("//*[@id='setFigsEqual']/div[2]/a[2]","xpath"),
	APPLY_CHANGES("//*[@id='nav']/li[3]/a/div","xpath"),
	PAXFORECAST_CLICK("//*[@id='resultsDetails']/div[7]/div/div/div[1]/div[2]", "xpath"),
	PAXFIRSTROW_INPUT("//*[@id='resultsDetails']/div[7]/div/div/div[1]/div[2]/input", "xpath"),
	PAXCLICK_1("//*[@id='resultsDetails']/div[7]/div/div/div[1]/div[3]", "xpath"),
	PAXINPUT_1("//*[@id='resultsDetails']/div[7]/div/div/div[1]/div[3]/input", "xpath"),
	PAXCOPY_ICON("//*[@id='resultsDetails']/div[7]/div/div/div[1]/div[3]/a/span", "xpath"),
	PAXCOPY_WHOLEROW("//*[@id='temp_r']/a", "xpath"),
	PAX_ANOTHER_COL("//*[@id='resultsDetails']/div[7]/div/div/div[2]/div[2]", "xpath"),
	PAX_ANOTHER_COL2("//*[@id='resultsDetails']/div[7]/div/div/div[1]/div[2]", "xpath"),
	SETFIG_ACTDATE("//label[contains(text(),'Actualized Date')]/../../span/select", "xpath"),
	SELECT_SETFIG_ACTDATE("//*[@id='PassengerForecastModel_ActualizedDate']/option[3]", "xpath"),
	PAXCLICK_11("//*[@id='resultsDetails']/div[7]/div/div/div[1]/div[2]", "xpath"),
	PAXCLICK_2("//*[@id='resultsDetails']/div[7]/div/div/div[2]/div[3]", "xpath"),
	PAXINPUT_2("//*[@id='resultsDetails']/div[7]/div/div/div[2]/div[3]/input", "xpath"),
	PAXCOPY_ICON_2("//*[@id='resultsDetails']/div[7]/div/div/div[2]/div[3]/a/span", "xpath"),
	PAX_ANOTHER_COL_2("//*[@id='resultsDetails']/div[7]/div/div/div[2]/div[2]", "xpath"),
	PAXCLICK_3("//*[@id='resultsDetails']/div[7]/div/div/div[3]/div[3]", "xpath"),
	PAXINPUT_3("//*[@id='resultsDetails']/div[7]/div/div/div[3]/div[3]/input", "xpath"),
	PAXCOPY_ICON_3("//*[@id='resultsDetails']/div[7]/div/div/div[3]/div[3]/a/span", "xpath"),
	PAX_ANOTHER_COL_3("//*[@id='resultsDetails']/div[7]/div/div/div[3]/div[2]", "xpath"),
	PAXCLICK_4("//*[@id='resultsDetails']/div[7]/div/div/div[1]/div[2]", "xpath"),
	PAXINPUT_4("//*[@id='resultsDetails']/div[7]/div/div/div[1]/div[2]/input", "xpath"),
	PAXCOPY_ICON_4("//*[@id='resultsDetails']/div[7]/div/div/div[1]/div[2]/a/span", "xpath"),
	PAX_ANOTHER_COL_4("//*[@id='resultsDetails']/div[7]/div/div/div[1]/div[1]", "xpath"),
	PAXCLICK_5("//*[@id='resultsDetails']/div[7]/div/div/div[2]/div[2]", "xpath"),
	PAXINPUT_5("//*[@id='resultsDetails']/div[7]/div/div/div[2]/div[2]/input", "xpath"),
	PAXCOPY_ICON_5("//*[@id='resultsDetails']/div[7]/div/div/div[2]/div[2]/a/span", "xpath"),
	PAX_ANOTHER_COL_5("//*[@id='resultsDetails']/div[7]/div/div/div[2]/div[1]", "xpath"),
	PAXCLICK_6("//*[@id='resultsDetails']/div[7]/div/div/div[3]/div[2]", "xpath"),
	PAXINPUT_6("//*[@id='resultsDetails']/div[7]/div/div/div[3]/div[2]/input", "xpath"),
	PAXCOPY_ICON_6("//*[@id='resultsDetails']/div[7]/div/div/div[3]/div[2]/a/span", "xpath"),
	PAX_ANOTHER_COL_6("//*[@id='resultsDetails']/div[7]/div/div/div[3]/div[1]", "xpath"),
	SAVEICON("//div[@class='IconSet']", "xpath"),
	RETURNSYMBOL("//a[@id='productionplanning']/following-sibling::ul/span/sup","xpath"),
    FLIGHTOVERVIEW_ACTUALIZEDDATE("//input[@id='ActualizedDate']","xpath"),
    FLIGHTOVERVIEW_FLIGHTNUMBER("//input[@id='FlightNumber']","xpath"),
    FLIGHT_DISPATCH_OK("//a[@id='processFtt']","xpath"),
    FLIGHTOVERVIEW_DISPATCH_FCP("//div[@id='paxResults']/div[7]/div/div/div/div[3]","xpath"),


	
    UPDATEDPLANNEDPAXFIGURES_SELECTEDMENU("//ul[@id='nav']/li[1]/div","xpath"),
    UPDATEDPLANNEDPAXFIGURES_MENU("//ul[@id='nav']/li[2]/div","xpath"),
    UPDATEDPLANNEDPAXFIGURES_VIEWBY("//li/div[@class='formMargin']/label","xpath"),
    UPDATEDPLANNEDPAXFIGURES_VIEWBYSELECT("//li/div[@class='formMargin']/label//..//span","xpath"),
    UPDATEDPLANNEDPAXFIGURES_VIEWBYSELECTOPTION("//li/div[@class='formMargin']/label//..//span/select","xpath"),
    UPDATEDPLANNEDPAXFIGURES_FLIGHT("//div[@id='paxfiguresByFlightGrid']//span[contains(text(),'Flight')]","xpath"),
    UPDATEDPLANNEDPAXFIGURES_FLIGHTINPUT("//div[@id='figuresGrid']//span[contains(text(),'Flight')]//../../../../..//div[@class='ui-state-default slick-headerrow-column l1 r1']/input","xpath"),
    UPDATEDPLANNEDPAXFIGURES_CUSTOMER("//div[@id='paxfiguresByFlightGrid']//span[contains(text(),'CUSTOMER')]","xpath"),
    UPDATEDPLANNEDPAXFIGURES_CUSTOMERINPUT("//div[@id='figuresGrid']//span[contains(text(),'CUSTOMER')]//../../../../..//div[@class='ui-state-default slick-headerrow-column l2 r2']/input","xpath"),
    UPDATEDPLANNEDPAXFIGURES_NO("//div[@id='paxfiguresByFlightGrid']//span[contains(text(),'No')]","xpath"),
    UPDATEDPLANNEDPAXFIGURES_NOINPUT("//div[@id='figuresGrid']//span[contains(text(),'No')]//../../../../..//div[@class='ui-state-default slick-headerrow-column l3 r3']/input","xpath"),
    UPDATEDPLANNEDPAXFIGURES_STARTDATE("//div[@id='paxfiguresByFlightGrid']//span[contains(text(),'Start Date')]","xpath"),
    UPDATEDPLANNEDPAXFIGURES_STARTDATEINPUT("//div[@id='figuresGrid']//span[contains(text(),'Start Date')]//../../../../..//div[@class='ui-state-default slick-headerrow-column l4 r4']/input","xpath"),
    UPDATEDPLANNEDPAXFIGURES_STOPDATE("//div[@id='paxfiguresByFlightGrid']//span[contains(text(),'Stop Date')]","xpath"),
    UPDATEDPLANNEDPAXFIGURES_STOPDATEINPUT("//div[@id='figuresGrid']//span[contains(text(),'Stop Date')]//../../../../..//div[@class='ui-state-default slick-headerrow-column l5 r5']/input","xpath"),
    UPDATEDPLANNEDPAXFIGURES_DAYS("//div[@id='paxfiguresByFlightGrid']//span[contains(text(),'Days')]","xpath"),
    UPDATEDPLANNEDPAXFIGURES_DAYSINPUT("//div[@id='figuresGrid']//span[contains(text(),'Days')]//../../../../..//div[@class='ui-state-default slick-headerrow-column l6 r6']/input","xpath"),
    UPDATEDPLANNEDPAXFIGURES_DEPT("//div[@id='paxfiguresByFlightGrid']//span[contains(text(),'DEPT.')]","xpath"),
    UPDATEDPLANNEDPAXFIGURES_DEPTINPUT("//div[@id='figuresGrid']//span[contains(text(),'DEPT.')]//../../../../..//div[@class='ui-state-default slick-headerrow-column l7 r7']/input","xpath"),
    UPDATEDPLANNEDPAXFIGURES_FLTGROUP("//div[@id='paxfiguresByFlightGrid']//span[contains(text(),'FLT. GROUP')]","xpath"),
    UPDATEDPLANNEDPAXFIGURES_FLTGROUPINPUT("//div[@id='figuresGrid']//span[contains(text(),'FLT. GROUP')]//../../../../..//div[@class='ui-state-default slick-headerrow-column l8 r8']/input","xpath"),
    
    UPDATEDPLANNEDPAXFIGURES_MENU_SETPLANNED("//a[@class='action-planSetpaxZero']","xpath"),
    UPDATEDPLANNEDPAXFIGURES_MENU_IMPORT("//a[@class='action-planImportFile']","xpath"),
    UPDATEDPLANNEDPAXFIGURES_MENU_IMPORT_TITLE("//span[@id='upLoadFiles_wnd_title']","xpath"),
    UPDATEDPLANNEDPAXFIGURES_MENU_IMPORT_CHOOSEFILES("//div[@id='upLoadFiles']/div[1]/a","xpath"),
    UPDATEDPLANNEDPAXFIGURES_MENU_IMPORT_INPUT("//div[@id='upLoadFiles']/div[1]/input","xpath"),
    UPDATEDPLANNEDPAXFIGURES_MENU_IMPORT_CANCEL("//a[@id='cancelButton']","xpath"),
    UPDATEDPLANNEDPAXFIGURES_MENU_IMPORT_IMPORTBUTTON("//a[@id='upload']","xpath"),
    UPDATEDPLANNEDPAXFIGURES_MENU_SETPLANNED_CONTINUE("//*[@id='setPlanPaxToZero']/div[3]/a[2]","xpath"),
    UPDATEDPLANNEDPAXFIGURES_MENU_SETPLANNED_CANCEL("//*[@id='setPlanPaxToZero']/div[3]/a[1]","xpath"),
    UPDATEDPLANNEDPAXFIGURES_MENU_SETPLANNED_MONTHSINPUT("//div[@id='setPlanPaxToZero']/div[1]/div/span/div/div/input","xpath"),
    UPDATEDPLANNEDPAXFIGURES_MENU_SETPLANNED_JAN("//*[@id='paxMonths_option_selected' and contains(text(),'January')]","xpath"),
    UPDATEDPLANNEDPAXFIGURES_MENU_SETPLANNED_SETMONTHSTOZERO_OK("//*[@id='loadingModal']/div[2]/a[2]","xpath"),
    
    
    UPDATEDPLANNEDPAXFIGURES_SELECTED_UPDATE("//a[@class='action-planUpdateItem']","xpath"),
    UPDATEDPLANNEDPAXFIGURES_SELECTED_SET("//a[@class='action-planSetselectedFlightsZero']","xpath"),
    UPDATEDPLANNEDPAXFIGURES_SELECTED_SETTITLE("//span[@id='loadingModal_wnd_title']","xpath"),
    UPDATEDPLANNEDPAXFIGURES_SELECTED_SETDESC("//div[@id='loadingModal']/div[1]/div","xpath"),
    UPDATEDPLANNEDPAXFIGURES_SELECTED_SETCANCEL("//div[@id='loadingModal']/div[2]/a[1]","xpath"),
    UPDATEDPLANNEDPAXFIGURES_SELECTED_SETOK("//div[@id='loadingModal']/div[2]/a[2]","xpath"),
    
    UPDATEDPLANNEDPAXFIGURES_VIEWBY_CLASS_FLIGHT("//div[@id='paxfiguresByClassGrid']//span[contains(text(),'Flight')]","xpath"),
    UPDATEDPLANNEDPAXFIGURES_VIEWBY_CLASS_FLIGHTINPUT("//div[@id='paxfiguresByClassGrid']//span[contains(text(),'Flight')]//../../../../..//div[@class='ui-state-default slick-headerrow-column l1 r1']/input","xpath"),
    UPDATEDPLANNEDPAXFIGURES_VIEWBY_CLASS_LEG("//div[@id='paxfiguresByClassGrid']//span[contains(text(),'Leg')]","xpath"),
    UPDATEDPLANNEDPAXFIGURES_VIEWBY_CLASS_LEGINPUT("//div[@id='paxfiguresByClassGrid']//span[contains(text(),'Leg')]//../../../../..//div[@class='ui-state-default slick-headerrow-column l2 r2']/input","xpath"),
    UPDATEDPLANNEDPAXFIGURES_VIEWBY_CLASS_CLASS("//div[@id='paxfiguresByClassGrid']//span[contains(text(),'Class')]","xpath"),
    UPDATEDPLANNEDPAXFIGURES_VIEWBY_CLASS_CLASSINPUT("//div[@id='paxfiguresByClassGrid']//span[contains(text(),'Class')]//../../../../..//div[@class='ui-state-default slick-headerrow-column l3 r3']/input","xpath"),
    UPDATEDPLANNEDPAXFIGURES_VIEWBY_CLASS_UPDATED("//div[@id='paxfiguresByClassGrid']//span[contains(text(),'Updated')]","xpath"),
    UPDATEDPLANNEDPAXFIGURES_VIEWBY_CLASS_UPDATEDINPUT("//div[@id='paxfiguresByClassGrid']//span[contains(text(),'Updated')]//../../../../..//div[@class='ui-state-default slick-headerrow-column l4 r4']/input","xpath"),
    UPDATEDPLANNEDPAXFIGURES_VIEWBY_CLASS_USER("//div[@id='paxfiguresByClassGrid']//span[contains(text(),'User')]","xpath"),
    UPDATEDPLANNEDPAXFIGURES_VIEWBY_CLASS_USERINPUT("//div[@id='paxfiguresByClassGrid']//span[contains(text(),'User')]//../../../../..//div[@class='ui-state-default slick-headerrow-column l5 r5']/input","xpath"),
    
    UPDATEDPLANNEDPAXFIGURES_FLIGHT_CHECKBOX("//input[@id='checkSelBox00']","xpath"),
    UPDATEPLANNEDPAXFIGURES_FLIGHTNAME("//input[@id='checkSelBox00']/../following-sibling::div[1]","xpath"),
    
    PLANNEDPAXBATCHUPDATEPOPUP_TITLE("//span[@id='plannedBatchUpdate_wnd_title']","xpath"),
    PLANNEDPAXBATCHUPDATEPOPUP_NOOFFLIGHTSORCLASSES("//div[@id='plannedBatchUpdatePopup']/div[1]/div[1]/label/label","xpath"),
    PLANNEDPAXBATCHUPDATEPOPUP_NOOFFLIGHTSORCLASSES_COUNT("//label[@id='NoOfFlightCount']","xpath"),
    PLANNEDPAXBATCHUPDATEPOPUP_HISTORYSTARTDATE("//div[@id='plannedBatchUpdatePopup']/div[1]/div[2]/label/label","xpath"),
    PLANNEDPAXBATCHUPDATEPOPUP_HISTORYSTARTDATE_INPUT("//input[@id='HistoryStartDate']","xpath"),
    PLANNEDPAXBATCHUPDATEPOPUP_HISTORYSTOPDATE("//div[@id='plannedBatchUpdatePopup']/div[1]/div[3]/label/label","xpath"),
    PLANNEDPAXBATCHUPDATEPOPUP_HISTORYSTOPDATE_INPUT("//input[@id='HistoryStopDate']","xpath"),
    PLANNEDPAXBATCHUPDATEPOPUP_IGNORECLASSES("//div[@id='plannedBatchUpdatePopup']/div[1]/div[4]/label","xpath"),
    PLANNEDPAXBATCHUPDATEPOPUP_IGNORECLASSES_CHECKBOX("//div[@id='plannedBatchUpdatePopup']/div[1]/div[4]/div/div[1]/input","xpath"),
    PLANNEDPAXBATCHUPDATEPOPUP_ADJUSTFIGURESBY("//div[@id='plannedBatchUpdatePopup']/div[1]/div[6]/label[1]/label","xpath"),
    PLANNEDPAXBATCHUPDATEPOPUP_ADJUSTFIGURESBY_INPUT("//input[@id='LastIncPercent']","xpath"),
    PLANNEDPAXBATCHUPDATEPOPUP_AUTOINSERTINTOMONTHS("//div[@id='plannedBatchUpdatePopup']/div[1]/div[7]/label/span","xpath"),
    PLANNEDPAXBATCHUPDATEPOPUP_AUTOINSERTINTOMONTHS_CHECKBOX("//input[@id='AutoInsertIntoMonths']/following-sibling::span","xpath"),
    PLANNEDPAXBATCHUPDATEPOPUP_CANCEL("//div[@id='plannedBatchUpdatePopup']/div[2]/a[1]","xpath"),
    PLANNEDPAXBATCHUPDATEPOPUP_CONTINUE("//div[@id='plannedBatchUpdatePopup']/div[2]/a[2]","xpath"),
    
    PLANNEDPAXBATCHUPDATEPOPUP_INSERT_TITLE("//span[@id='plannedPaxBatchInsert_wnd_title']","xpath"),
    PLANNEDPAXBATCHUPDATEPOPUP_INSERT_PAXFIGURESINTO("//div[@id='plannedPaxBatchInsert']//label","xpath"),
    PLANNEDPAXBATCHUPDATEPOPUP_INSERT_PAXFIGURESINTO_INPUT("//div[@id='plannedPaxBatchInsert']/div[1]/div/span[2]/span/div/div/input","xpath"),
    PLANNEDPAXBATCHUPDATEPOPUP_INSERT_CANCEL("//div[@id='plannedPaxBatchInsert']//a[@class='largebtnSkin btn-paxCancel']","xpath"),
    PLANNEDPAXBATCHUPDATEPOPUP_INSERT_CONTINUE(" //div[@id='plannedPaxBatchInsert']//a[@class='largebtnSkin btn-startPaxUpdate']","xpath"),
    
    PLANNEDPAXBATCHUPDATEPOPUP_AUTOINSERTINTOMONTHS_CHECKBOXCHECKED("//a[contains(@style,'inline-block') and contains(text(),'Start')]","xpath"),
    PLANNEDPAXBATCHUPDATEPOPUP_AUTOINSERTINTOMONTHS_CHECKBOXUNCHECKED("//a[contains(@style,'inline-block') and contains(text(),'Continue')]","xpath"),
 
    PLANNEDPAXBATCHUPDATEPOPUP_INSERT_PAXFIGURESINTO_JAN("//li[@id='months_option_selected' and contains(text(),'January')]","xpath"),
    PLANNEDPAXBATCHUPDATEPOPUP_INSERT_PAXFIGURESINTO_JANDELETE("//span[contains(text(),'January')]/following-sibling::span","xpath"),
    PLANNEDPAXBATCHUPDATEPOPUP_INSERT_PAXFIGURESINTO_FEB("//li[@id='months_option_selected' and contains(text(),'February')]","xpath"),
    PLANNEDPAXBATCHUPDATEPOPUP_INSERT_PAXFIGURESINTO_SELECTEDFEB("//span[text()='February']","xpath"),
    
    UPDATEDPLANNEDPAXFIGURES_CLASS_FLIGHT_CHECKBOX("//div[@id='paxfiguresByClassGrid']//input[@id='checkSelBox00']","xpath"),
    UPDATEDPLANNEDPAXFIGURES_CLASS_SELECTEDMENU_DELETEPAX("//ul[@id='nav']/li[1]/ul/li[3]/a","xpath"),
    FLTGRP_TEXT("//form[@id='fpForm']/div/div[4]/div/div/label","xpath"),
    FLTGRP_INPUT("//select[@id='PassengerForecastModel_FlightGroup']","xpath"),
    PAXFORECAST_FLIGHT("//span[contains(text(),'Flight NO')]","xpath"),
    PAXFORECAST_DEPTIME("//span[contains(text(),'Dep. Time')]","xpath"),
    PAXFORECAST_ACVERSION("//span[contains(text(),'A/C VERSION')]","xpath"),
    PAXFORECAST_LEG("//span[contains(text(),'Leg')]","xpath"),
    PAXFORECAST_CLASS("//span[contains(text(),'Class')]","xpath"),
    PAXFORECAST_APPLYCHANGES("//ul[@id='nav']/li[3]/a/div","xpath"),
    PAXFORECAST_MENU("//div[@id='paxForecastTable']//div[@class='IconSet fl']","xpath"),
    PAXFORECAST_MENU_SETFIGURESEQUALTODISPATCHFIGURES("//div[@id='paxForecastTable']//a[@class='action-setpaxzero']","xpath"),
    
    PAXFORECAST_PERIODGREATERTHAN31_POPUPTEXT("//*[@id='loadingModal']/div[1]/div","xpath"),
    PAXFORECAST_PERIODGREATERTHAN31_POPUPOKBUTTON("//*[@id='loadingModal']/div[2]/a","xpath"),
    CANCEL_ON_SET_FIGURE_EQUAL_POPUP("//*[@id='setFigsEqual']/div[2]/a[1]","xpath"),
    ;
	
	
	public String element,Identifier;
	private ProductionPlanningPaxForecastEnum(String element){
		 this.element = element;
	 }
	private ProductionPlanningPaxForecastEnum(String element, String Identifier){
		 this.element = element;
		 this.Identifier = Identifier;
	 }
	public String getElementPath(){
		return element;
	}
	public String getElementIdentifier(){
		return Identifier;
	}
}