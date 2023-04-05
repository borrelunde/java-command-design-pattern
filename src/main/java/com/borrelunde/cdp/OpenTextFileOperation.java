package com.borrelunde.cdp;

/**
 * OpenTextFileOperation, a command class.
 * <p>
 * A command is an object whose role is to store all the information required
 * for executing an action, including the method to call, the method arguments,
 * and the object (receiver) that implements the method.
 */
public class OpenTextFileOperation implements TextFileOperation {

	private final TextFile textFile;

	public OpenTextFileOperation(TextFile textFile) {
		this.textFile = textFile;
	}

	@Override
	public String execute() {
		return this.textFile.open();
	}
}
