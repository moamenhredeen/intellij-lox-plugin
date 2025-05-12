package me.moamenhredeen.intellijloxplugin.psi;

import com.intellij.psi.tree.IElementType;
import me.moamenhredeen.intellijloxplugin.LoxLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class LoxElementType extends IElementType {
    public LoxElementType(@NonNls @NotNull String debugName) {
        super(debugName, LoxLanguage.INSTANCE);
    }
}
