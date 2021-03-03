package com.beanpost.helper;

import java.util.concurrent.atomic.AtomicInteger;

public class ObjectTracker {

	private static AtomicInteger count=new AtomicInteger(0);
	
	public static void increment() {
		count.incrementAndGet();
	}
	public static int size() {
		return count.get();
	}
}
