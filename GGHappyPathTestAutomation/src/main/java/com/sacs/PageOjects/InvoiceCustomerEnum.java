package com.sacs.PageOjects;

public enum InvoiceCustomerEnum {
	
	INVOICE("//*[@id='invoice']", "xpath"),
	APPLYCHANGES("//*[@id='applyChanges']/div", "xpath"),
	CUSTOMER("//*[@id='customer']/a","xpath"),
	PAGETITLE("//*[@id='contentHeader']/div[1]/h1","xpath"),
	NAME_ON_LANDING_PAGE_GRID("//*[@id='custSearchGrid']/table/tbody/tr[2]/td[1]","xpath"),
	NAME_ON_LANDING_PAGE_GRID2("//*[@id='custSearchGrid']/table/tbody/tr[4]/td[1]","xpath"),
	ADDRESS("//*[@id='Address1']","xpath"),
	EDIT_MAIN_CUSTOMER("//*[@id='editMainCustomer']","xpath"),
	GROUP_NAME("//*[@id='GroupName']","xpath"),
	APPLYCHANGES_ON_UPDATE_MAIN_CUSTOMER("//*[@id='nav']/li[3]/a/div","xpath"),
	ADD_CUSTOMER_BTN("//*[@id='addNew']", "xpath"),
	BACKTOSEARCH("//*[@id='backToSearch']", "xpath"),
	ADDCUSTOMER_OK_BTN("//*[@id='okButton']", "xpath"),
	ADDCUST_CUSTOMERTYPEDD("//*[@id='CustomerType']", "xpath"),
	ADDMAINCUST_APPLYCHANGESBTN("//*[@id='applyChanges']", "xpath"),
	ADDMAINCUST_RESTARTBTN("//*[@id='restartBtn']", "xpath"),
	AMC_CUSTOMERCODE("//*[@id='CodeForAirline']", "xpath"),
	AMC_CUSTOMERNAME("//*[@id='Name']", "xpath"),
	AMC_GROUPNAME("//*[@id='GroupName']", "xpath"),
	AMC_GATESTATUS("//*[@id='GateStatus']", "xpath"),
	AMC_SALESCODEDECIMAL("//*[@id='SalesPriceDecimal']", "xpath"),
	AMC_ALIAS("//*[@id='Alias']", "xpath"),
	AMC_SALESDESPATCHCOST("//*[@id='SalesDispatchCostPct']", "xpath"),
	AMC_BASICARTICLEWYFACTOR("//*[@id='WasteorYieldFactor']", "xpath"),
	AMC_BASICARTICLEINFLATION("//*[@id='InflationRate']", "xpath"),
	AMC_INDUSTRYCODE("//*[@id='IndustryCode']", "xpath"),
	AMC_MARKALT1("//*[@id='MarkupPercent1']", "xpath"),
	AMC_MARKALT2("//*[@id='MarkupPercent2']", "xpath"),
	AMC_MARKALT3("//*[@id='MarkupPercent3']", "xpath"),
	AMC_APPROVEDSTATUS_CHKBOX("//*[@id='customerForm']/div[2]/div[5]/label/span", "xpath"),
	AMC_STRATEGICACCOUNT_CHKBOX("//*[@id='customerForm']/div[2]/div[6]/label/span", "xpath"),
	AMC_GLOBALCUSTOMER_CHKBOX("//*[@id='customerForm']/div[2]/div[7]/label/span", "xpath"),
	AMC_CUSITEMSLIP_CHKBOX("//*[@id='customerForm']/div[2]/div[8]/label/span", "xpath"),
	AMC_PAXFIGS_CHKBOX("//*[@id='customerForm']/div[2]/div[9]/label/span", "xpath"),
	CUSTOMERNAME_THIRDROW("//*[@id='custSearchGrid']/table/tbody/tr[3]/td[1]", "xpath"),
	CUSTNAME_SINGLEROW("//*[@id='custSearchGrid']/table/tbody/tr/td[1]", "xpath"),
	CUSTCODE_NONAIRLINE("//*[@id='CodeForNonAirline']", "xpath"),
	CONFIRMATION_TEXT("//*[@id='confirmChangesAlert']/div[1]", "xpath"),
	CONFIRM_POPUP_CONTINUEBTN("//*[@id='confirmChangesAlert']/div[2]/a[1]", "xpath"),
	CONFIRM_POPUP_CANCELBTN("//*[@id='confirmChangesAlert']/div[2]/a[2]", "xpath"),
	MENU("//*[@id='menuContainer']/div", "xpath"),
	CANCELLATION_MATRIX("//*[@id='menuContainer']/ul/li/a", "xpath"),
	SALVAGEINDICATOR("//*[@id='cancellationGrid']/div[2]/div/div/div[2]/span", "xpath"),
	CANCELLATIONMATRIX_BACKBTN("//*[@id='backButton']", "xpath"),
	CANCELLATIONMATRIX_ADDLINEBTN("//*[@id='addLine']", "xpath"),
	CANCELLATIONMATRIX_APPLYCHANGESBTN("//*[@id='cancellationGridSection']/div/div[4]//..//*[contains(text(), 'Apply Changes')]", "xpath"),
	CANCELTIME("//*[@id='cancellationGrid']/div[2]/div/div/div[1]/span", "xpath"),
	CANCELTIME_FIRSTROW("//*[@id='cancellationGrid']/div[6]/div/div/div/div[1]/input", "xpath"),
	SALVAGEINDICATOR_CLICK("//*[@id='cancellationGrid']/div[6]/div/div/div/div[2]", "xpath"),
	SALVAGEINDICATOR_INPUT("//*[@id='cancellationGrid']/div[6]/div/div/div/div[2]/input", "xpath"),
	MONDAY_CLICK("//*[@id='cancellationGrid']/div[6]/div/div/div/div[3]", "xpath"),
	MONDAY_INPUT("//*[@id='cancellationGrid']/div[6]/div/div/div/div[3]/input", "xpath"),
	COPYICON_FIRSTROW("//*[@id='cancellationGrid']/div[6]/div/div/div/div[11]/span/a", "xpath"),
	SALVAGEINDICATOR_SECCONDROW_CLICK("//*[@id='cancellationGrid']/div[6]/div/div/div[2]/div[2]", "xpath"),
	MONDAY_SECONDROW_CLICK("//*[@id='cancellationGrid']/div[6]/div/div/div[2]/div[3]", "xpath"),
	REMOVEICON_FIRSTROW("//*[@id='cancellationGrid']/div[6]/div/div/div/div[12]/span/a", "xpath"),
	REMOVEICON_CONTINUEBTN("//*[@id='loadingModal']/div[2]/a[2]", "xpath"),
	ADDSUBCUSTOMER_BTN("//*[@id='customersWrapper']/div/div/div[2]/a", "xpath"),
	ASC_HOME_BTN("//*[@id='nav']/li[1]/a/div", "xpath"),
	ASC_CUSTNUMBER("//*[@id='Number']", "xpath"),
	ASC_CUSTNAME("//*[@id='Name']", "xpath"),
	ASC_SHIPTO("//*[@id='ShipTo']", "xpath"),
	ASC_BILLTO("//*[@id='BillTo']", "xpath"),
	ASC_PAYER("//*[@id='Payer']", "xpath"),
	ASC_LANGUAGECODE("//*[@id='LanguageCode']", "xpath"),
	ASC_ADDRESS("//*[@id='Address1']", "xpath"),
	ASC_APPLYCHANGES("//*[@id='formBody']/div[7]/a", "xpath"),
	ASC_CITY("//*[@id='City']", "xpath"),
	ASC_STATEPROVINCE("//*[@id='StateOrProvince']", "xpath"),
	ASC_CONTRACTFROM("//*[@id='ContractStartDate']", "xpath"),
	ASC_CONTRACTTO("//*[@id='ContractEndDate']", "xpath"),
	TAXREGDID1("//*[@id='TaxRegId1']", "xpath"),
	TAXREGDID2("//*[@id='TaxRegId2']", "xpath"),
	TAXREGDID3("//*[@id='TaxRegId3']", "xpath"),
	ASC_CURRENCYCODE("//*[@id='formBody']/div/div[2]/div[7]/span[2]/span//*[@id='PaymentTerms']", "xpath"),
	ASC_PAYMENTTERM("//*[@id='formBody']/div/div[2]/div[8]/span[2]/span//*[@id='PaymentTerms']", "xpath"),
	ASC_PAYMENTDAYS("//*[@id='PaymentDays']", "xpath"),
	ASC_ADDITIONALINFORMATION("//*[@id='AdditionalInformation']", "xpath"),
	SUBCUST_NUMBER("//*[@id='subCustomerForm']/div[4]/div/div[2]/div/div/div[1]/span", "xpath"),
	SUBCAST_NAME("//*[@id='subCustomerForm']/div[4]/div/div[2]/div/div/div[2]/span", "xpath"),
	CONTACTS_ICON("//*[@id='nav']/li[2]/a/div", "xpath"),
	ADD_CONTACT("//*[@id='subCustomerContact']/div/a", "xpath"),
	ADDCONTACT_POPUPTITLE("//*[@id='addsubContact_wnd_title']", "xpath"),
	ADDCONTACT_POPUP_CANCELBTN("//*[@id='contactCreateForm']/div[6]/a[1]", "xpath"),
	ADDCONTACT_POPUP_CONTINUEBTN("//*[@id='contactCreateForm']/div[6]/a[2]", "xpath"),
	ACP_CONTACTNAME("//*[@id='ContactName']", "xpath"),
	ACP_TELEPHONE("//*[@id='PhoneNumber']", "xpath"),
	ACP_FAXNUMBER("//*[@id='FaxNumber']", "xpath"),
	ACP_EMAIL("//*[@id='EmailAddress']", "xpath"),
	ACP_EXT("//*[@id='PhoneExt']", "xpath"),
	ACP_EDITCONTACT("//*[@id='editContact']", "xpath"),
	ACP_REMOVECONTACT_ICON("//*[@id='contactsContainer']/div/div[2]/div[3]//div/div/a//..//*[contains(text(), 'X')]", "xpath"),
	ACP_REMOVE_ALERTTEXT("//*[@id='removeAlert']/div[1]", "xpath"),
	ACP_REMOVEICON_CONTINUEBTN("//*[@id='removeAlert']/div[3]/a[1]", "xpath"),
	ACP_REMOVEICON_CANCELBTN("//*[@id='removeAlert']/div[3]/a[2]", "xpath"),
	ACP_SECOND_CONTACT("//*[@id='contactWrapper']/div[2]/div[3]/div/div[2]/span[2]", "xpath"),
	CUSTOMER_CLASS("//*[@id='nav']/li[3]/a", "xpath"),
	CC_DEAFULTCLASSDESC("//*[@id='custClassGrid']/tbody[1]/tr/th[2]", "xpath"),
	CC_CUSTOMERCLASSDESC("//*[@id='custClassGrid']/tbody[1]/tr/th[3]", "xpath"),
	CC_APPLYCHANGESBTN("//*[@id='custClassContainer']/div/div/div[3]/a", "xpath"),
	CC_CUSTCLASSDESC_TEXT("//*[@class='content-wrapper main-content clear-fix']/div/div[2]/div[5]/div/div/div[2]/table/tbody[2]/tr[1]/td[3]/input", "xpath"),
	SEGMENTS("//*[@id='nav']/li[4]/a", "xpath"),
	SEGMENT_A("//*[@id='segLeftDiv_0']/td[2]/input", "xpath"),
	SEGMENT_Z("//*[@id='segRightDiv_12']/td[2]/input", "xpath"),
	SEGMENT_APPLYCHANGESBTN("//*[@id='subSegments']/div/div[6]/a", "xpath"),
	SEALTYPES("//*[@id='nav']/li[5]/a", "xpath"),
	SEALTYPEOUTBOUND("//*[@id='ReturnSealTypeOutbound']", "xpath"),
	SEALTYPEONBOARD("//*[@id='ReturnSealTypeOnboard']", "xpath"),
	SEALTYPEINBOUND("//*[@id='ReturnSealTypeInbound']", "xpath"),
	SEALTYPESECURITY("//*[@id='ReturnSealTypeSecurity']", "xpath"),
	DISPATCH_SEALTYPEOUTBOUND("//*[@id='DispatchSealTypeOutbound']", "xpath"),
	DISPATCH_SEALTYPEONBOARD("//*[@id='DispatchSealTypeOnboard']", "xpath"),
	DISPATCH_SEALTYPEINBOUND("//*[@id='DispatchSealTypeInbound']", "xpath"),
	DISPATCH_SEALTYPESECURITY("//*[@id='DispatchSealTypeSecurity']", "xpath"),
	SEALTYPES_APPLYCHANGESBTN("//*[@id='sealTypesWrapper']/div/div[12]/a", "xpath"),
	INVOICEDISCOUNTFLAG("//*[@id='formBody']/div[1]/div[2]/div[10]/span[2]/a", "xpath"),
	ADDDISCOUNT("//*[@id='addLine']", "xpath"),
	INVOICEDISCOUNT_BACKBTN("//*[@id='backButton']", "xpath"),
	ADDDISCOUNT_UNIT("//*[@id='Unit']", "xpath"),
	ADDDISCOUNT_EFFECTIVEDATE("//*[@id='EffectiveDate']", "xpath"),
	ADDDISCOUNT_AMOUNT("//*[@id='Amount']", "xpath"),
	ADDDISCOUNT_CONTINUEBTN("//*[@id='addLinePopup']/div[4]/a[2]", "xpath"),
	ADDDISCOUNT_FIRSTROW("//*[@id='discountGrid']/div[6]/div/div/div/div[1]", "xpath"),
	SUBCUSTOMER_COPYICON("//*[@id='copySubCustomer']/div/a", "xpath"),
	COPYPOPUP_TEXT("//*[@id='loadingModal']/div[1]/div", "xpath"),
	COPYPUPUP_CANCELBTN("//*[@id='loadingModal']/div[2]/a[1]", "xpath"),
	COPYPOPUP_CONTINUEBTN("//*[@id='loadingModal']/div[2]/a[2]", "xpath"),
	SEARCH_DD("//*[@id='searchContainer']/div[1]/span[3]/a/img", "xpath"),
	SEARCH_CUSTCODE_CHK("//*[@id='searchContainer']/div[2]/div[1]/label[1]/span", "xpath"),
	SEARCH_SECONDARYNAME_CHK("//*[@id='searchContainer']/div[2]/div[2]/label[1]/span", "xpath"),
	SEARCH_CUSTNAME_CHK("//*[@id='searchContainer']/div[2]/div[1]/label[2]/span", "xpath"),
	SEARCH_CUSTNO_CHK("//*[@id='searchContainer']/div[2]/div[2]/label[2]/span", "xpath"),
	SEARCH_SUBCUSTNAME_CHK("//*[@id='searchContainer']/div[2]/div[1]/label[3]/span", "xpath"),
	SEARCH_SAPNUMBER_CHK("//*[@id='searchContainer']/div[2]/div[2]/label[3]/span", "xpath"),
	SEARCH_CUSTNAME_FIFTHROW("//*[@id='custSearchGrid']/table/tbody/tr[5]/td[1]", "xpath"),
	SEARCH_FIRSTROW("//*[@id='custSearchGrid']/table/tbody/tr[1]/td[1]", "xpath"),
	
	;
	public String element,Identifier;
	private InvoiceCustomerEnum(String element){
		 this.element = element;
	 }
	private InvoiceCustomerEnum(String element, String Identifier){
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
