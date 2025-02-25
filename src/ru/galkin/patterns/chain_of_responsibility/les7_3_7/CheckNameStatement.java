package ru.galkin.patterns.chain_of_responsibility.les7_3_7;

import java.util.List;

public class CheckNameStatement extends CheckerStatement {
    private List<String> listName = List.of("Andrew", "Gitler", "Яша Лава");

    @Override
    public void check(Statement statement) {
        for(int i = 0; i < listName.size(); i++){
            if(statement.getName().equals(listName.get(i))){
                statement.setCheck(false);
            } else {
                statement.setSignature("Безопасность");
                hasNext(statement);
                return;
            }
        }

    }
}
