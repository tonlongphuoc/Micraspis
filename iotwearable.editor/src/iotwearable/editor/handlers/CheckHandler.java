package iotwearable.editor.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import iotwearable.editor.command.CodeCheckerCommand;


public class CheckHandler extends AbstractHandler{
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		CodeCheckerCommand command = new CodeCheckerCommand();
		command.canExecute();
		command.execute();
		return null;
	}
}
