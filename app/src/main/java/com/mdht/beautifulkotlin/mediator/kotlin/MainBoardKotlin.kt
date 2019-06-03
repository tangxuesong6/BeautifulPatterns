package com.mdht.beautifulkotlin.mediator.kotlin

/**
 * Author: txs
 * Package:com.mdht.beautifulkotlin.mediator.kotlin
 */
class MainBoardKotlin : MediatorKotlin() {
    lateinit var cdDevices: CDDevicesKotlin
    lateinit var cpu: CPUKotlin
    lateinit var soundCard: SoundCardKotlin
    lateinit var graphicsCardKotlin: GraphicsCardKotlin
    override fun changed(colleagueKotlin: ColleagueKotlin) {
        if (colleagueKotlin == cdDevices) {
            handleCD(colleagueKotlin as CDDevicesKotlin)
        } else if (colleagueKotlin == cpu) {
            handleCPU(colleagueKotlin as CPUKotlin)
        }
    }

    private fun handleCPU(cpuKotlin: CPUKotlin) {
        soundCard.soundPlay(cpuKotlin.getDataSound())
        graphicsCardKotlin.videoPlay(cpuKotlin.getDataVideo())
    }

    private fun handleCD(cdDevicesKotlin: CDDevicesKotlin) {
        cpu.decodeData(cdDevicesKotlin.read())
    }

}