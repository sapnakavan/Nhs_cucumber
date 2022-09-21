Feature: Nhs Website
  As a User I want to know what help I can get with my NHS (UK national health system) costs
  as a person from Wales

  Scenario:  Check as a user from Wales what help I could get to pay for NHS costs
    Given User is on Home Page
    When user clicks start button
    And user selects country live in as Wales
    And user clicks next button
    And user selects GP practice location in scotland or Wales as Yes
    And user clicks next button
    And user select country of dental practice as Wales
    And user clicks next button
    And user enters date of birth "4","6","1985"
    And user clicks next button
    And user select  partnership status as Yes
    And user clicks next button
    And user select tax claim status as No
    And user clicks next button
    And user select Maternity details as No
    And user clicks next button
    And user select war pensioner and injury details status as No
    And user clicks next button
    And user select diabetes status as No
    And user clicks next button
    And user select glaucoma status as No
    And user clicks next button
    And user select care home details as No
    And user clicks next button
    And user select financial details as No
    And user clicks next button
    Then user should get a result that "You get help with NHS costs"


  Scenario: verify if you are under16
    Given User is on Home Page
    When user clicks start button
    And user selects country live in as Wales
    And user clicks next button
    And user selects GP practice location in scotland or Wales as Yes
    And user clicks next button
    And user select country of dental practice as Wales
    And user clicks next button
    And user enters date of birth "5","5","2015"
    And user clicks next button
    Then user should get based on the age result that "Because you're under 16:"
    #And NHS Cost Checker responds show NHS Cost Available
     # | NHS prescriptions                                      |
      #| NHS dental check-ups and treatment                     |
      #| sight tests                                            |
      #| NHS wigs and fabric supports                           |
      #| £4.25 each week of your pregnancy from the 10th week   |
      #| £8.50 each week for children from birth to 1 year old  |
      #| £4.25 each week for children between 1 and 4 years old |
      #| travel for NHS treatment                               |
