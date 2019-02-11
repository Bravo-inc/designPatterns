package mk.p.command;

import org.apache.commons.lang3.StringUtils;

public class PasteCommand extends Command {
    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (StringUtils.isBlank(editor.clipboard)) return false;
        backup();
        editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());
        return true;
    }
}