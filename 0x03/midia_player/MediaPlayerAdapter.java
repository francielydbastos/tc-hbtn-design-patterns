public class MediaPlayerAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter(TipoMedia tipo) {
        if (tipo != TipoMedia.MP3) {
            this.advancedMediaPlayer = new VideoMediaPlayer();
        }
    }

    @Override
    public void reproduzir(TipoMedia tipo, String nome) {
        if (tipo == TipoMedia.MP4) {
            this.advancedMediaPlayer.reproduzirMp4(nome);
        } else if (tipo == TipoMedia.VLC) {
            this.advancedMediaPlayer.reproduzirVlc(nome);
        }
    }

}
