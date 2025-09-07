import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AudioPlayer {
    public static void main(String[] args) {
        String[] audioFiles = {
            "Audio 1: Format voice YAML demo 01.wav",
            "Audio 2: Format voice YAML demo 02.wav",
            "Audio 3: Format voice YAML demo 03.wav",
            "Audio 4: Format voice YAML demo 04.wav",
            "Audio 5: Format voice YAML demo 05.wav",
            "Audio 6: Format voice YAML demo 06.wav"
        };

        for (String file : audioFiles) {
            playAudio(file);
        }
    }

    public static void playAudio(String filePath) {
        try {
            File audioFile = new File(filePath);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            while (!clip.isRunning()) {
                Thread.sleep(100);
            }
            while (clip.isRunning()) {
                Thread.sleep(100);
            }
            clip.close();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
