package com.prokarma.apigee.apigeeproxy.domain;

public class Empoyee {

  private String firstName;
  private String lastName;
  private float salary;
  private long employeeId;
  private String designation;

  public Empoyee() {}

  public Empoyee(
      String firstName, String lastName, float salary, long employeeId, String designation) {
    super();
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary;
    this.employeeId = employeeId;
    this.designation = designation;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public float getSalary() {
    return salary;
  }

  public void setSalary(float salary) {
    this.salary = salary;
  }

  public long getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(long employeeId) {
    this.employeeId = employeeId;
  }

  public String getDesignation() {
    return designation;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  @Override
  public String toString() {
    return "Empoyee [firstName="
        + firstName
        + ", lastName="
        + lastName
        + ", salary="
        + salary
        + ", employeeId="
        + employeeId
        + ", designation="
        + designation
        + "]";
  }
}
