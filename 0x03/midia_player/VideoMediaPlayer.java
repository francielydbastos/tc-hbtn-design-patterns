public class VideoMediaPlayer implements AdvancedMediaPlayer {

    @Override
    public void reproduzirVlc(String nomeVlc) {
        System.out.print("Reproduzindo VLC: " + nomeVlc);
    }

    @Override
    public void reproduzirMp4(String nomeMP4) {
        System.out.print("Reproduzindo MP4: " + nomeMP4);
    }

}
