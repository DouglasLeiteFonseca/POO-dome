package semHeranca;

public class Cd {
	 private String artista, comentario, titulo;
	 private boolean emprestado;
	 private int nroMusicas, tempoDuracao;
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public boolean isEmprestado() {
		return emprestado;
	}
	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}
	public int getNroMusicas() {
		return nroMusicas;
	}
	public void setNroMusicas(int nroMusicas) {
		this.nroMusicas = nroMusicas;
	}
	public int getTempoDuracao() {
		return tempoDuracao;
	}
	public void setTempoDuracao(int tempoDuracao) {
		this.tempoDuracao = tempoDuracao;
	}
	
	public Cd(String artista, String comentario, String titulo, boolean emprestado, int nroMusicas, int tempoDuracao ) {
		this.setArtista(artista);
		this.setComentario(comentario);
		this.setTitulo(titulo);
		this.setEmprestado(emprestado);
		this.setNroMusicas(nroMusicas);
		this.setTempoDuracao(tempoDuracao);
	}

}
