package com.sacs.PageOjects;

public enum PurchaseCustomerPriceAgreementEnum {
	
	PURCHASE("purchase","id"),
	CUSTOMER_PRICE_AGREEMENT_LINK(".//*[@id='customerpriceagreement']/a", "xpath"),
	CUSTOMER_PRICE_AGREEMENT_TITLE(".//*[@id='contentHeader']/div[1]/h1", "xpath"),
	SEARCH_FIELD(".//*[@id='articlesearch']", "xpath"),
	SEARCH_SUBMIT("searchSubmit", "className"),
	ADD_AGREEMENT_BTN(".//*[@id='contentHeader']/div[2]/a", "xpath"),
	SEARCH_RESULT_FIRSTCOLUMN_AFTER_SEARCH_ADDAGREEMENT("//*[@id='customerSearchGrid']/table/tbody/tr[1]/td[1]","xpath"),
	SEARCH_RESULT_FIRSTCOLUMN_AFTER_SEARCH("//*[@id='results']/table/tbody/tr[1]/td[1]/div","xpath"),
	SEARCH_RESULT_FIRSTCOLUMN_AFTER_SEARCH2("//*[@id='results']/table/tbody/tr[1]/td[1]","xpath"),
	SEARCH_RESULT_FIRSTCOLUMN_AFTER_SEARCH1("//*[@id='customerSearchGrid']/table/tbody/tr/td[1]","xpath"),
	ADD_NEW_PRICE_AGREEMENT_DROPDOWN(".//*[@id='ReadArticles']", "xpath"),
	SEARCH_RESULT_FIRSTCOLUMN_AFTER_SEARCH_ON_ADD_AGREEMENT("//*[@id='customerSearchGrid']/table/tbody/tr/td[1]","xpath"),
	START_DATE("//*[@id='StartDate']","xpath"),
	END_DATE("//*[@id='EndDate']","xpath"),
	OK_BTN("//*[@id='btn-ok']","xpath"),
	AGREEMENT_CODE("//*[@id='vendorPAWrapper']/div[5]/div[2]/span[2]","xpath"),
	ADD_ARTICLE("//*[@id='toolsContainer']/div[2]/a","xpath"),
	ARTICLE_CHECK_BOX("//*[@id='addArticles']/table/tbody/tr[1]/td[1]/div/label/span","xpath"),
	ARTICLE_CHECK_BOX1("//*[@id='addArticles']/table/tbody/tr[2]/td[1]/div/label/span","xpath"),
	ARTICLE_CHECK_BOX2("//*[@id='addArticles']/table/tbody/tr[3]/td[1]/div/label/span","xpath"),
	//ADD_SELECTED("//*[@id='gridWrapper']/div[3]/div[2]/a","xpath"),
	ADD_SELECTED("//*[@id='addArticlesWrapper']/div[1]/div[2]/a","xpath"),
	APPLY_CHANGES_ICON("//*[@id='nav']/li[3]/a/div","xpath"),
	TOAST_MESSAGE("toast-message","className"),
	DATE_XPATH_PART1(".//*[@id='results']/table/tbody/tr[","xpath"),
	DATE_XPATH_PART2("]/td[5]","xpath"),
	SELECTCUSTTEXT("//*[@id='searchContainer']/label", "xpath"),
	BACKTOSEARCH("Back to Search", "linkText"),
	EXISTINGAGREEMENTTEXT("//*[@id='searchContainer']/label", "xpath"),
	SEARCHDD("//*[@id='searchContainer']/div[2]/span[3]/a/img", "xpath"),
	AGREESEARCHDD("//*[@id='searchContainer']/div[1]/span[3]/a/img","xpath"),
	SEARCHCUSTCODECHK("//*[@id='searchContainer']/div[3]/div[1]/label[1]/span", "xpath"),
	SEARCHCUSTNAMECHK("//*[@id='searchContainer']/div[3]/div[2]/label/span", "xpath"),
	SEARCHAGREECODECHK("//*[@id='searchContainer']/div[3]/div[1]/label[2]/span", "xpath"),
	CODEFIRSTROW("//*[@id='results']/table/tbody/tr[1]/td[2]", "xpath"),
	CUSTFIRSTROW("//*[@id='results']/table/tbody/tr[1]/td[1]", "xpath"),
	AGREEFIRSTROW("//*[@id='results']/table/tbody/tr[1]/td[3]", "xpath"),
	SEARCHICON("//*[@id='searchContainer']/div[2]/span[2]/a/img", "xpath"),
	AGREEMENTDETAILSTXT("//*[@id='cpaheaderContainer']/div[1]", "xpath"),
	MENUICON("//*[@id='results']/table/tbody/tr[1]/td[6]/a", "xpath"),
	EDITAGREEMENTICON("//*[@id='results']/table/tbody/tr[1]/td[6]/div/div[2]/a", "xpath"),
	AGREECUSTCODECHK("//*[@id='searchContainer']/div[2]/div[1]/label/span", "xpath"),
	AGREECUSTNAME("//*[@id='searchContainer']/div[2]/div[2]/label/span", "xpath"),
	AGREECUSTCODETXT("//*[@id='customerSearchGrid']/table/tbody/tr/td[2]", "xpath"),
	AGREESEARCHICON("//*[@id='searchContainer']/div[1]/span[2]/a/img", "xpath"),
	CHANGECUSTOMER("//*[@id='cpaheaderContainer']/div[2]/a", "xpath"),
	VALIDPERIODTXT("//*[@id='vendorPAWrapper']/div[5]/div[1]/span[1]", "xpath"),
	AGREEMENTCODETXT("//*[@id='vendorPAWrapper']/div[5]/div[2]/span[1]", "xpath"),
	AGREECODE("//*[@id='vendorPAWrapper']/div[5]/div[2]/span[2]", "xpath"),
	VALIDPERIOD("//*[@id='vendorPAWrapper']/div[5]/div[1]/span[2]", "xpath"),
	ADDAGREEMENTDD("//*[@id='ReadArticles']", "xpath"),
	ADDARTICLE("//*[@id='toolsContainer']/div[2]/a", "xpath"),
	SELECTFIRSTARTICLECHK("//*[@id='addArticles']/table/tbody/tr[1]/td[1]/div/label/span", "xpath"),
	APPLYCHANGES("applyChanges", "id"),
	ADDSELECTED("//*[@id='addArticlesWrapper']/div[1]/div[2]/a", "xpath"),
	RESTART("//*[@id='btn-restart']", "xpath"),
	RESTARTPOPUPTXT("//*[@id='removeAlert']/div[1]", "xpath"),
	RESTARTPOPUPCANCEL("//*[@id='removeAlert']/div[3]/a[2]", "xpath"),
	RESTARTPOPUPCONTINUE("//*[@id='removeAlert']/div[3]/a[1]", "xpath"),
	SELECTDD("//*[contains(text(),'Start with empty list')]", "xpath"),
	ARTICLETABLE("//*[@id='addArticlesWrapper']", "xpath"),
	ADDARTICLECANCELBTN("//*[@id='addArticlesWrapper']/div[1]/div[3]/a", "xpath"),
	STANDARDPRICE("//*[@id='resultscpa']/div[6]/div/div/div/div[6]", "xpath"),
	STARTDATE("//*[@id='resultscpa']/div[6]/div/div/div/div[9]", "xpath"),
	ENDDATE("//*[@id='resultscpa']/div[6]/div/div/div/div[10]", "xpath"),
	REMOVEFIRSTROW("//*[@id='resultscpa']/div[6]/div/div/div/div[2]/span/a", "xpath"),
	FIRSTROWDESC("//*[@id='resultscpa']/div[6]/div/div/div/div[4]", "xpath"),
	MULROWDESC("//*[@id='resultscpa']/div[6]/div/div/div/div[4]", "xpath"),
	SELECTALLARTICLE("//*[@id='addArticles']/table/thead/tr/th[1]/div/label/span", "xpath"),
	REMOVEALLARTICLE(".//div[@id='resultscpa']//div[@class='checkBoxStyle']/label", "xpath"),
	REMOVESELECTED("//*[@id='toolsContainer']/div[1]/a", "xpath"),
	ARTNUMBERFIRSTROW("//*[@id='resultscpa']/div[6]/div/div/div/div[3]/span[1]", "xpath"),
	ARTICLEINFOICON("//*[@id='resultscpa']/div[6]/div/div/div/div[3]/span[2]/a", "xpath"),
	ARTINFOTITLE("//*[@id='inventoryRegInfo_wnd_title']/div[1]", "xpath"),
	ARTINFOICONCLOSE("//*[@id='secondInfo']/div[3]/a", "xpath"),
	STANDARDPRICECLICK("//*[@id='resultscpa']/div[6]/div/div/div/div[6]", "xpath"),
	STANDARDPRICEINPUT("//*[@id='resultscpa']/div[6]/div/div/div/div[6]/input", "xpath"),
	WYFACTORCLICK("//*[@id='resultscpa']/div[6]/div/div/div/div[7]", "xpath"),
	WYFACTORINPUT("//*[@id='resultscpa']/div[6]/div/div/div/div[7]/input", "xpath"),
	INFLATIONRATECLICK("//*[@id='resultscpa']/div[6]/div/div/div/div[8]", "xpath"),
	INFLATIONRATEINPUT("//*[@id='resultscpa']/div[6]/div/div/div/div[8]/input", "xpath"),
	MENU("//*[@id='nav']/li[1]/div", "xpath"),
	WYFACTOR("//*[@id='nav']/li[1]/ul/li[1]/a", "xpath"),
	WYFACTORPOPUPCANCEL("//*[@id='setWYFactor']/div[3]/a[1]", "xpath"),
	WYFACTORPOPUPADDBTN("//*[@id='setWYFactor']/div[3]/a[2]", "xpath"),
	WYFACTORTITLE("//*[@id='setWYFactor_wnd_title']", "xpath"),
	WYFACTORTEXTBOX("//*[@id='wyFactor']", "xpath"),
	SETINFLATIONVALUES("//*[@id='nav']/li[1]/ul/li[2]/a", "xpath"),
	SETINFLATIONTITLE("//*[@id='setInflationRate_wnd_title']", "xpath"),
	SETINFLATIONCANCEL("//*[@id='setInflationRate']/div[3]/a[1]", "xpath"),
	SETINFLATIONOK("//*[@id='setInflationRate']/div[3]/a[2]", "xpath"),
	SETINFLATIONTEXTBOX("//*[@id='inflationRate']", "xpath"),
	IMPORTWYFACTORINFLATION("//*[@id='nav']/li[1]/ul/li[3]/a", "xpath"),
	IMPORTWYFACINTITLE("//*[@id='upLoadFiles_wnd_title']", "xpath"),
	IMPORTWYICANCEL("//*[@id='upLoadFiles']/div[2]/a[1]", "xpath"),
	IMPORTWYIIMPBTN("//*[@id='upload']", "xpath"),
	CHOOSEFILEBTN("//*[@id='upLoadFiles']/div[1]/a", "xpath"),
	CHOOSEFILEINPUT("files-upload", "id"),
	STARTDATELABEL("//*[@id='cpaForm']/div[2]/div/span[1]/label", "xpath"),
	FIRSTARTICLENUM("//*[@id='resultscpa']/div[6]/div/div/div/div[3]/span[1]", "xpath"),
	SECONDARTICLENUM("//*[@id='resultscpa']/div[5]/div/div[2]/div[3]/span[1]", "xpath"),
	THIRDARTICLENUM("//*[@id='resultscpa']/div[5]/div/div[3]/div[3]/span[1]", "xpath"),
	FIRSTSP("//*[@id='resultscpa']/div[6]/div/div/div/div[6]", "xpath"),
	SECONDSP("//*[@id='resultscpa']/div[5]/div/div[2]/div[6]", "xpath"),
	THIRDSP("//*[@id='resultscpa']/div[5]/div/div[3]/div[6]", "xpath"),
	DESCFIRSTROW("//*[@id='addArticles']/table/tbody/tr[1]/td[3]", "xpath"),
	DESCTEXT("//*[@id='resultscpa']/div[6]/div/div/div[2]/div[4]", "xpath"),
	REMOVEROW("//*[@id='resultscpa']/div[6]/div/div/div[2]/div[2]/span/a", "xpath"),
	ARTDESC("//*[@id='resultscpa']/div[5]/div/div[3]/div[4]", "xpath"),
	ARTINFO("//*[@id='resultscpa']/div[5]/div/div[1]/div[3]/span[2]/a", "xpath"),
	ARTINFO2("//*[@id='resultscpa']/div[6]/div/div/div/div[3]/span[2]/a", "xpath"),
	FIRSTWYFACTOR("//*[@id='resultscpa']/div[5]/div/div[1]/div[7]", "xpath"),
	FIRSTWYFACTOR2("//*[@id='resultscpa']/div[6]/div/div/div/div[7]", "xpath"),
	SECONDWYFACTOR("//*[@id='resultscpa']/div[5]/div/div[2]/div[7]", "xpath"),
	THIRDWYFACTOR("//*[@id='resultscpa']/div[5]/div/div[3]/div[7]", "xpath"),
	FIRSTINFLATIONRATE("//*[@id='resultscpa']/div[5]/div/div[1]/div[8]", "xpath"),
	FIRSTINFLATIONRATE2("//*[@id='resultscpa']/div[6]/div/div/div/div[8]", "xpath"),
	SECONDINFLATIONRATE("//*[@id='resultscpa']/div[5]/div/div[2]/div[8]", "xpath"),
	THIRDINFLATIONRATE("//*[@id='resultscpa']/div[5]/div/div[3]/div[8]", "xpath"),
	EXISTINGAGREEMENT("//*[@id='dropdown']/h2[2]", "xpath"),
	EXISTINGAGREECODEFIRSTROW("//*[@id='agResults']/table/tbody/tr[1]/td[1]", "xpath"),
	COPYAGREEMENTICON("//*[@id='agResults']/table/tbody/tr[1]/td[4]/div[1]/a", "xpath"),
	FIRSTROWCHK("//*[@id='resultscpa']/div[5]/div/div/div[1]/label/span", "xpath"),
	ARTICLECHKROW("//*[@id='addArticles']/table/tbody/tr[9]/td[1]/label/span", "xpath"),
	REMOVEALLCHK("div.checkBoxStyle > label > span", "css"),
	CUSTFIRSTROW2("//*[@id='results']/table/tbody/tr/td[1]", "xpath"),
	ADDAGREEMENTFIRSTROW("//*[@id='customerSearchGrid']/table/thead/tr/th[1]/a", "xpath"),
	FIRST_ROW_FIRST_COL("//*[@id='results']/table/tbody/tr[1]/td[1]", "xpath"),
	NODATATODISPLAY("//*[@id='results']/table/tbody/tr/td", "xpath"),
	STD_PRICE_CLICK("//*[@id='resultscpa']/div[6]/div/div/div/div[6]", "xpath"),
	STD_PRICE_INPUT("//*[@id='resultscpa']/div[6]/div/div/div/div[6]/input", "xpath"),
	ADDAGREEMENT_SAVEICON("//*[@id='nav']/li[3]/a/div", "xpath"),
	CPA_SEARCHED_RECORD("//*[@id='results']/table/tbody/tr/td[1]/div", "xpath"),
	;
	
	
	public String element,Identifier;
	private PurchaseCustomerPriceAgreementEnum(String element){
		 this.element = element;
	 }
	private PurchaseCustomerPriceAgreementEnum(String element, String Identifier){
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