public class AudioPlayer implements MediaPlayer {

    @Override
    public void reproduzir(TipoMedia tipo, String nome) {
        if (tipo == TipoMedia.MP3) {
            System.out.print("Reproduzindo MP3: " + nome);
        } else {
            new MediaPlayerAdapter(tipo).reproduzir(tipo, nome);
        }
    }

}
