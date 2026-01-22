package nep.timeline.re_telegram.obfuscate.resolves;

import java.util.Map;

import nep.timeline.re_telegram.obfuscate.ObfuscationResolver;

public final class Nekogram implements ObfuscationResolver {
    public static final Nekogram INSTANCE = new Nekogram();

    private static final Map<String, String> CLASSES = Map.ofEntries(
        Map.entry("org.telegram.messenger.ApplicationLoader", "org.telegram.messenger.b"),
        Map.entry("org.telegram.messenger.NotificationsController", "org.telegram.messenger.J"),
        Map.entry("org.telegram.messenger.NotificationCenter", "org.telegram.messenger.I"),
        Map.entry("org.telegram.messenger.DownloadController", "org.telegram.messenger.m"),
        Map.entry("org.telegram.messenger.MessagesController", "org.telegram.messenger.G"),
        Map.entry("org.telegram.messenger.MessagesStorage", "org.telegram.messenger.H"),
        Map.entry("org.telegram.messenger.MessageObject", "org.telegram.messenger.E"),
        Map.entry("org.telegram.messenger.UserConfig", "org.telegram.messenger.W"),
        Map.entry("org.telegram.ui.Cells.ChatMessageCell", "X50"),
        Map.entry("org.telegram.ui.ActionBar.Theme", "org.telegram.ui.ActionBar.q"),
        Map.entry("org.telegram.ui.ChatActivity", "org.telegram.ui.p"),
        Map.entry("org.telegram.messenger.AndroidUtilities", "org.telegram.messenger.a"),
        Map.entry("org.telegram.tgnet.TLRPC$Peer", "BI3"),
        Map.entry("org.telegram.tgnet.TLRPC$Message", "aA3"),
        Map.entry("org.telegram.tgnet.TLRPC$TL_updateDeleteMessages", "Hj4"),
        Map.entry("org.telegram.tgnet.TLRPC$TL_updateDeleteChannelMessages", "Gj4")
    );

    private static final Map<String, String> FIELDS = Map.ofEntries(
        Map.entry("UserConfig.selectedAccount", "b0"),
        Map.entry("TLRPC$User.id", "a"),
        Map.entry("TLRPC$Peer.channel_id", "c"),
        Map.entry("TLRPC$Message.id", "a"),
        Map.entry("TLRPC$Message.flags", "k"),
        Map.entry("TLRPC$Message.peer_id", "d"),
        Map.entry("TLRPC$TL_updateDeleteMessages.messages", "a"),
        Map.entry("TLRPC$TL_updateDeleteChannelMessages.channel_id", "a"),
        Map.entry("TLRPC$TL_updateDeleteChannelMessages.messages", "b"),
        Map.entry("Theme.chat_timePaint", "K2"),
        Map.entry("MessagesController.dialogMessagesByIds", "G"),
        Map.entry("MessagesController.dialogMessage", "D"),
        Map.entry("NotificationCenter.messagesDeleted", "v"),
        Map.entry("AndroidUtilities.typefaceCache", "d")
    );

    private static final Map<String, String> METHODS = Map.ofEntries(
        Map.entry("NotificationCenter.postNotificationName", "L"),
        Map.entry("DownloadController.canDownloadMedia", "r"),
        Map.entry("MessagesStorage.markMessagesAsDeletedInternal", "t8"),
        Map.entry("MessagesStorage.updateDialogsWithDeletedMessagesInternal", "Pc"),
        Map.entry("MessagesStorage.getDatabase", "a5"),
        Map.entry("MessageObject.updateMessageText", "M6"),
        Map.entry("MessageObject.canForwardMessage", "K"),
        Map.entry("MessageObject.getDialogId", "G0"),
        Map.entry("MessagesController.isChatNoForwards", "Ab"),
        Map.entry("MessagesController.markDialogMessageAsDeleted", "ol"),
        Map.entry("MessagesController.deleteMessages", "W8"),
        Map.entry("MessagesController.getSponsoredMessages", "Ta"),
        Map.entry("ChatMessageCell.measureTime", "h7"),
        Map.entry("ChatMessageCell.setVisibleOnScreen", "h8"),
        Map.entry("UserConfig.getInstance", "s"),
        Map.entry("NotificationsController.removeNotificationsForDialog", "c2"),
        Map.entry("NotificationsController.removeDeletedMessagesFromNotifications", "b2"),
        Map.entry("ChatActivity.addSponsoredMessages", "gq"),
        Map.entry("ChatActivity.hasSelectedNoforwardsMessage", "ot"),
        Map.entry("AndroidUtilities.getTypeface", "a2"),
        Map.entry("SQLiteDatabase.queryFinalized", "h"),
        Map.entry("SQLiteDatabase.executeFast", "e"),
        Map.entry("SQLiteCursor.next", "j"),
        Map.entry("SQLiteCursor.byteBufferValue", "b"),
        Map.entry("SQLiteCursor.intValue", "g"),
        Map.entry("SQLiteCursor.longValue", "i"),
        Map.entry("SQLiteCursor.dispose", "d"),
        Map.entry("SQLitePreparedStatement.dispose", "h"),
        Map.entry("SQLitePreparedStatement.requery", "l"),
        Map.entry("SQLitePreparedStatement.bindByteBuffer", "a"),
        Map.entry("SQLitePreparedStatement.bindLong", "d"),
        Map.entry("SQLitePreparedStatement.bindInteger", "c"),
        Map.entry("SQLitePreparedStatement.step", "m"),
        Map.entry("LongSparseArray.get", "h")
    );

    private Nekogram() {}

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
