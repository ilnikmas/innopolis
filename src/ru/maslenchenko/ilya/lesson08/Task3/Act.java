package ru.maslenchenko.ilya.lesson08.Task3;

import java.util.Date;

public class Act {
    private int contractNumber;
    private String contractData;
    private String[] goodsList;

    Act(int contractNumber, String contractData, String[] goodsList) {
        this.contractNumber = contractNumber;
        this.contractData = contractData;
        this.goodsList = goodsList;

    }
    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getContractData() {
        return contractData;
    }

    public void setContractData(String contractData) {
        this.contractData = contractData;
    }

    public String[] getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(String[] goodsList) {
        this.goodsList = goodsList;
    }
}
