Feature: FreeCRM create contacts 


Scenario Outline: Free CRM create a new contact scenario 
	 
	Given user is already on Login Page 
	When title of login page is FREE CRM 
	Then user enters username "<username>" and password"<password>" 
	Then user clicks on login button 
	Then user is on home page 
	Then user moves to new contact page 
	Then user enters firstname"<firstname>" and lastname"<lastname>" and position"<position>" 
	Then close the browser 
	
	Examples: 
		| username | password | firstname | lastname | position |
		| naveenk  | test@123 | Tom 	  |Peter 	 | Manager  |
		| naveenk  | test@123 | David     | Dsouza   | Director |
		
		
		
		
		
		
	