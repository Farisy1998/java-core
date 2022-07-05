package com.abstractclasses;

// An abstract class can't be both final and abstract. It can only be either final or abstract
public abstract class AbstractAndFinalComparison {
	abstract void start();	// Also a method cannot be both final and abstract
	final void end() {
		
	}
	// Note: A final class cannot have any abstract method. But a abstract class can have final methods
	// 		 with implementation
}
