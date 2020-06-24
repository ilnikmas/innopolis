package ru.maslenchenko.ilya.lesson08.Task3;

import java.util.Arrays;

public class ContractConvertor {
    public static void getAct(Contract contract) {
        Act act = new Act(contract.getContractNumber(), contract.getContractData(), contract.getGoodsList());
        String actNumber = "Act № " + contract.getContractNumber();
        System.out.println(actNumber);
        String goodsList = Arrays.toString(contract.getGoodsList());
        System.out.println(goodsList);
        String data = contract.getContractData();
        System.out.println(data);

    }

}
