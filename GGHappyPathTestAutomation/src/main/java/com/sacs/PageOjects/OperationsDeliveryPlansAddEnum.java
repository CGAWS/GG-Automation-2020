package com.sacs.PageOjects;

public enum OperationsDeliveryPlansAddEnum {

	
	OPERATIONS("operations"),
	
	DELIVERY_PLANS(".//*[@id='deliveryplan']/a"),
	ADD_DELIVERY_PLANS(".//*[@id='addNew']"),
	OK_BTN("//*[@id='delPlanForm']/div[4]/a"),
	RESULT_GRID_FIRST_COLUMN("//*[@id='results']/table/tbody/tr[1]/td[1]"),
	DELIVERY_PLAN_TEXTBOX("//*[@id='Code']"),
	DESCRIPTION_TEXTBOX("//*[@id='Description']"),
	CUSTOMER_CODE_DROPDOWN("//*[@id='ParentCustomerId']"),
	/*MANAGE_UNITS("//*[@id='delPlanForm']/div[2]/div/a","xpath"),

	AUS_SYD_CHECKBOX_XPATH(".//*[@id='linkUnitsGrid']/div[6]/div/div/div/div[1]/label/span","xpath"),*/

	//AUS_SYD_CHECKBOX_XPATH(".//*[@id='linkUnitsGrid']/div[5]/div/div/div[1]/label/input","xpath"),

