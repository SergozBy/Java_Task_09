public class Radio {
    private int currentChannel;
    private int currentVolume;

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int newCurrentChannel) {
        if (newCurrentChannel > 9) {
            currentChannel = 0;
        } else if (newCurrentChannel < 0) {
            currentChannel = 9;
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
