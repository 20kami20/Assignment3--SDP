public class AudioPlayer implements MediaPlayer {
    public void play(String type, String file) {
        if(type.equalsIgnoreCase("mp3")) System.out.println("Playing MP3: " + file);
        else new MediaAdapter(type).play(type, file);
    }
}
