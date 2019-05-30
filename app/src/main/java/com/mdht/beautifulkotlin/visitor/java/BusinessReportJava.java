package com.mdht.beautifulkotlin.visitor.java;

import java.util.LinkedList;
import java.util.List;

public class BusinessReportJava {
    List<StaffJava> mStaffs = new LinkedList<>();

    public BusinessReportJava() {
        mStaffs.add(new ManagerJava("王经理"));
        mStaffs.add(new EngineerJava("工程师-Shawn.Xiong"));
        mStaffs.add(new EngineerJava("工程师-Kael"));
        mStaffs.add(new EngineerJava("工程师-Chaossss"));
        mStaffs.add(new EngineerJava("工程师-Tiiime"));
    }

    public void showReport(VisitorJava visitorJava) {
        for (StaffJava staff : mStaffs) {
            staff.accept(visitorJava);
        }
    }
}
