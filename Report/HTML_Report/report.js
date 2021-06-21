$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Adactin",
  "description": "",
  "id": "hotel-booking-in-adactin-application;adactin",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"\u003cUsername\u003e\" In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"\u003cPassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On The Login Button And It Navigate To Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;adactin;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 11,
      "id": "hotel-booking-in-adactin-application;adactin;;1"
    },
    {
      "cells": [
        "Arun",
        "123"
      ],
      "line": 12,
      "id": "hotel-booking-in-adactin-application;adactin;;2"
    },
    {
      "cells": [
        "Gokul",
        "546"
      ],
      "line": 13,
      "id": "hotel-booking-in-adactin-application;adactin;;3"
    },
    {
      "cells": [
        "ArunGokul",
        "Jun@062021"
      ],
      "line": 14,
      "id": "hotel-booking-in-adactin-application;adactin;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Adactin",
  "description": "",
  "id": "hotel-booking-in-adactin-application;adactin;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"Arun\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"123\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On The Login Button And It Navigate To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 5176161700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Arun",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 113217600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 78621300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigate_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 500356600,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Adactin",
  "description": "",
  "id": "hotel-booking-in-adactin-application;adactin;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"Gokul\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"546\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On The Login Button And It Navigate To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 399252000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Gokul",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 202381200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "546",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 125823200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigate_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 453461800,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Adactin",
  "description": "",
  "id": "hotel-booking-in-adactin-application;adactin;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"ArunGokul\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"Jun@062021\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On The Login Button And It Navigate To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 358811500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ArunGokul",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 111465300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jun@062021",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 69866400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigate_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1042020700,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Search Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;search-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "user Select The Location In The Location Dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user Select The Hotel In The Hotels Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Select The Room Type In The Room Type Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Select The Number Of Rooms In The Number Of Rooms Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Enter The Check In Date In The Check In Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Enter The Check Out Date In The Check Out Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Select The Adults Per Room In The Adults Per Room Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user Select The Children Per Room In The Children Per Room Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user Click On Search and Navigate To Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Location_In_The_Location_Dropdown()"
});
formatter.result({
  "duration": 158015200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Hotel_In_The_Hotels_Dropdown()"
});
formatter.result({
  "duration": 334039000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Room_Type_In_The_Room_Type_Dropdown()"
});
formatter.result({
  "duration": 293765300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Number_Of_Rooms_In_The_Number_Of_Rooms_Dropdown()"
});
formatter.result({
  "duration": 180052600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Check_In_Date_In_The_Check_In_Date_Field()"
});
formatter.result({
  "duration": 67319500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Check_Out_Date_In_The_Check_Out_Date_Field()"
});
formatter.result({
  "duration": 63827800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Adults_Per_Room_In_The_Adults_Per_Room_Dropdown()"
});
formatter.result({
  "duration": 175110000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Children_Per_Room_In_The_Children_Per_Room_Dropdown()"
});
formatter.result({
  "duration": 156578300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_Search_and_Navigate_To_Select_Hotel_Page()"
});
formatter.result({
  "duration": 918479900,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Select Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;select-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "user Click On Select Radio Button",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "user Click On Continue Button And Navigate To Book Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Click_On_Select_Radio_Button()"
});
formatter.result({
  "duration": 118470000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_Continue_Button_And_Navigate_To_Book_Hotel_Page()"
});
formatter.result({
  "duration": 833233400,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "Book a Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;book-a-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 33,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "user Enter FirstName In FirstName Field",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "user Enter LastName In LastName Field",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Enter Address In Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user Enter Card Number In Credit Card Field",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "User Select Card Type In Credit Card Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user Select Month In Expiry Month Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user Select Year In Expiry Year Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user Enter Cvv In Cvv Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user Click Booknow Button and Navigate To Booking Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Enter_FirstName_In_FirstName_Field()"
});
formatter.result({
  "duration": 86433300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_LastName_In_LastName_Field()"
});
formatter.result({
  "duration": 71232000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_Address_In_Billing_Address_Field()"
});
formatter.result({
  "duration": 85579800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_Card_Number_In_Credit_Card_Field()"
});
formatter.result({
  "duration": 147346500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_Card_Type_In_Credit_Card_Type_Field()"
});
formatter.result({
  "duration": 332904600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_Month_In_Expiry_Month_Dropdown()"
});
formatter.result({
  "duration": 306421200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_Year_In_Expiry_Year_Dropdown()"
});
formatter.result({
  "duration": 298825700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_Cvv_In_Cvv_Number_Field()"
});
formatter.result({
  "duration": 212632800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_Booknow_Button_and_Navigate_To_Booking_Confirmation_Page()"
});
formatter.result({
  "duration": 199447500,
  "status": "passed"
});
});