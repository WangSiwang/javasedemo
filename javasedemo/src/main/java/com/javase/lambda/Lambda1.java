package com.javase.lambda;

import java.util.function.Consumer;

import org.junit.Test;

/**
 * 
 * @author 3
 *
 */
public class Lambda1 {
	public static void main(String[] args) {
		// Java 8之前：
		new Thread(new Runnable() {
		    @Override
		    public void run() {
		    System.out.println("Before Java8, too much code for too little to do");
		    }
		}).start();
		//Java 8方式：
		new Thread( () -> System.out.println("In Java8, Lambda expression rocks !!") ).start();
		Consumer<String> con;
		
	}
	@Test
	public void test1() {

		conn("12", System.out::println);
	}
	public void conn(String str,Consumer<String> conn) {
		conn.accept(str);
	}
}
