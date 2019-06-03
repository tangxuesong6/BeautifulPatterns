package com.mdht.beautifulkotlin.proxy.java;

public class LawyerJava implements ILawsuitJava {
    private ILawsuitJava iLawsuit;

    public LawyerJava(ILawsuitJava iLawsuit) {
        this.iLawsuit = iLawsuit;
    }

    @Override
    public void submit() {
        iLawsuit.submit();
    }

    @Override
    public void burden() {
        iLawsuit.burden();
    }

    @Override
    public void defend() {
        iLawsuit.defend();
    }

    @Override
    public void finish() {
        iLawsuit.finish();
    }
}
