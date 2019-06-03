package com.mdht.beautifulkotlin.mediator.java;

public class MainBoardJava extends MediatorJava {
    private CDDeviceJava cdDevice;
    private CPUJava cpu;
    private SoundCardJava soundCard;
    private GraphicsCardJava graphicsCard;

    @Override
    public void changed(ColleagueJava colleague) {
        if (colleague == cdDevice) {
            handleCD((CDDeviceJava) colleague);
        } else if (colleague == cpu) {
            handleCPU((CPUJava) colleague);
        }

    }

    private void handleCPU(CPUJava colleague) {
        soundCard.soundPlay(cpu.getDataSound());
        graphicsCard.videoPlay(cpu.getDataVideo());
    }

    private void handleCD(CDDeviceJava colleague) {
        cpu.decodeData(colleague.read());
    }

    public void setCDDevice(CDDeviceJava cdDevice) {
        this.cdDevice = cdDevice;
    }

    public void setCPU(CPUJava cpu) {
        this.cpu = cpu;
    }

    public void setSoundCard(SoundCardJava soundCard) {
        this.soundCard = soundCard;
    }

    public void setGraphicsCard(GraphicsCardJava graphicsCard) {
        this.graphicsCard = graphicsCard;
    }
}
