package com.projeto.ordenacao;

import java.util.Comparator;

import com.projeto.entidades.Item;

public class OrdenaItensPorNome implements Comparator<Item> {
	
	/** 
	 * Classe responsavel por comparar dois objetos por meio do nome.
	 * 
	 * @author  Igor Silveira
	 * 			Jose Davi
	 * 			Matheus Gusmao
	 * 			Rich Ramalho
	 */
	@Override
	public int compare(Item o1, Item o2) {
		return o1.getNome().compareTo(o2.getNome());
	}

}
