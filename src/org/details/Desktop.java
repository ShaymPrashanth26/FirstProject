package org.details;

public class Desktop extends Computer {

	private void desktopSize() {
		System.out.println("desktop size: 14inch");

	}
	
	public static void main(String[] args) {
		
		Desktop dk=new Desktop();
		dk.desktopSize();
		dk.computerModel();
	}
}
