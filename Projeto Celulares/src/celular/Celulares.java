package celular;

import java.util.ArrayList;
import java.util.List;

public class Celulares {

	private List<String> nome = new ArrayList<String>();
	private List<Integer> id = new ArrayList<Integer>();

	public List<String> getNome() {
		return nome;
	}

	public void setNome(List<String> nome) {
		this.nome = nome;
	}

	public List<Integer> getId() {
		return id;
	}

	public void setId(List<Integer> id) {
		this.id = id;
	}
	
}
