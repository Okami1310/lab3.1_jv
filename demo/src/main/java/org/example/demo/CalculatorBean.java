package org.example.demo;

import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.RequestScoped;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ManagedBean
@RequestScoped
public class CalculatorBean {

    private double x;
    private int n;
    private double e1;
    private double e2;

    private double sumN;
    private double sumE1;
    private double sumE2;
    private double exact;

    public String calculate() {
        sumN = Calculator.calculateSum(n, x);
        sumE1 = Calculator.calculateSumLargerTerms(n, x, e1);
        sumE2 = Calculator.calculateSumLargerTerms(n, x, e2);
        exact = Calculator.exactValue(x);

             return "result.xhtml";
    }
}

