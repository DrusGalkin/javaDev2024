package ru.galkin.patterns.chain_of_responsibility.les7_3_7;

public class Vakansii extends CheckerStatement{
    private Bank bank;

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void check(Statement statement) {
        if(bank.getCountVakansii() > 0){
            statement.setSignature("отдел кадров");
            statement.setCheck(true);
            hasNext(statement);
        } else {
            statement.setCheck(false);
        }
    }
}
