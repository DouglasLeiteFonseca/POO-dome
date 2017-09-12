package comHeranca;


public class Video extends Midia {
	private String diretor;

	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public void exibir(){
		System.out.println("---------- Video ------------");
		System.out.println("Diretor: "+this.getDiretor());
		System.out.println("Titulo: "+this.getTitulo());
		System.out.println("Comentario: "+this.getComentario());
		System.out.println("Emprestado? "+ (this.isEmprestado()? "Sim": "Não") );
		System.out.println("Duração: "+this.getTempoDuracao()+" minutos");
		System.out.println("----------------------");
	}
	public Video(String diretor, String comentario, String titulo, boolean emprestado, int tempoDuracao ) {
		super();
		this.setDiretor(diretor);
		this.setComentario(comentario);
		this.setTitulo(titulo);
		this.setEmprestado(emprestado);
		this.setTempoDuracao(tempoDuracao);
		this.setTipo("Video");
	}

}
