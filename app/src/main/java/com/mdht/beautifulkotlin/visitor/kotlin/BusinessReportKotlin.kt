package com.mdht.beautifulkotlin.visitor.kotlin

/**
 * Author: txs
 * Package:com.mdht.beautifulkotlin.visitor.kotlin
 */
class BusinessReportKotlin {
    private val mStaffs = mutableListOf<StaffKotlin>()

    init {
        mStaffs.add(ManagerKotlin("王经理"))
        mStaffs.add(EngineerKotlin("工程师-Shawn.Xiong"))
        mStaffs.add(EngineerKotlin("工程师-Kael"))
        mStaffs.add(EngineerKotlin("工程师-Chaossss"))
        mStaffs.add(EngineerKotlin("工程师-Tiiime"))
    }

    fun showReport(visitor: VisitorKotlin) {
        for (staff in mStaffs) {
            staff.accept(visitor)
        }
    }
}