public class Main {
    public static void main(String[] args) {
        Duration songDuration = Duration.ofMinutes(3).plusSeconds(30); 
        Musica music1 = new Musica("Bohemian Rhapsody", "Queen", "A Night at the Opera", songDuration);

        Playlist myPlaylist = new Playlist("Minhas Musicas favoritas", "Um mix de rock e Pop");
        myPlaylist.inserir(music1);
        Musica[] songs = myPlaylist.listar();
        for (Musica song : songs) {
            System.out.println(song);
        }

        // Pega a duração total da playlist
        Duration totalTime = myPlaylist.tempoTotal();
        System.out.println("Total time of playlist: " + totalTime);
    }
}