	/*LINK_TO_UNIT_CONTINUE("//*[@id='selLinkUnit']","xpath"),
	ADD_LINE_SEARCH("//*[@id='delPlanForm']/div[4]/a","xpath"),
	MANAGE_UNIT("Manage Units","linkText"),*/
	TOAST_MSG("toast-message"),
	CONTINUE_BTN(".//*[@id='selLinkUnit']"),
	//CANCEL_BTN(".//*[@id='cancelLinkUnit']","xpath"),
	SEARCH_BAR(".//*[@id='articlesearch']"),
	SEARCH_TRIANGLE_BTN("//*[@id='searchContainer']/div[1]/span[3]/a/img"),
	SEARCH_BUTTON(".//*[@id='searchContainer']/div[1]/span[2]/a/img"),
	//DESC_CHEKBOX("//*[@id='searchContainer']/div[2]/div[1]/div/label[2]/span","xpath"),
	CUSTOMER_CODE_CHEKBOX("//*[@id='searchContainer']/div[2]/div[1]/div/label[3]/span"),
	/*RETURN_CHECKBOX(".//*[@id='searchContainer']/div[2]/div[2]/label[1]/span","xpath"),
	SPECIAL_CHECKBOX(".//*[@id='searchContainer']/div[2]/div[2]/label[1]/span","xpath"),*/
	CUSTOMER_NAME_CHECKBOX(".//*[@id='searchContainer']/div[2]/div[2]/label[3]/span"),
	BACK_TO_SEARCH("Back to Search"),
	ADDDELPLAN("//*[@id='addNew']"),
	MANAGE_UNIT_BUTTON("//*[@id='delPlanForm']/div[2]/div/div[1]/div[2]/a"),
	UNIT_CHECK_BOX("//*[@id='linkUnitsGrid']/div[6]/div/div/div/div/input"),
	/*CONTINUE_ON_LINK_POPUP("//*[@id='selLinkUnit']","xpath"),
	SALES_NUMBER_OUTER("//*[@id='delplanDetailsGrid']/div[5]/div/div/div[4]","xpath"),
	SALES_NUMBER_SEARCH_BTN("//*[@id='delplanDetailsGrid']/div[5]/div/div/div[4]/a/span","xpath"),*/
	SALES_NUMBER_POPUP_FIRST_ITEM("//*[@id='salesNumberSearchGrid']/table/tbody/tr[1]/td[2]"),
	SALES_NUMBER_POPUP_CONTINUE("//*[@id='selSalesNoContinue']"),
	/*COMBINED_CLASS_OUTER("//*[@id='delplanDetailsGrid']/div[5]/div/div/div[9]","xpath"),
	COMBINED_CLASS_DROPDOWN("//*[@id='delplanDetailsGrid']/div[5]/div/div/div[9]/select","xpath"),*/
	APPLY_CHANGES("//*[@id='addDetailContainer']/a[2]"),
	CLASSDD("//*[@id='delplanDetailsGrid']/div[5]/div/div/div[8]/select"),
	PAGETITLE("//*[@id='contentHeader']/div[1]/h1"),
	RESULT_FIRST_ROW_FIRST_COL(".//*[@id='results']/table/tbody/tr/td[1]"),
	DELETEICON("//*[@id='removelPlanLink']/div"),
	POPUPCONTINUE("//*[@id='removeAlert']/div[3]/a[1]"),
	NODATATODISPLAY("//*[@id='results']/table/tbody/tr/td"),
	FIRST_ROW_FIRST_COL(".//*[@id='results']/table/tbody/tr[1]/td[1]"),
	DELIVERY_PLANS_CHECK(".//*[@id='searchContainer']/div[2]/div[1]/div/label[2]/span"),
	//FIRST_ROW_SECOND_COL(".//*[@id='results']/table/tbody/tr[1]/td[2]","xpath"),
	REMOVE_SELECTED(".//*[@id='addLineContainer']/span[1]/a"),
	ADD_LINE("//*[@id='addLineContainer']/span[2]/a"),
	EXPORT(".//*[@id='action_dpDetailsExport']"),
	/*COPYICON("C","linkText"),
	CANCEL(".//*[@id='cancelButton']","xpath"),*/
	POPUP_TITLE(".//*[@id='showlinkUnit_wnd_title']"),
	/*CANCEL_LINK_POPUP(".//*[@id='cancelLinkUnit']","xpath"),
	UNIT_LABEL(".//*[@id='linkUnitsGrid']/div[6]/div/div/div/div[2]","xpath"),
	SELECTED_UNIT_TEXTBOX(".//*[@id='SelectedUnits']","xpath"),*/
	SLIK_GRID_CHECKBOX(".//*[@id='delplanDetailsGrid']/div[2]//span[@class='slick-column-name']/input[@type='checkbox']"),
	/*SLIK_FIRST_ROW_COPY(".//*[@id='delplanDetailsGrid']/div[6]/div/div/div/div[2]/span/a","xpath"), 
	REMOVE_BUTTON("X","linkText"),*/
	REMOVE_SELECTED_POPUP_CONT(".//*[@id='loadingModal']/div[2]/a[1]"),
	//SNO(".//*[@id='delplanDetailsGrid']/div[6]/div/div/div/div[4]","xpath"),   
	SNO_ICON(".//*[@id='delplanDetailsGrid']/div[6]/div/div/div/div[4]/a/span"),
	SNO_POPUP_TITLE(".//*[@id='showSalesNoSearch_wnd_title']"),
	//BOXCODE_POPUP_TITLE(".//*[@id='showboxCodeSearch_wnd_title']","xpath"),
	SNO_POPUP_CANCEL(".//*[@id='cancelSalesNo']"),
	SNO_POPUP_FIRSTROW(".//*[@id='salesNumberSearchGrid']/table/tbody/tr[1]/td[1]"),
	SNO_POPUP_CONTI(".//*[@id='selSalesNoContinue']"),
	SNO_TEXTBOX(".//*[@id='delplanDetailsGrid']/div[6]/div/div/div/div[4]/input"),
	/*SNO_TEXT_SECONDROW("//*[@id='delplanDetailsGrid']/div[6]/div/div/div[2]/div[4]/input", "xpath"),
	BC_TEXTBOX(".//*[@id='delplanDetailsGrid']/div[6]/div/div/div/div[5]","xpath"),
	BC_TEXTBOX_INPUT(".//*[@id='delplanDetailsGrid']/div[6]/div/div/div/div[5]/input","xpath"),
	DESCRIPTION(".//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[1]","xpath"),
	CLASS_CODE(".//*[@id='delplanDetailsGrid']/div[5]/div/div/div[9]","xpath"),
	SEQ(".//*[@id='delplanDetailsGrid']/div[5]/div/div/div[5]","xpath"),
	SEQ1(".//*[@id='delplanDetailsGrid']/div[6]/div/div/div/div[4]","xpath"),
	NEW_SEQ("//*[@id='delplanDetailsGrid']/div[6]/div/div/div/div[5]","xpath"),
	NEW_SEQ_INPUT("//*[@id='delplanDetailsGrid']/div[6]/div/div/div/div[5]/input","xpath"),
	SEQ_TEXTBOX(".//*[@id='delplanDetailsGrid']/div[5]/div/div/div[5]/input","xpath"),
	SEQ1_TEXTBOX(".//*[@id='delplanDetailsGrid']/div[6]/div/div/div/div[4]/input","xpath"),
	L(".//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[2]","xpath"),
	L_TEXTBOX(".//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[2]/input","xpath"),*/
	C("//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[3]"),
	C_DROPDOWN("//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[3]/select"),
	CC("//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[3]"),
	CC_DROPDOWN(".//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[3]/select"),
	/*S(".//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[5]","xpath"),
	S_TEXTBOX(".//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[5]/input","xpath"),
	V(".//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[6]","xpath"),
	V_DROPDOWN(".//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[6]/select","xpath"),
	LOAD_RATIO_POPUP_FIRSTROW(".//*[@id='loadInsSearchGrid']/table/tbody/tr[1]/td[2]","xpath"),
	LR_SEARCH_ICON("//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[15]/a/span","xpath"),
	LOAD_RATIO_POPUP_CONTI(".//*[@id='selLoadInsContinue']","xpath"),
	LR("//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[15]","xpath"),
	LR_TEXTBOX("//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[15]/input","xpath"),
	LR_POPUP_TITLE(".//*[@id='showloadInsSearch_wnd_title']","xpath"),
	LOAD_RATIO_POPUP_CANCEL(".//*[@id='cancelLoadIns']","xpath"),
	QTY("//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[17]","xpath"),
	QTY_TEXTBOX("//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[17]/input","xpath"),
	ROT("//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[18]","xpath"),
	ROT_FIND_ICON("//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[18]/a/span","xpath"),
	ROT_TEXTBOX("//*[@id='delplanD[6]etailsGrid']/div[7]/div/div/div/div[18]/input","xpath"),
	ROT_POPUP_TIT(".//*[@id='showRotPlanSearch_wnd_title']","xpath"),
	ROT_POP_CANCEL(".//*[@id='cancelRotPlan']","xpath"),
	ROT_POP_CONTI(".//*[@id='selRotPlanContinue']","xpath"),
	ROT_POP_FIRSTROW(".//*[@id='rotPlanSearchgrid']/table/tbody/tr[1]/td[1]","xpath"),
	N("//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[19]","xpath"),
	N_TEXTBOX("//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[19]/input","xpath"),
	DCODE("//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[21]","xpath"),
	DCODE_FIND_ICON("//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[21]/a/span","xpath"),
	DCODE_POPUP_FIRSTROW(".//*[@id='distCodeSearchGrid']/table/tbody/tr[1]/td[1]","xpath"),
	DCODE_POPUP_CONTI(".//*[@id='selDistCodeContinue']","xpath"),
	START_DATE("//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[22]","xpath"),
	START_DATE_TEXTBOX("//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[22]/span/span/input","xpath"),
	STOP_DATE("//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[23]","xpath"),
	STOP_DATE_TEXTBOX("//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[23]/span/span/input","xpath"),
	STATUS("//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[24]","xpath"),
	STATUS_DROPDOWN("//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[24]/select","xpath"),
	CSTAT("//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[25]","xpath"),
	CSTAT_DROPDOWN("//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[25]/select","xpath"),
	SPML_CHECKBOX(".//*[@id='delPlanForm']/div[1]/div[5]/label/span","xpath"),
	LPR("//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[15]","xpath"),
	LPR_DROPDOWN("//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[15]/select","xpath"),
	RETURN_COUNT_CHECKBOX(".//*[@id='delPlanForm']/div[1]/div[4]/label/span","xpath"),
	T_DROPDOWN(".//*[@id='delplanDetailsGrid']/div[6]/div/div/div/div[4]/select","xpath"),
	SNO_RETURN_FINDICON(".//*[@id='delplanDetailsGrid']/div[6]/div/div/div/div[5]/a/span","xpath"),
	SNO_RETURN(".//*[@id='delplanDetailsGrid']/div[6]/div/div/div/div[5]","xpath"),
	BC_POPUP_CANCEL(".//*[@id='cancelBoxCode']","xpath"),
	BC_POPUP_FIRSTROW(".//*[@id='boxCodeGrid']/table/tbody/tr[1]/td[1]","xpath"),
	BC_POPUP_CONTI(".//*[@id='selBoxCodeContinue']","xpath"),
	CLASS_RETURN(".//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[4]","xpath"),
	CLASS_RETURN_DROPDOWN(".//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[4]/select","xpath"),
	CONFIRMATION_POPUP_CONTI(".//*[@id='removeAlert']/div[3]/a[1]","xpath"),
	FIRST_ROW(".//*[@id='delplanDetailsGrid']/div[5]/div/div/div[1]","xpath"),
	SURCHARGE("//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[8]", "xpath"),
	SURCHARGE_CLICK("//*[@id='checkBox0']", "xpath"),
	ADDLINE_QTY("//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[17]", "xpath"),
	AADLINE_QTYINPUT("//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[17]/input", "xpath"),
	GRID_OUTER_BOX(".//*[@id='delplanDetailsGrid']/div[6]/div/div","xpath"),
	ROTATION_PLAN_SEARCH_INPUT("//*[@id='showRotPlanSearch']/div/div//input[@id='articlesearch']","xpath"),
	ROTATION_PLAN_SEARCH_SUBMIT("//*[@id='showRotPlanSearch']/div/div//img[@class='searchSubmit']","xpath"),
	ROTATION_PLAN_SEARCH_FILTER("//div[@id='rotationPlanWrapper']//img[@class='searchFilter']","xpath"),
	ROTATION_PLAN_ON_POPUP("//*[@id='rotPlanSearchgrid']/table/tbody/tr/td[1]","xpath"),
	ROTATION_PLAN_ICON("//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[20]/span/a","xpath"),
	ROT_PLAN_CONTAINER("//*[@id='rotCalenderContainer']","xpath"),
	DESCRIPTION_CHECKBOX("//*[@id='searchContainer']/div[2]/div[1]/label[2]/span","xpath"),
	STOP_DATE_CHECKBOX("//*[@id='searchContainer']/div[2]/div[2]/label/span","xpath"), 
	FIRST_LINE_CHECKBOX(".//*[@id='delplanDetailsGrid']/div[6]/div/div/div/div[1]/input","xpath"),
	FLIGHTTIMETABLE(".//*[@id='flighttimetable']/a","xpath"),
	AUS_SYD_CHECKBOX_XPATH1("//*[@id='linkUnitsGrid']//div[starts-with(@class, 'slick-viewport')]//input[@type='checkbox']"),
	REMOVE(".//*[@id='removelPlanLink']/div","xpath"),
	POPUP_MESSAGE(".//*[@id='errorAlert']/div[2]","xpath"),
	POPUP_OK_BUTTON(".//*[@id='errorAlert']/div[3]/a","xpath"),
	POPUP_TITL(".//*[@id='removeAlert']/div[1]","xpath"),
	CONFIRMATION_POPUP_CANCEL(".//*[@id='removeAlert']/div[3]/a[2]","xpath"),
	MENU(".//ul[@id='nav']//li[@class='last']/div","xpath"),
	WHERE_USED(".//*[@id='nav']/li[1]/ul/li[1]/a","xpath"),
	WHERE_POPUP_TITLE(".//*[@id='gridPlanUsedContainer_wnd_title']","xpath"),
	WHERE_POP_EXPORT(".//*[@id='exportUsedPlan']","xpath"),
	WHERE_POP_CANCEL(".//*[@id='cancelPlanUsed']","xpath"),
	COPY_DLVPLAN(".//*[@id='nav']/li[1]/ul/li[2]/a","xpath"),
	COPY_DP_POP_TEXTBOX(".//*[@id='newDeliveryName']","xpath"),
	COPY_DP_CONTI(".//*[@id='copyDeliveryPlan']","xpath"),
	CONFR_POP_CONTI(".//*[@id='removeAlert']/div[3]/a[1]","xpath"),
	CLEAR_DATE(".//*[@id='nav']/li[1]/ul/li[3]/a","xpath"),
	COPY_ICON("C","linkText"),
	NO_DATA_TO_DISPLAY(".//*[@id='gridPlanUsed']/table/tbody/tr/td","xpath"),
	CANCEL_POP(".//*[@id='cancelCopy']","xpath"),
	AUS_SYD_CHECKBOX(".//*[@id='linkUnitsGrid']/div[5]/div/div/div[1]/label","xpath"),
	SPML_TYPE("//*[@id='delplanDetailsGrid']/div[6]/div/div/div/div[5]","xpath"),
	SPML_TYPE_DROPDOWN("//*[@id='delplanDetailsGrid']/div[6]/div/div/div/div[5]/select","xpath"),
	SHOW_ENTRY_DROPDOWN(".//*[@id='gridWrapper']/div[1]/div[3]/span/span[1]/span[2]"),
	CLASS_CLICK("//*[@id='delplanDetailsGrid']/div[7]/div/div/div[1]/div[4]", "xpath"),
	CLASS_SELECT("//*[@id='delplanDetailsGrid']/div[7]/div/div/div[1]/div[4]/select", "xpath"),
	ADDQTY("//*[@id='delplanDetailsGrid']/div[7]/div/div/div[1]/div[12]", "xpath"),
	ADDQTY_INPUT("//*[@id='delplanDetailsGrid']/div[7]/div/div/div[1]/div[12]/input", "xpath"),
	BLANKCLICK("//*[@id='delplanDetailsGrid']/div[6]/div/div/div/div[3]", "xpath"),
	SALESNO_SEARCHBOX("//*[@id='showSalesNoSearch']/div[1]/div[1]/div[1]/span[1]/input", "xpath"),
	SALESNO_SEARCHICON("//*[@id='showSalesNoSearch']/div[1]/div[1]/div[1]/span[2]/a/img", "xpath"),
	SALESNO_SEARCHRECORD("//*[@id='salesNumberSearchGrid']/table/tbody/tr/td[1]", "xpath"),
	C_SECONDROW("//*[@id='delplanDetailsGrid']/div[7]/div/div/div[2]/div[3]", "xpath"),
	C_DROPDOWN_SECONDROW("//*[@id='delplanDetailsGrid']/div[7]/div/div/div[2]/div[3]/select", "xpath"),
	QTY_SECONROW_CLICK("//*[@id='delplanDetailsGrid']/div[7]/div/div/div[2]/div[17]", "xpath"),
	QTY_SECONDROW_INPUT("//*[@id='delplanDetailsGrid']/div[7]/div/div/div[2]/div[17]/input", "xpath"),
	CUSTCODE_DD("ParentCustomerId", "id"),
	UNIT_CHECKBOX("//*[@id='checkSelBox00']", "xpath"),
	UNIT_SELECTALL("//*[@id='checkBoxAll']", "xpath"),
	VAT_CHK("//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[6]/input", "xpath"),
	LR_CLICK("//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[15]", "xpath"),
	LR_INPUT("//*[@id='delplanDetailsGrid']/div[7]/div/div/div/div[15]/input", "xpath"),*/
	;
	
	
	
public String element;
	private OperationsDeliveryPlansAddEnum(String element){
		 this.element = element;
	 }
	
	public String getElementPath(){
		return element;
	}
	
}