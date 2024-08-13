import java.time.LocalDateTime;
import java.time.Duration;

class Musica {
    private String titulo;
    private String artista;
    private String album;
    private LocalDateTime dataInclusao;
    private Duration duracao;

    public Musica(String titulo, String artista, String album, Duration duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.dataInclusao = LocalDateTime.now(); 
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public String getAlbum() {
        return album;
    }

    public LocalDateTime getDataInclusao() {
        return dataInclusao;
    }

    public Duration getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                ", album='" + album + '\'' +
                ", dataInclusao=" + dataInclusao +
                ", duracao=" + duracao +
                '}';
    }
}

class Playlist {
    private String nome;
    private String descricao;
    private Musica[] musicas;
    private int nextIndex; 

    public Playlist(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.musicas = new Musica[10]; // Capacidade incial de 10 músicas
        this.nextIndex = 0; // Começa com a playlist vazia
    }

    public void inserir(Musica musica) {
        if (nextIndex < musicas.length) {
            musicas[nextIndex] = musica;
            nextIndex++;
        } else {
            System.out.println("A playlist está cheia. Não é possível adicionar mais músics.");
        }
    }

    public Musica[] listar() {
        Musica[] musicasList = new Musica[nextIndex];
        for (int i = 0; i < nextIndex; i++) {
            musicasList[i] = musicas[i];
        }
        return musicasList;
    }

    public Duration tempoTotal() {
        Duration totalDuration = Duration.ZERO;
        for (int i = 0; i < nextIndex; i++) {
            totalDuration = totalDuration.plus(musicas[i].getDuracao());
        }
        return totalDuration;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", musicas=" + Arrays.toString(musicas) +
                '}';
    }
}