package nep.timeline.re_telegram.obfuscate.resolves;

import java.util.Map;

import nep.timeline.re_telegram.obfuscate.ObfuscationResolver;

public final class Cherrygram implements ObfuscationResolver {
    public static final Cherrygram INSTANCE = new Cherrygram();

    // Cherrygram v10.x uses R8 obfuscation
    private static final Map<String, String> CLASSES = Map.of(
        "org.telegram.ui.Cells.ChatMessageCell", "ao0",
        "org.telegram.messenger.support.LongSparseArray", "Zi2",
        "org.telegram.ui.ActionBar.Theme", "org.telegram.ui.ActionBar.q"
    );

    private static final Map<String, String> FIELDS = Map.of(
        "ChatMessageCell.currentMessageObject", "currentMessageObject",
        "Theme.chat_timePaint", "K2"
    );

    private static final Map<String, String> METHODS = Map.of(
        "ChatMessageCell.measureTime", "f6",
        "ChatMessageCell.setVisibleOnScreen", "N6",
        "LongSparseArray.get", "g"
    );

    private Cherrygram() {}

    @Override
    public String resolveClass(String className) {
        return CLASSES.get(className);
    }

    @Override
    public String resolveField(String className, String fieldName) {
        return FIELDS.get(className + "." + fieldName);
    }

    @Override
    public String resolveMethod(String className, String methodName) {
        return METHODS.get(className + "." + methodName);
    }
}
