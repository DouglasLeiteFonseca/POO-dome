package semHeranca;

public class Inicia {
	public static void main(String[] args) {
		BaseDados bd = new BaseDados();
		Cd cd1 = new Cd("Douglas", "Comentario do cd1 ", "Musicas eletronicas", false, 100, 400);
		Cd cd2 = new Cd("Douglas Rock", "Comentario do cd2 ", "Rock", false, 10, 200);
		Cd cd3 = new Cd("Douglas pop", "Comentario do cd3 ", "Pop", false, 50, 100);
		bd.inserirCd(cd1);
		bd.inserirCd(cd2);
		bd.inserirCd(cd3);
		
		bd.listarCds();
		
		Video video1 = new Video("Douglas ", "Comentario do video1 ", "Video 1", false, 400);
		Video video2 = new Video("Douglas Rock", "Comentario do video2 ", "Video 2", false, 200);
		Video video3 = new Video("Douglas pop", "Comentario do video3 ", "Video 3", false, 100);
		bd.inserirVideo(video1);
		bd.inserirVideo(video2);
		bd.inserirVideo(video3);
		
		bd.listarVideos();
		
	}
}
