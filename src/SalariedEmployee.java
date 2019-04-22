class SalariedEmployee extends Employee{
  // TODO fix class declaration and declare variables here
  double fixedMonthlyPayment;
  String socialSecurityNumber;


  public SalariedEmployee(String employeeId, String name, String socialSecurityNumber) {
    super(employeeId, name);
    this.socialSecurityNumber = socialSecurityNumber;
    // TODO fill in code here
  }

  public String getSocialSecurityNumber() {
    // TODO fill in code here and replace the return statement - done
    return socialSecurityNumber;
  }

  public void setSocialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
    // TODO fill in code here - done
  }

  public double getFixedMonthlyPayment() {
    // TODO fill in code here and replace the return statement - done
    return fixedMonthlyPayment;
  }

  public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
    this.fixedMonthlyPayment = fixedMonthlyPayment;
    // TODO fill in code here - done
  }

  @Override
  public double calculatePay() {
    return fixedMonthlyPayment;
  }


  // TODO fill in code here - fixed paid workers should be described
  //  describe socialSecurityNumber
}
