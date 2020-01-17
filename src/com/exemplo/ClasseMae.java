package com.exemplo;

public class ClasseMae {
	
	public String banco = "couro";
	protected String cor ="marrom";
	private String janela="insulfilm";
	String roda = "aro 15";
	
	public void exibirDetalhes() {
		
		System.out.println("Detalhes do carro");
		System.out.println();

		System.out.println("banco:"+banco);
		System.out.println("cor:"+cor);
		System.out.println("roda:"+roda);
		System.out.println("janela:"+janela);
	}
}
