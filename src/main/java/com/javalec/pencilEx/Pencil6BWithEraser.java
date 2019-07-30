package com.javalec.pencilEx;

/*

when using features of the super class,

public class Pencil6BWithEraser Extends Pencil implements Pencil {
	
	@Override
	public void use() {
		
		super.use();
		
		System.out.println("6B thickness with an eraser");
	}

}
*/


//if not, we just implement Pencil
public class Pencil6BWithEraser implements Pencil {
	
	@Override
	public void use() {
		
		System.out.println("6B thickness with an eraser");
	}

}
