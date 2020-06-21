package ru.maslenchenko.ilya.lesson08.Task3;

public class ContractConvertor {
    public static void getAct(Contract contract) {
        //return new Act(contract.getContractNumber(), contract.getContractData(), contract.getGoodsList());
        Act act = new Act(contract.getContractNumber(), contract.getContractData(), contract.getGoodsList());
        String actNumber = "Act № " + contract.getContractNumber();
        System.out.println(actNumber);
    }

}
