Feature:
  Scenario: CTHMS Login with valid credentials
    Given a CTHMS user is on the Login Page "https://mexil.it/chroma_tech_academy/hospital/site/login"
    When user enters username "admin@chroma.com" in username text box
    And enters password "123456" in password text box
    Then clicks on Sign In button