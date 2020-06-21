package ru.maslenchenko.ilya.lesson08.Task3;

public class ContractConvertor {
    public static Act getAct(Contract contract) {
        return new Act(contract.getContractNumber(), contract.getContractData(), contract.getGoodsList());
    }
}
