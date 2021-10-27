package com.qa.main;

public class LambdaExpressions {
	
	interface FuncInterface {
        double operation(double a, double b);
    }

    private double operate(double a, double b, FuncInterface funcObj) {
        return funcObj.operation(a, b);
    }

    public static void main(String[] args) {
        FuncInterface add = (double x, double y) -> x + y;

        LambdaExpressions lambda = new LambdaExpressions();
        System.out.println(lambda.operate(5, 7, add));
        
        FuncInterface subtract = (double x, double y) -> x - y;
        System.out.println(lambda.operate(5, 7, subtract));
        
        FuncInterface multiply = (double x, double y) -> x * y;
        System.out.println(lambda.operate(5, 7, multiply));
        
        FuncInterface divide = (double x, double y) -> x / y;
        System.out.println(lambda.operate(5, 7, divide));
        
        
    }

}
