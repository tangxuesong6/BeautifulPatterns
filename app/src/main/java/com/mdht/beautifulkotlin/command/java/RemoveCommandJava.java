package com.mdht.beautifulkotlin.command.java;

public class RemoveCommandJava implements CommandJava {
    private ReceiverJava receiverJava;

    public RemoveCommandJava(ReceiverJava receiverJava) {
        this.receiverJava = receiverJava;
    }
    @Override
    public void execute() {
        receiverJava.remove();
    }
}
