Feature: Validating the search hotel option
@mandatory
    Scenario Outline: Positive Login and Fillup Mandadatory Only 
	Given User login in the url on chrome browser
    When User Enters the username and password
    And User Click the Login Button
			And User Enters the Following Credentials as "<Location>" and "<Room_Type>"and "<Number_Of_Rooms>"and "<Check_In_Date>" and "<Check_Out_Date>" and "<Adults_per_Room>" 
			Then User Click the Search Button 
			Then Check for hotel is Available or Not 
			Examples: 
				|Location |Room_Type|Number_Of_Rooms   |Check_In_Date|Check_Out_Date|Adults_per_Room|Children_per_Room|
				#|Sydney   |Standard |2 - Two           |12/05/2022   |13/05/2022    |2 - Two        |0 - None         |
				