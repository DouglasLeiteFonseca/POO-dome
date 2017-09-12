package comHeranca;

public class Inicia {
	public static void main(String[] args) {
		BaseDados bd = new BaseDados();
		Cd cd1 = new Cd("Douglas", "Comentario do cd1 ", "Musicas eletronicas", true, 100, 400);
		Cd cd2 = new Cd("Douglas Rock", "Comentario do cd2 ", "Rock", false, 10, 200);
		Cd cd3 = new Cd("Douglas pop", "Comentario do cd3 ", "Pop", true, 50, 100);
		bd.inserir(cd1);
		bd.inserir(cd2);
		bd.inserir(cd3);
		
		
		Video video1 = new Video("Douglas ", "Comentario do video1 ", "Video 1", false, 400);
		Video video2 = new Video("Douglas Rock", "Comentario do video2 ", "Video 2", true, 200);
		Video video3 = new Video("Douglas pop", "Comentario do video3 ", "Video 3", false, 100);
		bd.inserir(video1);
		bd.inserir(video2);
		bd.inserir(video3);
		
		bd.listar();
		
	}
}
