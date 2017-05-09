package springRevision;

import AspectJ.loggable;

public class HelloWorld {

  String name;
  String address;

  int number;

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  @loggable
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String nn(String name) {

    return "The name is : " + name;

  }

}
