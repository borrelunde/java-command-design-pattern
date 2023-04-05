package com.borrelunde.cdp;

/**
 * TextFile, the receiver class.
 * <p>
 * A receiver is an object that performs a set of cohesive actions. It's the
 * component that performs the actual action when the command's execute() method
 * is called.
 * <p>
 * This class' role is to model TextFile objects.
 */
public class TextFile {

	private final String name;

	public TextFile(String name) {
		this.name = name;
	}

	public String open() {
		return "Opening file " + this.name;
	}

	public String save() {
		return "Saving file " + this.name;
	}
}
