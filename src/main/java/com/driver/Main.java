package com.driver;

public class Main {
  public static void main(String[] Args){
      RWOnly obj=new RWOnly();
//      obj.name="kalyan";
//     private member has no access to modifiy or create datat to variable as it is private
      obj.setName("kalyan");
      obj.getName();
  }
}