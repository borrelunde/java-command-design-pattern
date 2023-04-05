package com.borrelunde.cdp;

import java.util.ArrayList;
import java.util.List;

/**
 * TextFileOperationExecutor, an invoker class.
 * <p>
 * An invoker is an object that knows how to execute a given command but doesn't
 * know how the command has been implemented. It only knows the command's
 * interface.
 * <p>
 * In some cases, the invoker also stores and queues commands, aside from
 * executing them. This is useful for implementing some additional features,
 * such as macro recording or undo and redo functionality.
 * <p>
 * This class is a thin layer of abstraction that decouples the command objects
 * from their consumers and calls the method encapsulated within the
 * TextFileOperation command objects.
 */
public class TextFileOperationExecutor {

	// Stores the command operations in a list, this is not
	// mandatory in the pattern implementation, unless further
	// control to the operation's execution process is added.
	private final List<TextFileOperation> listOfTextFileOperations = new ArrayList<>();

	public String executeOperation(TextFileOperation textFileOperation) {
		this.listOfTextFileOperations.add(textFileOperation);
		return textFileOperation.execute();
	}
}
