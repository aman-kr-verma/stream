package com.stream;

//import java.io.FileNotFoundException;
import java.io.IOException;

class Parent {
	public void show() throws IOException {
		System.out.println("in parent show");
	}
}

class Child extends Parent{
	@Override
	public void show() throws RuntimeException, IOException {
		System.out.println("in child show");
	}
}

public class ExceptionCheck {
	public static void main(String[] args) {
		Parent obj = new Child();
		try {
			obj.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
