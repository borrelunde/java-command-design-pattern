package com.borrelunde.cdp;

/**
 * SaveTextFileOperation, a command class.
 * <p>
 * A command is an object whose role is to store all the information required
 * for executing an action, including the method to call, the method arguments,
 * and the object (receiver) that implements the method.
 */
public class SaveTextFileOperation implements TextFileOperation {

	private final TextFile textFile;

	public SaveTextFileOperation(TextFile textFile) {
		this.textFile = textFile;
	}

	@Override
	public String execute() {
		return this.textFile.save();
	}
}
