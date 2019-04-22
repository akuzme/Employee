class ContractedEmployee extends Employee {
    String federalTaxId;
    double hourlyRate;
    double numberOfHoursWorked;
    // TODO fix class declaration and declare variables here


    public ContractedEmployee(String employeeId, String name, String federalTaxId) {
        super(employeeId, name);
        this.federalTaxId = federalTaxId;
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

    @Override
    public double calculatePay() {
        return numberOfHoursWorked * hourlyRate;
    }

    // TODO fill in code here - hourly paid workers should be described
    //  federalTaxId
}
