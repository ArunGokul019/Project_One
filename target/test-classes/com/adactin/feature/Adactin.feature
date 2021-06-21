Feature: Hotel Booking In Adactin Application
@SmokeTest
Scenario Outline: Adactin
Given user Launch The Application
When user Enter The "<Username>" In Username Field
And user Enter The "<Password>" In Password Field
Then user Click On The Login Button And It Navigate To Search Hotel Page

Examples:

		|Username|Password|
		|Arun|123|
		|Gokul|546|
		|ArunGokul|Jun@062021|

@SanityTest
Scenario: Search Hotel
When user Select The Location In The Location Dropdown
And user Select The Hotel In The Hotels Dropdown
And user Select The Room Type In The Room Type Dropdown
And user Select The Number Of Rooms In The Number Of Rooms Dropdown
And user Enter The Check In Date In The Check In Date Field
And user Enter The Check Out Date In The Check Out Date Field
And user Select The Adults Per Room In The Adults Per Room Dropdown
And user Select The Children Per Room In The Children Per Room Dropdown
Then user Click On Search and Navigate To Select Hotel Page

@SanityTest
Scenario: Select Hotel
When user Click On Select Radio Button
Then user Click On Continue Button And Navigate To Book Hotel Page

@SanityTest
Scenario: Book a Hotel
When user Enter FirstName In FirstName Field
And user Enter LastName In LastName Field
And user Enter Address In Billing Address Field
And user Enter Card Number In Credit Card Field
And User Select Card Type In Credit Card Type Field
And user Select Month In Expiry Month Dropdown
And user Select Year In Expiry Year Dropdown
And user Enter Cvv In Cvv Number Field
Then user Click Booknow Button and Navigate To Booking Confirmation Page

@RegressionTest
Scenario:
Then user Click On MyItinerary And Navigate To Booked Itinerary Page

@RegressionTest
Scenario:
Then user Click On Logout



