package com.singleton;

public class Lazy {

	private static Lazy lazyInstance;

	private Lazy() {

	}

	public Lazy getInstance() {

		if (lazyInstance == null) {
			lazyInstance = new Lazy();
		}

		return lazyInstance;
	}

}
