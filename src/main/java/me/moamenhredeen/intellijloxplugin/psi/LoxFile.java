package me.moamenhredeen.intellijloxplugin.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import me.moamenhredeen.intellijloxplugin.LoxFileType;
import me.moamenhredeen.intellijloxplugin.LoxLanguage;
import org.jetbrains.annotations.NotNull;

public class LoxFile extends PsiFileBase {

    public LoxFile(@NotNull FileViewProvider viewProvider){
        super(viewProvider, LoxLanguage.INSTANCE);
    }

    @Override
    public @NotNull FileType getFileType() {
        return LoxFileType.INSTANCE;
    }

    @Override
    public String toString(){
        return "Lox File";
    }
}
