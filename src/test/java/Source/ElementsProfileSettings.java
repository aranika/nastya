package Source;

public class ElementsProfileSettings {
	
	public static String[][] ArrayElProfEdit() {
		String[][]Elements= {{"a[class='navbar-brand']","RMT"},//0
				{"ul[class='nav navbar-nav']>li>a","Отпуска"},//1
				{"a[data-i18n='navbar.orgChart']","Диаграмма"},//2
				{"ul[class='nav navbar-nav']>li>a[data-i18n='navbar.orgChart']","Отчеты"},
				{"a[class='dropdown-toggle']", "язык"},//
				{"span[class*='glyphicon glyphicon-user']", "авка"},
				{"a[class='dropdown-toggle']>span[class='ng-binding']","имя"},
				{"a>b","выпадающее"},//7
				{"a[ng-click='profileURL()']","Профиль"},//
				{"a[ng-click=\"logout()\"]","Выйти"},
				{"span[data-i18n='profile.settings']","Настройки"},//
				{"span[class='glyphicon glyphicon-circle-arrow-left']","Back"},//11
				{"div[class='thumbnail']>img","фото"},
				{"span[class='btn btn-primary']>input[type='file']","смена фото"},//
				{"[data-i18n='profile.accountInfo']","Информация профиля"},
				{"[data-i18n='profile.field.firstName']","имя"},//15
				{"[data-i18n='profile.field.middleName']","Отчество"},//16
				{"[data-i18n='profile.field.lastName']","Фамилия"},//17
				{"[data-i18n='profile.field.birth']","Дата Рождения"},//18
				{"form>table>tbody:nth-child(2)>tr:nth-child(5) td:nth-child(1)","Password"},
				{"[valign='middle'] [class='form-control']","input password"},//20
				{"tr [class='form-control']","input name"},//21
				{"form>table:nth-of-type(1)>tbody:nth-of-type(1) tr:nth-of-type(2) input[class='form-control']","input отчество"},//22
				{"form>table:nth-of-type(1)>tbody:nth-of-type(1) tr:nth-of-type(3) input[class='form-control']","input фамилия"},//23
				{"input[id='reqStartDate']","календарь"},
				{"[class='input-group-addon']","значок календаря"},
				{"[data-target='#changePasswordModal']","change Password"},		
				{"th[data-i18n='profile.contactInfo']","конкт инф"},
				{"td[data-i18n='profile.field.email']","email"},
				{"form>table:nth-of-type(2)>tbody:nth-of-type(1) tr:nth-of-type(1) input[class='form-control']","знач email"},//29
				{"td[data-i18n='profile.field.phone']","Телефон"},
				{"form>table:nth-of-type(2)>tbody:nth-of-type(1) tr:nth-of-type(2) input[class='form-control']","Телефон знач"},//31
				{"td[data-i18n='profile.field.skype']","Skype"},//32
				{"form>table:nth-of-type(2)>tbody:nth-of-type(1) tr:nth-of-type(3) input[class='form-control']","Skype знач"},//33
				{"div[class='col-md-3']:nth-child(1)>ul[class='list-unstyled']:nth-child(1)>li:nth-child(1)","Company"},
				{"div[class='col-md-3']:nth-child(1)>ul[class='list-unstyled']:nth-child(1)>li:nth-child(3)","About us"},
				{"div[class='col-md-3']:nth-child(1)>ul[class='list-unstyled']:nth-child(1)>li:nth-child(4)","Contact & support"},
				{"div[class='col-md-3']:nth-child(2)>ul[class='list-unstyled']:nth-child(1)>li:nth-child(1)","Applications"},
				{"div[class='col-md-3']:nth-child(2)>ul[class='list-unstyled']:nth-child(1)>li:nth-child(3)","Product for Mac"},
				{"div[class='col-md-3']:nth-child(2)>ul[class='list-unstyled']:nth-child(1)>li:nth-child(4)","Product for Windows"},
				{"div[class='col-md-3']:nth-child(2)>ul[class='list-unstyled']:nth-child(1)>li:nth-child(5)","Product for Eclipse"},
				{"div[class='col-md-3']:nth-child(2)>ul[class='list-unstyled']:nth-child(1)>li:nth-child(6)","Product mobile apps"},
				{"div[class='col-md-3']:nth-child(3)>ul[class='list-unstyled']>li:nth-child(1)","Services"},
				{"div[class='col-md-3']:nth-child(3)>ul[class='list-unstyled']>li:nth-child(3)","Vacation"},
				{"div[class='col-md-3']:nth-child(3)>ul[class='list-unstyled']>li:nth-child(4)","Org Chart"},
				{"div[class='col-md-3']:nth-child(3)>ul[class='list-unstyled']>li:nth-child(5)","Reports"},
				{"div[class='col-md-3']:nth-child(4)>ul[class='list-unstyled']>li:nth-child(1)","Documentation"},
				{"div[class='col-md-3']:nth-child(4)>ul[class='list-unstyled']>li:nth-child(3)","Product Help"},
				{"div[class='col-md-3']:nth-child(4)>ul[class='list-unstyled']>li:nth-child(4)","Developer API"},
				{"div[class='col-md-3']:nth-child(4)>ul[class='list-unstyled']>li:nth-child(5)","Product Pages"},
				{"p[class='muted pull-right']","© 2014 Senla. All rights reserved"}
		};
		return Elements;
	}
}