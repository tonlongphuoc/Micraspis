package iotwearable.editor.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import iotwearable.editor.command.GenerateCodeCommand;

public class GenerateCodeHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		GenerateCodeCommand command = new GenerateCodeCommand();
		command.canExecute();
		command.execute();
		return null;
	}
}
