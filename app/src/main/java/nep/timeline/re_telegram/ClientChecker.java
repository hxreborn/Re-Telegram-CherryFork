package nep.timeline.re_telegram;

import java.util.Arrays;

import nep.timeline.re_telegram.obfuscate.ObfuscationResolver;

public class ClientChecker {
    public static boolean check(ClientType client, String pkgName) {
        return Arrays.asList(client.packageNames).contains(pkgName);
    }

    public static boolean check(ClientType client) {
        return check(client, Utils.pkgName);
    }

    public enum ClientType {
        Nekogram("tw.nekomimi.nekogram"),
        Cherrygram("uz.unnarsx.cherrygram"),
        Yukigram("me.onlyfire.yukigram.beta"),
        MDgram(new String[]{"org.telegram.mdgram"});

        private final String[] packageNames;
        private ObfuscationResolver lookup;

        // FQN required: enum constants shadow the resolver class names
        static {
            Nekogram.lookup = nep.timeline.re_telegram.obfuscate.resolves.Nekogram.INSTANCE;
            Cherrygram.lookup = nep.timeline.re_telegram.obfuscate.resolves.Cherrygram.INSTANCE;
            Yukigram.lookup = nep.timeline.re_telegram.obfuscate.resolves.Yukigram.INSTANCE;
        }

        ClientType(String packageName) {
            this.packageNames = new String[]{packageName};
        }

        ClientType(String[] packageNames) {
            this.packageNames = packageNames;
        }

        public String[] getPackageNames() {
            return packageNames;
        }

        public ObfuscationResolver getLookup() {
            return lookup;
        }

        public static ClientType fromPackage(String pkgName) {
            return Arrays.stream(values())
                .filter(t -> Arrays.asList(t.packageNames).contains(pkgName))
                .findFirst()
                .orElse(null);
        }
    }
}
