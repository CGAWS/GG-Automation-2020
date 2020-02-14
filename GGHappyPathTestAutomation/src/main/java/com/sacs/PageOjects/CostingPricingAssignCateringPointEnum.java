package com.sacs.PageOjects;

public enum CostingPricingAssignCateringPointEnum {
	COSTING_PRICING("//*[@id='costingpricing']","xpath"),
	ASSIGN_CATERING_POINT("//*[@id='assigncateringpoints']/a","xpath"),
	PRODUCT_DESCRIPTION_BOX("//*[@id='prdCpcWrapper']/div[2]/ul/li[2]","xpath"),
	PRODUCT_DESCRIPTION_TEXT_BOX("//*[@id='prodDescription']","xpath"),
	OK("OK","linkText"),
	DESCRIPTION_ON_GRID("//*[@id='products']/table/tbody/tr/td[2]","xpath"),
	CPC_ON_FIRST_LINE("//*[@id='bomGrid']/div[6]/div/div/div[1]/div[3]//a","xpath"),
	DESCRIPTION_ON_RIGHT_SIDE_GRID("//*[@id='bomGrid']/div[6]/div/div/div[1]/div[2]","xpath"),
	DESCRIPTION_ON_BELOW_GRID("//*[@id='cpcInfo']/table/tbody/tr[4]/td[1]","xpath"),
	WASH("//*[@id='cpcTable']/div[7]/div/div/div/div[1]","xpath"),
	WASH_N("//*[@id='cpcGrid']/div[4]/div/table/tbody/tr[3]/td[2]/input","xpath"),
	PREP("//*[@id='cpcTable']/div[7]/div/div/div/div[2]","xpath"),
	PREP_MED_P("//*[@id='cpcTable']/div[9]/div/table/tbody/tr[3]/td[2]/input", "xpath"),
	COOK("//*[@id='cpcTable']/div[7]/div/div/div/div[3]","xpath"),
	COOK_SIMPLE_PP("//*[@id='cpcTable']/div[9]/div/table/tbody/tr[3]/td[3]/input", "xpath"),
	SAVE_CHANGES_POPUP("//*[@id='removeAlert']","xpath"),
	SAVE_ON_SAVE_CHANGES_POPUP("//*[@id='removeAlert']/div[3]/a[1]","xpath"),
	APPLYCHANGES("//*[@id='cpcForm']/div[3]/a[2]","xpath"),
	PAGETITLE("//*[@id='contentHeader']/div/h1", "xpath"),
	PRODUCT_NUMBER_RANGE("//*[@id='prdCpcWrapper']/div[2]/ul/li[1]", "xpath"),
	PRODUCT_DESCRIPTION_BTN("//*[@id='prdCpcWrapper']/div[2]/ul/li[2]", "xpath"),
	PRODNUMRANGE_DD("//*[@id='menuList']", "xpath"),
	FROM_RANGE("//*[@id='fromNumber']", "xpath"),
	TO_RANGE("//*[@id='toNumber']", "xpath"),
	PRODNUMRABGE_OKBTN("//*[@id='prdCpcWrapper']/div[2]/div/div[2]/a", "xpath"),
	PNR_PRODNO_HEADER("//*[@id='products']/table/thead/tr/th[1]/a", "xpath"),
	PNR_DESCRIPTION_HEADER("//*[@id='products']/table/thead/tr/th[2]/a", "xpath"),
	PNR_CUSTCODE_HEADER("//*[@id='products']/table/thead/tr/th[3]/a", "xpath"),
	HIDE_COMPLETED_CPC("//*[@id='topGrids']/div[1]/div[2]/a", "xpath"),
	NODATATODISPLAY("//*[@id='products']/table/tbody/tr/td", "xpath"),
	PRODUCT_SINGLEROW("//*[@id='products']/table/tbody/tr/td[1]", "xpath"),
	BOM_DETAILS("//*[@id='topGrids']/div[3]", "xpath"),
	CPC_ICON("//*[@id='topGrids']/div[3]/div/div[6]/div/div/div[2]/div[3]/span/a", "xpath"),
	TOTAL_CPC_POINTS("//*[@id='cpcForm']/div[1]/div/ul/li[11]/span", "xpath"),
	CPC_FRAME_DESCRIPTION("//*[@id='cpcInfo']/table/tbody/tr[4]/td[1]", "xpath"),
	BOM_DETAILS_DESCRIPTION("//*[@id='bomGrid']/div[6]/div/div/div[2]/div[2]", "xpath"),
	SUBPRODUCT_ARROW("//*[@id='bomGrid']/div[6]/div/div/div[2]/div[1]/span[2]", "xpath"),
	SUBPRODUCT_CPCICON("//*[@id='topGrids']/div[3]/div/div[6]/div/div/div[3]/div[3]/span/a", "xpath"),
	SUBPRODUCT_DESC("//*[@id='bomGrid']/div[6]/div/div/div[3]/div[2]", "xpath"),
	PRODUCT_CPC_ICON("//*[@id='topGrids']/div[3]/div/div[6]/div/div/div[1]/div[3]/span/a", "xpath"),
	CALCULATION_DATE("//*[@id='CalculationDate']", "xpath"),
	OK_BTN("//*[@id='okButton']", "xpath"),
	CPC_FRAME_DETAILS_DESC_FIRSTROW("//*[@id='cpcTable']/div[6]/div/div/div/div[2]", "xpath"),
	PREPCOOK_WASH_CLICK("//*[@id='cpcTable']/div[7]/div/div/div[1]/div[1]", "xpath"),
	PREPCOOK_WASH_INPUT("//*[@id='cpcGrid']/div[3]/div/table/tbody/tr[3]/td[2]/input", "xpath"),
	POPUPTEXT_MSG("//*[@id='removeAlert']/div[1]", "xpath"),
	MARKSAVE("//*[@id='removeAlert']/div[3]/a[1]", "xpath"),
	CANCEL("//*[@id='removeAlert']/div[3]/a[2]", "xpath"),
	PORTIONING_CPOINTS("//*[@id='cpcForm']/div[1]/div/ul/li[3]/span", "xpath"),
	PRODUCT_DESC_DD("//*[@id='menuList']", "xpath"),
	PROD_DESC_FIELD("//*[@id='prodDescription']", "xpath"),
	PROD_DESC_OK_BTN("//*[@id='prdCpcWrapper']/div[2]/div/div[3]/a", "xpath"),
	CP_PRODDESC("//*[@id='prodCostGrid']/table/tbody/tr[1]/td[2]", "xpath"),
	BOM_DESC_FIRSTROW("//*[@id='bomGrid']/div[6]/div/div/div/div[2]", "xpath"),
	OTHER_CUTSILPAPER_CLICK("//*[@id='cpcTable']/div[7]/div/div/div/div[1]", "xpath"),
	OTHER_CUTSILPAPER_INPUT("//*[@id='cpcGrid']/div[3]/div/table/tbody/tr[3]/td[2]/input", "xpath"),
	OTHER_CPCPOINTS("//*[@id='cpcForm']/div[1]/div/ul/li[10]/span", "xpath"),
	SALESNUMBERRANGE("//*[@id='prdCpcWrapper']/div[2]/ul/li[3]", "xpath"),
	SNR_DROPDOWN("//*[@id='menuList']", "xpath"),
	SNR_FROM("//*[@id='fromNumbers']", "xpath"),
	SNR_TO("//*[@id='toNumbers']", "xpath"),
	SNR_OKBTN("//*[@id='prdCpcWrapper']/div[2]/div/div[4]/a", "xpath"),
	SNR_SHOWINGENTRIES("//*[@id='topGrids']/div[1]/div[3]/span", "xpath"),
	SNR_SALESNO_GRIDFIRTSROW("//*[@id='products']/table/tbody/tr/td[1]", "xpath"),
	SNR_PRODUCT("//*[@id='bomGrid']/div[6]/div/div/div/div[1]", "xpath"),
	CALC_ICON("//*[@id='bomGrid']/div[6]/div/div/div/div[3]/span/a", "xpath"),
	CPC_FRAME("//*[@id='cpcForm']/div[1]/div", "xpath"),
	SUBPRODUCT_CALCICON("//*[@id='bomGrid']/div[6]/div/div/div[2]/div[3]/span/a", "xpath"),
	WASH_CLOSEBTN("//*[@id='cpcGrid']/div[4]/div/div/a[2]", "xpath"),
	CUSTOMER("//*[@id='prdCpcWrapper']/div[2]/ul/li[4]", "xpath"),
	CUSTOMER_FIELD("//*[@id='customerCode']", "xpath"),
	CUSTOMER_SEARCHICON("//*[@id='prdCpcWrapper']/div[2]/div/div[5]/span/a", "xpath"),
	CUSTOMER_OKBTN("//*[@id='prdCpcWrapper']/div[2]/div/div[5]/a", "xpath"),
	CUST_POPUP_CANCELBTN("//*[@id='childCustSearchCancel']", "xpath"),
	CUST_POPUP_OKBTN("//*[@id='childCustSearchContinue']", "xpath"),
	CUST_POPUP_TITLE("//*[@id='showCustomerCodeSearch_wnd_title']", "xpath"),
	CUST_SEARCHBOX("//*[@id='showCustomerCodeSearch']/div/div/div/span/input", "xpath"),
	CUST_SEARCHICON("//*[@id='showCustomerCodeSearch']/div/div/div/span[2]/a/img", "xpath"),
	CUST_FIRSTROW("//*[@id='customerSearchGrid']/table/tbody/tr[1]/td[1]", "xpath"),
	CUST_SEARCHRRECORD("//*[@id='customerSearchGrid']/table/tbody/tr/td[1]", "xpath"),
	CUST_CODE("//*[@id='customerSearchGrid']/table/tbody/tr/td[2]", "xpath"),
	CUST_PROD_FIRSTROW("//*[@id='products']/table/tbody/tr[1]/td[1]", "xpath"),
	CUST_CALCICON("//*[@id='bomGrid']/div[6]/div/div/div[1]/div[3]/span/a", "xpath"),
	CUST_CALCICON_SUBPROD("//*[@id='bomGrid']/div[6]/div/div/div[2]/div[3]/span/a", "xpath"),
	PRODNUM_TEXT("//*[@id='bomGrid']/div[6]/div/div/div[1]/div[1]", "xpath"),
	KEY("//*[@id='prdCpcWrapper']/div[2]/ul/li[5]", "xpath"),
	KEY_FIELD("//*[@id='KeyField']", "xpath"),
	KEY_OKBTN("//*[@id='prdCpcWrapper']/div[2]/div/div[6]/a", "xpath"),
	PRODUCTRANGE_OKBTN("//*[@id='prdCpcWrapper']/div[2]/div/div[1]/a", "xpath"),
	CPCFRAME_PRODUCT("//*[@id='cpcInfo']/table/tbody/tr[2]/td[2]", "xpath"),
	CPC_ICON_SET("//div[@id='bomGrid']/div[6]/div/div/div[2]/div[3]/span/a", "xpath"),
	;
	
	public String element,Identifier;
	private CostingPricingAssignCateringPointEnum(String element){
		 this.element = element;
	 }
	private CostingPricingAssignCateringPointEnum(String element, String Identifier){
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
