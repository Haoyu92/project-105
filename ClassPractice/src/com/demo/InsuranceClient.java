package com.demo;
 
public class InsuranceClient {
     
    String userType;
     
    public void processInsurance(Insurance insurance) {
        if(userType.equals("agent")) {
            insurance.generatePolicy();
        }
        else
            insurance.createQuote();
    }
     
    public InsuranceClient(String userType) {
         
        this.userType = userType;
        System.out.println("Hello!");
        if(userType.equals("agent")) {
            processInsurance(new InsuranceAdapter() {
                public void generatePolicy() {
                    System.out.println("Your quote price: " + Math.random() * 100);
                }
            }); // only generating policy
        }
        else if(userType.equals("customer")) {
            processInsurance(new InsuranceAdapter() {
                public void createQuote() {
                    System.out.println("Policy generated!");
                }
            }); // only create a quote
        }
         
    }
     
    public static void main(String a[]) {
        InsuranceClient ic1 = new InsuranceClient("agent");
        InsuranceClient ic2 = new InsuranceClient("customer");
    }
  
}