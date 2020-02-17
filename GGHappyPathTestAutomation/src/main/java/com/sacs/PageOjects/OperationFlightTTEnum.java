package com.sacs.PageOjects;


public enum OperationFlightTTEnum {

	/*FLIGHTTT("//*[@id='flighttimetable']/a", "xpath"),
	ADDFLIGHT("//*[@id='contentHeader']/div[2]/a", "xpath"),*/
	FLIGHTTITLE("//*[@id='contentHeader']/div[1]/h1"),
	/*SEARCHFLIGHTNUMBERCHKBOX("//*[@id='searchContainer']/div[2]/div[1]/label[1]/span", "xpath"),
	SEARCHCUSTOMERCODECHKBOX("//*[@id='searchContainer']/div[2]/div[1]/label[2]/span", "xpath"),
	SEARCHCUSTOMERNOCHKBOX("//*[@id='searchContainer']/div[2]/div[1]/label[3]/span", "xpath"),
	FTTCUSTCODE("//*[@id='results']/table/tbody/tr[1]/td[2]", "xpath"),*/
	FTTADDLINE("//*[@id='addNewDetailTop']"),
	START_DATE("//*[@id='StartDate']"),
	STOP_DATE("//*[@id='EndDate']"),
	OPDAYSDD("//*[@id='formContainer']/div[1]/div[3]/a/img"),
	OPDAYSALLCHK("//*[@id='formContainer']/div[1]/div[3]/div[2]/div/label[1]/span"),
	FTT_ACVERSION("//*[@id='AircraftVersionCode']"),
	LOADING_SETUP_CODE("//*[@id='LoadingSetupCode']"),
	//ACVERSIONDD("//*[@id='ui-active-menuitem']", "xpath"),
	FTT_ARRTIME(".//*[@id='ArrivalTime']"),
	FTT_ARRFROM("//*[@id='ArrivalFrom']"),
	FTFDEPARTTIME("//*[@id='DepartureTime']"),
	FTTDEPARTFROM("//*[@id='DepartureFrom']"),
	FTTDEPARTTO("//*[@id='DepartsTo']"),
	FTT_ADDLINESAVE("//*[@id='btn-fttDtlUpdate']"),
	FLIGHT("//*[@id='FlightNumber']"),
	SELECTACVERSION("//*[@id='AircraftVersionGrid']/table/tbody/tr[1]/td[1]"),
	CUSTOMERNAME("//*[@id='CustomerName']"),
	CUSTNAMESEARCHICON("//*[@id='formBody']/div[2]/div[2]/a/img"),
	//CUSTSEARCHFIELD("//*[@id='showCustomerSearch']/div/div/div[1]/span[1]/input", "xpath"),
	CUSTSEARCHICON("//*[@id='showCustomerSearch']/div/div/div[1]/span[2]/a/img"),
	//CUSTNO("//*[@id='CustomerNumber']", "xpath"),
	ARRIVALDEPARTURE("//*[@id='ArrivalDeparture']"),
	HAUL("//*[@id='Haul']"),
	SELECTFIRSTFLIGHT("//*[@id='customerSearchGrid']/table/tbody/tr[1]/td[1]"),
	SELECTFIRSTFLIGHT2("//*[@id='customerSearchGrid']/table/tbody/tr/td[1]"),
	//ADDFLIGHTOK("//*[@id='formBody']/div[5]/a", "xpath"),
	BLANKCLICK("//*[@id='formContainer']/div[1]/div[10]/span/label"),
	FLIGHTFIRSTROW("//*[@id='results']/table/tbody/tr/td[1]"),
	DETAILWRAP("//*[@id='detailWrapper']/table/tbody/tr/td[16]/div/a"),
	EDITFTT("//*[@id='editDetailContainer0']/a"),
	//ACVERSIONADDLINE("//*[@id='detailWrapper']/table/tbody/tr/td[4]", "xpath"),
	INVERTED_SYMBOL("//*[@id='searchContainer']/div[1]/span[3]/a/img"),
	START_DATE_CRITERIA("//*[@id='StartDate']"),
	STOP_DATE_CRITERIA("//*[@id='EndDate']"),
	//LS_ON_GRID("//*[@id='results']/table/tbody/tr/td[12]/div","xpath"),
	DLVPLAN("//*[@id='detailWrapper']/table/tbody/tr/td[11]/a"),
	DLVPLAN_COL(".//*[@id='detailWrapper']/table/tbody/tr/td[11]"),
	ADD_DLVPLANBUTTON(".//*[@id='addLineContainer']/a[1]"),
	SEARCHDLVPLAN(".//*[@id='addDPsearch']"),
	//SEARCH_SUBMITE(".//*[@id='addArticlesWrapper']/div[1]/div[1]/div[1]/div[1]/span[2]/a/img","xpath"),
	SEARCHRESULT_CHECKBOX(".//*[@id='addDeliveryPlans']/table/tbody/tr/td[1]/div/label/span"),
	SEARCHRESULT_FIRST_CHECKBOX("//*[@id='addDeliveryPlans']/table/tbody/tr[1]/td[1]/div/label/span"),
	ADD_SELECTED("//*[@id='addArticlesWrapper']/div[1]/div[1]/div[2]/a"),
	ACVERSION_FINDICON(".//*[@id='searchAircraftVersion']"),
	//ACVERSION_FIRSTROW("//*[@id='AircraftVersionGrid']/table/tbody/tr[1]/td[2]","xpath"),
	ACVERSION_SECONDROW("//*[@id='AircraftVersionGrid']/table/tbody/tr[2]/td[2]"),
	//APPLY_CHANGES("Apply Changes","linkText"),
	//APPLYCHANGES2(".//*[@id='ddsaveContainer']/div[2]/a", "xpath"),
	//SEARCH_RESULT(".//*[@id='addDeliveryPlans']/table/tbody/tr[1]/td[2]","xpath"),
	CSPFLAG("//*[@id='detailWrapper']/table/tbody/tr/td[12]/a"),
	ADDCSP("//*[@id='addLineContainer']/a[1]"),
	ADDCSP_SEARCHBOX("//*[@id='addCspsearch']"),
	SELECTACVERSION2("//*[@id='AircraftVersionWrapper']/div[1]/div[1]/span[1]/input"),
	SEARCHACVICON2("//*[@id='AircraftVersionWrapper']/div[1]/div[1]/span[2]/a/img"),
	ADDCSP_SEARCHICON("//*[@id='fttDeliveryPlanWrapper']/div[5]/div[4]/div[1]/div[1]/span[2]/a/img"),
	ADDCSP_SELECTCHK("//*[@id='addCspGrid']/table/tbody/tr/td[1]/div/label/span"),
	ADDCSP_ADDSELECTED("//*[@id='fttDeliveryPlanWrapper']/div[5]/div[4]/div[2]/a"),
	/*ADDCSP_APPLYCHANGES("//*[@id='saveContainer']/a", "xpath"),
	CUST_CODE_SEARCHRESULT=("//*[@id='customerSearchGrid']/table/tbody/tr[1]/td[1]"),*/
	SEARCH_BAR(".//*[@id='articlesearch']"),
	CUSTOMER_NUMBER(".//*[@id='CustomerNumber']"),
	SEARCHRESULT(".//*[@id='results']/table/tbody/tr[1]/td[1]"),
	//GRID(".//*[@id='results']","xpath"),
	CUSTOMER_CODE_CHECKBOX("//*[@id='searchContainer']/div[2]/div[1]/label[2]/span"),
	FLIGHT_NO_CHECKBOX(".//*[@id='searchContainer']/div[2]/div[1]/label[1]/span"),
	CUSTOMER_CODE_POP_SEARCH_BOX(".//div[@id='childCustWrapper']//input[@id='articlesearch']"),
	CUSTOMER_CODE_POP_SEARCH_SUBMIT("//div[@id='childCustWrapper']//img[@class='searchSubmit']"),
	CUSTOMER_CODE_POP_CANCEL(".//*[@id='childCustSearchCancel']"),
	//CUSTOMER_CODE_POP_OK(".//*[@id='childCustSearchContinue']","xpath"),
	RETURN_FLIGHT(".//*[@id='RetFlightNumber']"),
	BACKTOSEARCH(".//*[@id='contentHeader']/div[2]/a"),
	//START_DATE_ICON(".//*[@id='formContainer']/div[1]/div[1]/span/span/span","xpath"), 
	/*EXPORT_BUTTON(".//*[@id='exportFlightDetails']","xpath"),
	CALENDAR(".//*[@id='StartDate_dateview']","xpath"), 
*/	END_DATE_ICON(".//*[@id='formContainer']/div[1]/div[2]/span/span/span"), 
	END_DATE_CALENDAR(".//*[@id='EndDate_dateview']"),
	OP_DAYS_TEXTBOX(".//*[@id='FlightOperDays']"),
	ARRIVAL_ICON(".//*[@id='formContainer']/div[1]/div[6]/span/span/span"),
	//ARRIVAL_TIME(".//*[@id='ArrivalTime_timeview']/li[3]","xpath"),
	DEPARTURE_ICON(".//*[@id='formContainer']/div[1]/div[7]/span/span/span"),
	//DEPARTURE_TIME(".//*[@id='DepartureTime_timeview']/li[5]","xpath"),
	DEPARTURE_TEXTBOX(".//*[@id='DepartureTime']"),
	/*LEG1(".//*[@id='legResults']/div[6]/div/div/div/div[3]","xpath"),
	LEG2(".//*[@id='legResults']/div[6]/div/div/div/div[4]","xpath"),
	LEG3(".//*[@id='legResults']/div[6]/div/div/div/div[5]","xpath"),
	LEG1_TEXT(".//*[@id='legResults']/div[6]/div/div/div/div[3]/input","xpath"),
	LEG2_TEXT(".//*[@id='legResults']/div[6]/div/div/div/div[4]/input","xpath"),
	LEG3_TEXT(".//*[@id='legResults']/div[6]/div/div/div/div[5]/input","xpath"),*/
	DLV_NOTES(".//*[@id='FlightInfoText']"),
	DOP(".//*[@id='DOPText']"),
	FLIGHT_REMARK(".//*[@id='InvoiceText']"),
	ADD_LINE_FORM(".//*[@id='formContainer']"),
	ADD_LINE_CANCEL(".//*[@id='btn-cancel']"),
	//TABLE_ROW(".//*[@id='detailWrapper']//table//tbody/tr","xpath"),
	DLV_SEARCH_RESULT(".//*[@id='addDeliveryPlans']/table/tbody/tr[1]/td[2]"),
	/*SELECTED_DP(".//*[@id='deliveryPlanResults']/div[6]/div/div/div/div[2]","xpath"),
	SELECTED_DP_CHECKBOX(".//*[@id='deliveryPlanResults']/div[6]/div/div/div[1]/div[1]/label/span","xpath"),
	REMOVE_SELECTED("Remove Selected","linkText"),*/
	BACK("Back"),
	CSP_COL(".//*[@id='detailWrapper']/table/tbody/tr[1]/td[12]/a"),
	//CSP(".//*[@id='detailWrapper']/table/tbody/tr[1]/td[12]","xpath"),
	CSP_CODE(".//*[@id='addCspGrid']/table/tbody/tr[1]/td[2]"),
	SEARCH_CSP(".//*[@id='addCspsearch']"),
	SEARCH_SUBMIT_CSP(".//*[@id='fttDeliveryPlanWrapper']/div[5]/div[4]/div[1]/div[1]/span[2]/a/img"),
	CSP_SECOND_ROW(".//*[@id='addCspGrid']/table/tbody/tr[2]/td[2]"),
	//SEARCH_RESULT_CSP(".//*[@id='addCspGrid']/table/tbody/tr[1]/td[2]","xpath"),
	CSP_CHECKBOX(".//*[@id='addCspGrid']/table/tbody/tr[1]/td[1]/div/label/span"),
	CSP_CHECKBOX2(".//*[@id='addCspGrid']/table/tbody/tr[2]/td[1]/div/label/span"),
	CSP_POPUP(".//*[@id='cancelOk']"),
	//REGISTERED_CSP(".//*[@id='cspResults']/div[6]/div/div/div/div[2]","xpath"),
	CSP_FIRST_ROW(".//*[@id='cspResults']/div[6]/div/div/div[1]/div[3]"),
	CSP_FIRST_ROW_CHECKBOX("//*[@id='checkSelBox00']"),
	MEAL_SERV_ICON(".//*[@id='detailWrapper']/table/tbody/tr/td[13]/a/span"),
	/*MT1_TEXTBOX(".//*[@id='msv_0']","xpath"),
	EXCEPTION(".//*[@id='detailWrapper']/table/tbody/tr/td[14]/a/span","xpath"),*/
	Add_EXCEPTION("Add Exception"),
	DEPARTURE_DATE("//*[@id='DepartureDate']"),
	SAVE("Save"),
	EXC_ARRIVAL_ICON(".//*[@id='fttExceptionForm']/div[4]/span/span/span"),
	EXC_ARRIVAL_TIME(".//*[@id='ArrivalTime_timeview']/li[5]"),
	EXC_ARRIVAL_TIME1(".//*[@id='ArrivalTime_timeview']/li[4]"),
	EXC_DEPARTURE_ICON(".//*[@id='fttExceptionForm']/div[5]/span/span/span"),
	EXC_DEPARTURE_TIME(".//*[@id='DepartureTime_timeview']/li[7]"),
	EXC_DEPARTURE_TIME1(".//*[@id='DepartureTime_timeview']/li[6]"),
	CANCEL("Cancel"),
	EXCEPTION_SETTING_ICON(".//*[@id='exceptionsTable']/table/tbody/tr/td[13]/a"),
	COPY_EXCEPTION("C"),
	EDIT_EXCEPTION("p"),
	REMOVE_EXCEPTION("X"),
	//EXCEPTION_FIRST_ROW("//*[@id='exceptionsTable']/table/tbody/tr/td[1]","xpath"),
	CONTINUE("Continue"),
	LEG_INFO_ICON(".//*[@id='detailWrapper']/table/tbody/tr[1]/td[10]/a/span"),
	//LEG_INFO_POPUP(".//*[@id='legContainer']","xpath"),
	CLOSE_BUTTON("Close"),
	ADDITIONAL_INFO_CONTAINER(".//*[@id='aditionalInfoContainer']"),
	ADD_INFO_ICON(".//*[@id='detailWrapper']/table/tbody/tr[1]/td[15]/a"),
	OK("OK"),
	//PAGETITILE(".//*[@id='contentHeader']/div[1]/h1","xpath"),
	EDIT_BTN("//*[@id='btn-restart']"),
	FLIGHT_GROUP("//*[@id='FlightGroup']"),
	LAST_UPDATED("//*[@id='lastUpdatedContainer']"),
	ADD_LINE_SETTING("//*[@id='detailWrapper']/table/tbody/tr[1]/td[16]/div/a"),
	/*OP_DAY_TUE(".//*[@id='formContainer']/div[1]/div[3]/div[2]/div/label[3]/span","xpath"),
	COPY_TO_TIMELINE(".//*[@id='saveContainer']/div/label/input","xpath"),
	CSP_COL1(".//*[@id='detailWrapper']/table/tbody/tr[2]/td[12]","xpath"), */
	COPY_TO_TIMELINE1(".//*[@id='saveContainer']/div/label/span"),
	MT1("//div[@id='dmsWrapper']/table//tr/td[4]/input"),
	//MT2("//div[@id='dmsWrapper']/table//tr/td[5]/input","xpath"),
	MEAL_TYPE_ICON(".//*[@id='detailWrapper']/table/tbody/tr[1]/td[13]/a/span"),
	ACVERSION_LIST("html/body/ul[4]/li[4]"),
	MENU(".//*[@id='menuContainer']/div"),
	QUICK_UPDATE_EXCE(".//*[@id='menuContainer']/ul/li[1]/a"),
	/*CALENDER_BODY(".//*[@id='calendarBody']","xpath"),
	EXPORT(".//*[@id='timetableCalanderExport']","xpath"),*/
	TICK("//table[@id='rotationCalendar']//tbody/tr[1]/td[5]/a"),
	//TICK1("//table[@id='rotationCalendar']//tbody/tr[1]/td[7]/a","xpath"),
	EXCEP_EDIT_POPUP(".//*[@id='fttExceptionEdit']"),
	CANCELLING_FLIGHT_CHECKBOX(".//*[@id='fttExceptionEdit']/div[1]/div/div[1]/label/span"),
	//ACVERSION(".//*[@id='ui-active-menuitem']","xpath"),
	SHOW_ALL_CANCELLATION("//*[@id='menuContainer']/ul/li[2]/a"),
	/*CANCELLED_FLIGHT_DATE("//*[@id='cancellList']/table/tbody/tr/td","xpath"),
	CANCELLATION_POPUP(".//*[@id='cancellContainer']","xpath"),
	ADD_LINE_FIRST_ROW("//*[@id='detailWrapper']/table/tbody/tr[1]/td[1]","xpath"),*/
	NEXT_BUTTON1("//*[@id='customerSearchGrid']/div/div/a[3]/span"),
	LAST_BUTTON("//*[@id='customerSearchGrid']/div/div/a[4]/span"),
	FIRST_BUTTON(".//*[@id='customerSearchGrid']/div/div/a[1]/span"),
	PREV_BUTTON("//*[@id='customerSearchGrid']/div/div/a[2]/span"),
	//DEL_PLAN_ON_ADDLINE(".//*[@id='detailWrapper']/table/tbody/tr[1]/td[11]","xpath"),
	SHOW_ENTRY_DROPDOWN("//*[@id='gridWrapper']/div[1]/div[3]/span/span[1]/span[2]"),
	BLANKCLICK2("//*[@id='formContainer']/div[2]/div[1]/div/span/label"),
	/*CUSTOMERS_SEARCHICON("//*[@id='formBody']/div[2]/div[2]/a/img", "xpath"),
	CUSTOMERS_SEARCHBOX("//*[@id='showCustomerSearch']/div/div/div/span[1]/input", "xpath"),
	CUSTOMERS_SEARCH_ICON("//*[@id='showCustomerSearch']/div/div/div/span[2]/a/img", "xpath"),
	CUSTOMER_SEARCHED("//*[@id='customerSearchGrid']/table/tbody/tr[1]/td[1]", "xpath"),
	CUSTOMER_POPUP_CANCELBTN("//*[@id='childCustSearchCancel']", "xpath"),
	DELETEICON("//*[@id='nav']/li[2]/div[2]/a", "xpath"),
	DELETEPOPUP_CONTINUEBTN("//*[@id='removeAlert']/div[3]/a[1]", "xpath"),
	NODATATODISPLAY("//*[@id='results']/table/tbody/tr/td", "xpath"),*/
	FTT_ACVERSIONSEARCHEDFLIGHT("//div[@id='results']/table/tbody/tr/td[10]/div"),
	//APPLYCHANGES_BTN("//*[@id='ddsaveContainer']/div[2]/a", "xpath"),
	R_CHKBOX("//*[@id='checkSelBox00']"),
	/*BACK_BTN("//*[@id='fttDtlBlock']/div[1]/a", "xpath"),
	SETTINGICON("//*[@class='settings']/a", "xpath"),
	ADD_EXCEPTION_BTN("//*[@id='addNewExceptionTop']", "xpath"),*/
	SAVE_EXCEPTION_BTN("//*[@id='btn-fltExceptionUpdate']"),
	COPYEXCEPTION2("//*[@class='settings']/div/div/div[3]/a"),
	REMOVE_2("//*[@class='settings']/div/div/div[4]/a"),
	;

	public String element;

	private OperationFlightTTEnum(String element){
		 this.element = element;
	 }

	public String getElement() {
		return element;
	}

	}
