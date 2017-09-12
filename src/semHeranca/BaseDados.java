package semHeranca;

import java.util.ArrayList;

public class BaseDados {
	private ArrayList<Cd> listaCds = new ArrayList<Cd>();	
	private ArrayList<Video> listaVideos  = new ArrayList<Video>();
	
	public void apagarCd(int idCd){
		listaCds.remove(idCd);
	}
	public void apagarVideo(int idVideo){
		listaVideos.remove(idVideo);
	}
	public void atualizarCd(int idCd, Cd cd){
		listaCds.set(idCd, cd);
	}
	public void atualizarVideo(int idVideo, Video video){
		listaVideos.set(idVideo, video);
	}
	public ArrayList<Cd> getListaCds(){
		return listaCds;
	}
	public ArrayList<Video> getListaVideos(){
		return listaVideos;
	}
	public void inserirCd(Cd cd){
		listaCds.add(cd);
	}
	public void inserirVideo(Video video){
		listaVideos.add(video);
	}
	public void listarCds(){
		System.out.println("-----------CDs-----------");
		for (Cd cd : listaCds){
			System.out.println("Titulo: "+cd.getTitulo());
			System.out.println("Artista: "+cd.getArtista());
			System.out.println("Comentario: "+cd.getComentario());
			System.out.println("Musicas: "+cd.getNroMusicas());
			System.out.println("Duração: "+cd.getTempoDuracao()+" minutos");
			System.out.println("----------------------");
		}
	}
	public void listarVideos(){
		System.out.println("-----------Videos-----------");
		for (Video video : listaVideos){
			System.out.println("Titulo: "+video.getTitulo());
			System.out.println("Diretor: "+video.getDiretor());
			System.out.println("Comentario: "+video.getComentario());
			System.out.println("Duração: "+video.getTempoDuracao()+" minutos");
			System.out.println("----------------------");
		}
	}
	public void setListaCds(ArrayList<Cd> listaCds) {
		this.listaCds = listaCds;
	}
	public void setListaVideos(ArrayList<Video> listaVideos) {
		this.listaVideos = listaVideos;
	}
	public static void main(String[] args) {
		
	}
	
}
