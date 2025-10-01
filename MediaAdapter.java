public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String type) {
        if (type.equalsIgnoreCase("wav")) {
            advancedMediaPlayer = new WavPlayer();
        } else if (type.equalsIgnoreCase("flac")) {
            advancedMediaPlayer = new FlacPlayer();
        }
    }

    @Override
    public void play(String type, String file) {
        if (advancedMediaPlayer != null) {
            advancedMediaPlayer.playFile(file);
        } else {
            System.out.println("Unsupported: " + type);
        }
    }
}

