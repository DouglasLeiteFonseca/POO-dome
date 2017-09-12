package comHeranca;

public class Cd extends Midia {
	 private String artista;
	 private int nroMusicas;
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public int getNroMusicas() {
		return nroMusicas;
	}
	public void setNroMusicas(int nroMusicas) {
		this.nroMusicas = nroMusicas;
	}
	public void exibir(){
		System.out.println("---------- Cd ------------");
		System.out.println("Artista: "+this.getArtista());
		System.out.println("Titulo: "+this.getTitulo());
		System.out.println("Comentario: "+this.getComentario());
		System.out.println("Emprestado? "+ (this.isEmprestado()? "Sim": "Não") );
		System.out.println("Duração: "+this.getTempoDuracao()+" minutos");
		System.out.println("Numero de musicas: "+this.getNroMusicas()+" ");
		System.out.println("----------------------");
	}
	public Cd(String artista, String comentario, String titulo, boolean emprestado, int nroMusicas, int tempoDuracao ) {
		super();
		this.setArtista(artista);
		this.setComentario(comentario);
		this.setTitulo(titulo);
		this.setEmprestado(emprestado);
		this.setNroMusicas(nroMusicas);
		this.setTempoDuracao(tempoDuracao);
		this.setTipo("Cd");
	}
	
}
