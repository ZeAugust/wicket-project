package br.com.timtec.agendaeletronica;

import org.apache.wicket.markup.html.basic.Label;

public class Pesquisar extends BasePage{

	private static final long serialVersionUID = 1L;
	
	public Pesquisar() {
		add(new Label("titulo", "Pesquisar contato"));
	}
}
