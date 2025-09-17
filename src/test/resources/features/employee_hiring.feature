Feature:
  As a user HRM Orange application
  I want to register a new employee
  To verify the hiring process

  @Scenario1
  Scenario Outline: Verify the new employee's data and status
    Given the user login with the username "Admin" and the password "admin123"
    When realize the hiring process for a new employee
      | firstName   | middleName   | lastName   | vacancy   | email   | resume   | interviewTitle   | interviewer   | date   |
      | <firstName> | <middleName> | <lastName> | <vacancy> | <email> | <resume> | <interviewTitle> | <interviewer> | <date> |
    Then check the user data <vacancy>,<firstName>,<date> and <status>
    Examples:
      | firstName | middleName | lastName | vacancy               | email               | resume                                   | interviewTitle | interviewer    | date       | status |
      | Aleja     | Ruiz       | Ama      | Payroll Administrator | ejemplo@ejemplo.com | src/test/resources/files/RetoTecnico.pdf | Alejandra      | Ranga  Akunuri | 2025-12-12 | Hired |