class ContractedEmployee extends Employee{
  String conrtactedEmployeName;//should be removed
  String federalTaxId;
  double hourlyRate;
  double numberOfHoursWorked;
  // TODO fix class declaration and declare variables here

  public ContractedEmployee(String employeeId, String name, String federalTaxId) {
    // TODO fill in code here
  }

  public String getFederalTaxId() {
    // TODO fill in code here and replace the return statement - done
    return federalTaxId;
  }

  public void setFederalTaxId(String federalTaxId) {
    this.federalTaxId = federalTaxId;
    // TODO fill in code here
  }

  public double getHourlyRate() {
    // TODO fill in code here and replace the return statement - done
    return hourlyRate;
  }

  public void setHourlyRate(double hourlyRate) {
    this.hourlyRate = hourlyRate;
    // TODO fill in code here - done
  }

  public double getNumberOfHoursWorked() {
    // TODO fill in code here and replace the return statement - done
    return numberOfHoursWorked;
  }

  public void setNumberOfHoursWorked(double numberOfHoursWorked) {
    this.numberOfHoursWorked = numberOfHoursWorked;
    // TODO fill in code here
  }

  public String getName() {
    return conrtactedEmployeName; //should be removed
  }

  // TODO fill in code here - hourly paid workers should be described
  //  federalTaxId
}
