package nep.timeline.re_telegram.obfuscate;

import nep.timeline.re_telegram.ClientChecker.ClientType;
import nep.timeline.re_telegram.Utils;

public final class AutomationResolver {

    private AutomationResolver() {}

    public static String resolve(String className) {
        var lookup = getLookup();
        if (lookup == null) return className;
        var resolved = lookup.resolveClass(className);
        return resolved != null ? resolved : className;
    }

    public static String resolve(String className, String name, ResolverType type) {
        var lookup = getLookup();
        if (lookup == null) return name;
        var resolved = type == ResolverType.Field
            ? lookup.resolveField(className, name)
            : lookup.resolveMethod(className, name);
        return resolved != null ? resolved : name;
    }

    // Compatibility overloads
    public static String resolve(String className, String pkgName) {
        return resolve(className);
    }

    public static String resolve(String className, String name, ResolverType type, String pkgName) {
        return resolve(className, name, type);
    }

    private static ObfuscationResolver getLookup() {
        var client = ClientType.fromPackage(Utils.pkgName);
        return client != null ? client.getLookup() : null;
    }

    public enum ResolverType {
        Field, Method
    }
}
