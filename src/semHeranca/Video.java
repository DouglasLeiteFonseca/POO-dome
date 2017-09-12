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
		
	}
}
