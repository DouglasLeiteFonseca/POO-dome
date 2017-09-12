package comHeranca;

import java.util.ArrayList;

public class BaseDados {
	private ArrayList<Midia> lista = new ArrayList<Midia>();	
	
	public void apagar(int id){
		lista.remove(id);
	}
	public void atualizar(int id, Midia midia){
		lista.set(id, midia);
	}

	public ArrayList<Midia> getLista(){
		return lista;
	}

	public void inserir(Midia midia){
		lista.add(midia);
	}
	
	public void listar(){
		System.out.println("-----------Midias-----------");
		for (Midia midia : lista){
			midia.exibir();
		}
	}
	
	public void setLista(ArrayList<Midia> lista) {
		this.lista = lista;
	}
	
	public static void main(String[] args) {
		
	}
	
}
