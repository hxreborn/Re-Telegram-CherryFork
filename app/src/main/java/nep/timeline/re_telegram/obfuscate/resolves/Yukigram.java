package nep.timeline.re_telegram.obfuscate.resolves;

import java.util.Map;

import nep.timeline.re_telegram.obfuscate.ObfuscationResolver;

public final class Yukigram implements ObfuscationResolver {
    public static final Yukigram INSTANCE = new Yukigram();

    private static final Map<String, String> CLASSES = Map.ofEntries(
        Map.entry("org.telegram.messenger.MessagesController", "iz0"),
        Map.entry("org.telegram.messenger.NotificationsController", "bD0"),
        Map.entry("org.telegram.messenger.NotificationCenter", "sC0"),
        Map.entry("org.telegram.messenger.MessagesStorage", "pA0"),
        Map.entry("org.telegram.messenger.MessageObject", "Mw0"),
        Map.entry("org.telegram.messenger.UserConfig", "Zs1"),
        Map.entry("org.telegram.tgnet.TLRPC$Message", "Ng1"),
        Map.entry("org.telegram.tgnet.TLRPC$Peer", "dh1"),
        Map.entry("org.telegram.ui.Cells.ChatMessageCell", "org.telegram.ui.Cells.m"),
        Map.entry("org.telegram.ui.ActionBar.Theme", "Wk1"),
        Map.entry("org.telegram.ui.ChatPullingDownDrawable", "org.telegram.ui.T2"),
        Map.entry("org.telegram.ui.ChatActivity", "org.telegram.ui.G2"),
        Map.entry("org.telegram.ui.DialogsActivity", "org.telegram.ui.j3"),
        Map.entry("org.telegram.ui.Components.FilterTabsView$TouchHelperCallback", "VS"),
        Map.entry("org.telegram.messenger.AndroidUtilities", "x5")
    );

    private static final Map<String, String> FIELDS = Map.ofEntries(
        Map.entry("MessageObject.messageOwner", "a"),
        Map.entry("UserConfig.selectedAccount", "o"),
        Map.entry("Theme.chat_timePaint", "J"),
        Map.entry("NotificationCenter.messagesDeleted", "i"),
        Map.entry("TLRPC$Message.id", "a"),
        Map.entry("TLRPC$TL_updateDeleteMessages.messages", "a"),
        Map.entry("TLRPC$TL_updateDeleteChannelMessages.messages", "a"),
        Map.entry("TLRPC$TL_updateDeleteChannelMessages.channel_id", "a"),
        Map.entry("TLRPC$Message.peer_id", "b"),
        Map.entry("TLRPC$Peer.channel_id", "c"),
        Map.entry("AndroidUtilities.typefaceCache", "a")
    );

    private static final Map<String, String> METHODS = Map.ofEntries(
        Map.entry("ApplicationLoader.onCreate", "n"),
        Map.entry("NotificationsController.removeNotificationsForDialog", "p1"),
        Map.entry("NotificationCenter.postNotificationName", "i"),
        Map.entry("MessagesStorage.markMessagesAsDeleted", "A0"),
        Map.entry("MessagesStorage.updateDialogsWithDeletedMessages", "C1"),
        Map.entry("MessageObject.updateMessageText", "A3"),
        Map.entry("MessagesController.isChatNoForwards", "j1"),
        Map.entry("MessagesController.markDialogMessageAsDeleted", "O1"),
        Map.entry("MessagesController.deleteMessages", "P"),
        Map.entry("MessageObject.canForwardMessage", "o"),
        Map.entry("MessagesController.getInstance", "I0"),
        Map.entry("ChatMessageCell.measureTime", "Z4"),
        Map.entry("UserConfig.getInstance", "g"),
        Map.entry("NotificationsController.removeDeletedMessagesFromNotifications", "D"),
        Map.entry("ChatActivity.addSponsoredMessages", "Kf"),
        Map.entry("ChatActivity.hasSelectedNoforwardsMessage", "Ah"),
        Map.entry("ChatPullingDownDrawable.getNextUnreadDialog", "g"),
        Map.entry("ChatPullingDownDrawable.drawBottomPanel", "f"),
        Map.entry("ChatPullingDownDrawable.draw", "e"),
        Map.entry("ChatPullingDownDrawable.showBottomPanel", "l"),
        Map.entry("DialogsActivity.onDefaultTabMoved", "C0"),
        Map.entry("FilterTabsView$TouchHelperCallback.onSelectedChanged", "run"),
        Map.entry("AndroidUtilities.getTypeface", "K0")
    );

    private Yukigram() {}

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
