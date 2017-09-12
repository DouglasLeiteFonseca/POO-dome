package comHeranca;

public class Midia {
	private String comentario, titulo, tipo;
	private boolean emprestado;
	private int tempoDuracao;
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
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
	public int getTempoDuracao() {
		return tempoDuracao;
	}
	public void setTempoDuracao(int tempoDuracao) {
		this.tempoDuracao = tempoDuracao;
	}
	public void exibir(){
		System.out.println("Tipo: "+this.getTipo());
		System.out.println("Titulo: "+this.getTitulo());
		System.out.println("Comentario: "+this.getComentario());
		System.out.println("Emprestado? "+ (this.isEmprestado()? "Sim": "Não") );
		System.out.println("Duração: "+this.getTempoDuracao()+" minutos");
		System.out.println("----------------------");
	}
}
