package com.mdht.beautifulkotlin.command.java;

public class AddCommandJava implements CommandJava {
    private ReceiverJava receiverJava;

    public AddCommandJava(ReceiverJava receiverJava) {
        this.receiverJava = receiverJava;
    }

    @Override
    public void execute() {
        receiverJava.add();
    }
}
