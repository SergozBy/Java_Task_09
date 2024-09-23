import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// This class created for testing purpose
public class RadioTest {

    // Set channel to 5
    @Test
    public void shouldSetCurrentChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(5);

        int expected = 5;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    // Set channel from 5 to 6
    @Test
    public void shouldSetCurrentChannelNext_6() {
        Radio radio = new Radio();
        radio.setCurrentChannel(5);
        radio.switchChannelNext();

        int expected = 6;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    // Set channel from 9 to 0
    @Test
    public void shouldSetCurrentChannelNext_0() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);
        radio.switchChannelNext();

        int expected = 0;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    // Set channel from 0 to 9
    @Test
    public void shouldSetCurrentChannelPrev_9() {
        Radio radio = new Radio();
        radio.setCurrentChannel(0);
        radio.switchChannelPrev();

        int expected = 9;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    // Set volume to 50
    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        int expected = 50;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // Set volume lower than 0 (min value)
    @Test
    public void shouldSetCurrentVolume_0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // Set volume greeter than 100 (max value)
    @Test
    public void shouldSetCurrentVolume_100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(111);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // Set volume greeter than 100 by function (max value)
    @Test
    public void shouldSetCurrentVolumeUp_100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.switchVolumeUp();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // Set volume lower than 0 by function(min value)
    @Test
    public void shouldSetCurrentVolumeDown_0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.switchVolumeDown();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
