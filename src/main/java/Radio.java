public class Radio {
    private int currentChannel;
    private int currentVolume;
    private int maxRadiostation;

    public Radio() {
        this.maxRadiostation = 10 - 1;
    }

    public Radio(int valueOfRadiostations) {
        this.maxRadiostation = valueOfRadiostations - 1;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int newCurrentChannel) {
        if (newCurrentChannel > this.maxRadiostation) {
            currentChannel = 0;
        } else if (newCurrentChannel < 0) {
            currentChannel = this.maxRadiostation;
        } else {
            currentChannel = newCurrentChannel;
        }
    }

    public void switchChannelNext() {
        int target = currentChannel + 1;
        setCurrentChannel(target);
    }

    public void switchChannelPrev() {
        int target = currentChannel - 1;
        setCurrentChannel(target);
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            currentVolume = 0;
        } else if (newCurrentVolume > 100) {
            currentVolume = 100;
        } else {
            currentVolume = newCurrentVolume;
        }
    }

    public void switchVolumeUp() {
        int target = currentVolume + 1;
        setCurrentVolume(target);
    }

    public void switchVolumeDown() {
        int target = currentVolume - 1;
        setCurrentVolume(target);
    }
}
