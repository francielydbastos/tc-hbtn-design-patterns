public class VideoMediaPlayer implements AdvancedMediaPlayer {

    @Override
    public void reproduzirVlc(String nomeVlc) {
        System.out.println("Reproduzindo VLC: " + nomeVlc);
    }

    @Override
    public void reproduzirMp4(String nomeMP4) {
        System.out.println("Reproduzindo MP4: " + nomeMP4);
    }

}
