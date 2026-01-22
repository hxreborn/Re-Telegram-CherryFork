package nep.timeline.re_telegram.obfuscate;

public interface ObfuscationResolver {
    String resolveClass(String className);
    String resolveField(String className, String fieldName);
    String resolveMethod(String className, String methodName);
}
