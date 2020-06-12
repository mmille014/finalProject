package org.launchcode.finalproject.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SpendingTracker {

    public String expense;
    public Integer owe;
    public Integer paid;
    public Integer difference;

    @Id
    @GeneratedValue
    private int id;

    public SpendingTracker(String Expense, Integer Owe, Integer Paid, Integer Difference) {
        this.expense = Expense;
        this.owe = Owe;
        this.paid = Paid;
        this.difference = Difference;
    }

    public SpendingTracker() {


    }

    public String getExpense() {
        return expense;
    }

    public void setExpense(String expense) {
        this.expense = expense;
    }

    public Integer getOwe() {
        return owe;
    }

    public void setOwe(Integer owe) {
        this.owe = owe;
    }

    public Integer getPaid() {
        return paid;
    }

    public void setPaid(Integer paid) {
        this.paid = paid;
    }

    public Integer getDifference() {
        return difference;
    }

    public void setDifference(Integer difference) {
        this.difference = difference;
    }

    public int getId() {
        return id;
    }

 }
