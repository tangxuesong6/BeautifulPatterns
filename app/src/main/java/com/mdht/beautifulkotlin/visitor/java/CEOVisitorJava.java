package com.mdht.beautifulkotlin.visitor.java;

import android.util.Log;

public class CEOVisitorJava implements VisitorJava {
    private final String TAG = CEOVisitorJava.class.getSimpleName();

    @Override
    public void visit(EngineerJava engineerJava) {
        Log.d(TAG, "工程师： " + engineerJava.name + ", KPI" + engineerJava.kpi);
    }

    @Override
    public void visit(ManagerJava managerJava) {
        Log.d(TAG, "经理： " + managerJava.name + ", KPI" + managerJava.kpi + "， 新产品数量 ：" + managerJava.getProducts());
    }
}
