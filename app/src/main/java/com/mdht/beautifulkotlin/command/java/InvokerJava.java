package com.mdht.beautifulkotlin.command.java;

import java.util.ArrayList;
import java.util.List;

public class InvokerJava {
    private AddCommandJava addCommandJava;
    private RemoveCommandJava removeCommandJava;
    private List<CommandJava> list = new ArrayList<>();

    public void setAddCommand(AddCommandJava addCommandJava) {
        this.addCommandJava = addCommandJava;
        list.add(addCommandJava);
    }

    public void setRemoveCommand(RemoveCommandJava removeCommandJava) {
        this.removeCommandJava = removeCommandJava;
        list.add(removeCommandJava);
    }
    public void undo(){
        if (list.size() > 0){
            list.remove(list.size() - 1);
        }
    }

    public void processCommands() {
        for (CommandJava command : list) {
            command.execute();
        }
        list.clear();
    }
}
