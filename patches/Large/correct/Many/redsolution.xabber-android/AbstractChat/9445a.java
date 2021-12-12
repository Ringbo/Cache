diff --git a/xabber/src/main/java/com/xabber/android/data/message/AbstractChat.java b/xabber/src/main/java/com/xabber/android/data/message/AbstractChat.java
index 898c7cd..9186801 100644
--- a/xabber/src/main/java/com/xabber/android/data/message/AbstractChat.java
+++ b/xabber/src/main/java/com/xabber/android/data/message/AbstractChat.java
@@ -347,7 +347,7 @@
         if (notify && notifyAboutMessage()) {
             if (visible) {
                 if (ChatManager.getInstance().isNotifyVisible(account, user)) {
-                    NotificationManager.getInstance().onCurrentChatMessageNotification(messageItem);
+                    NotificationManager.getInstance().onMessageNotification(messageItem);
                 }
             } else {
                 NotificationManager.getInstance().onMessageNotification(messageItem);
