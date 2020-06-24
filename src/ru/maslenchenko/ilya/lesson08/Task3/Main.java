package ru.maslenchenko.ilya.lesson08.Task3;

import static ru.maslenchenko.ilya.lesson08.Task3.ContractConvertor.*;

public class Main {
    public static void main(String[] args) {
        Contract contract = new Contract();
        contract.setContractNumber(12345678);
        contract.setContractData("12.12.2020");
        contract.setGoodsList(new String[]{"Апельсин", "Банан", "Кокос"});
        getAct(contract);
    }
}
