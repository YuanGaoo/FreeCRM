Feature: Deal data Map creation 

@temp 
Scenario: Free CRM create a new deal scenario 

	Given user is already on Login Page 
	When title of login page is FREE CRM 
	Then user enters username username and password password 
		| username| password |
		| naveenk | test@123 |
	Then user clicks on login button 
	Then user is on home page 
	Then user moves to new deals page 
	Then user enters deal details 
		| title 	| amount | probablity | commission |
		| test deal | 1000 	 | 	50 		  |    10	   |
		| test deal2| 2000   |  60        |    20      |
		| test deal3| 3000   |  70        |    30      |
		
	Then close the browser 