package celular;

import java.util.ArrayList;
import java.util.List;

public class Celulares {

	private static List<String> nome = new ArrayList<String>();
	private static List<Integer> id = new ArrayList<Integer>();
	

	public static List<String> getNome() {
		return nome;
	}

	public static void setNome(List<String> nome) {
		Celulares.nome = nome;
	}

	public static List<Integer> getId() {
		return id;
	}

	public static void setId(List<Integer> id) {
		Celulares.id = id;
	}
	
}
