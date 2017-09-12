package semHeranca;

public class Video {
	private String comentario, diretor, titulo;
	private boolean emprestado;
	private int tempoDuracao;
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
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
	public int getTempoDuracao() {
		return tempoDuracao;
	}
	public void setTempoDuracao(int tempoDuracao) {
		this.tempoDuracao = tempoDuracao;
	}

	public Video(String diretor, String comentario, String titulo, boolean emprestado, int tempoDuracao ) {
		this.setDiretor(diretor);
		this.setComentario(comentario);
		this.setTitulo(titulo);
		this.setEmprestado(emprestado);
		this.setTempoDuracao(tempoDuracao);
	}
	public static void main(String[] args) {
		BaseDados bd = new BaseDados();
		Video video1 = new Video("Douglas ", "Comentario do video1 ", "Video 1", false, 400);
		Video video2 = new Video("Douglas Rock", "Comentario do video2 ", "Video 2", false, 200);
		Video video3 = new Video("Douglas pop", "Comentario do video3 ", "Video 3", false, 100);
		bd.inserirVideo(video1);
		bd.inserirVideo(video2);
		bd.inserirVideo(video3);
		
		bd.listarVideos();
		
	}
}
