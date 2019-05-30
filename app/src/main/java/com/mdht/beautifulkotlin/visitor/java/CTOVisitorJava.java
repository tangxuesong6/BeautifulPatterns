package com.mdht.beautifulkotlin.visitor.java;

import android.util.Log;

public class CTOVisitorJava implements VisitorJava {
    private final String TAG = CTOVisitorJava.class.getSimpleName();

    @Override
    public void visit(EngineerJava engineerJava) {
        Log.d(TAG, "工程师： " + engineerJava.name + ", 代码行数： " + engineerJava.getCodeLines());
    }

    @Override
    public void visit(ManagerJava managerJava) {
        Log.d(TAG, "经理： " + managerJava.name + "， 新产品数量 ：" + managerJava.getProducts());
    }
}
