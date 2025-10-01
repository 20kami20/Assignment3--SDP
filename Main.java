public class Main {
    public static void main(String[] args) {
        MediaPlayer player = new AudioPlayer();

        player.play("mp3", "song1.mp3");
        player.play("wav", "song.wav");
        player.play("flac", "song3.flac");
        player.play("mp4", "song4.mp4");
    }
}
