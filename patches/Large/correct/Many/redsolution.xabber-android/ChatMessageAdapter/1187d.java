diff --git a/xabber/src/main/java/com/xabber/android/ui/adapter/ChatMessageAdapter.java b/xabber/src/main/java/com/xabber/android/ui/adapter/ChatMessageAdapter.java
index 7236085..c57c08b 100644
--- a/xabber/src/main/java/com/xabber/android/ui/adapter/ChatMessageAdapter.java
+++ b/xabber/src/main/java/com/xabber/android/ui/adapter/ChatMessageAdapter.java
@@ -371,7 +371,7 @@
                     if ("".equals(resource)) {
                         message.avatar.setImageDrawable(AvatarManager.getInstance().getRoomAvatar(user));
                     } else {
-                        message.avatar.setImageDrawable(AvatarManager.getInstance().getOccupantAvatar(user + "/" + resource));
+                        message.avatar.setImageDrawable(AvatarManager.getInstance().getUserAvatar(user + "/" + resource));
                     }
                 } else {
                     message.avatar.setImageDrawable(AvatarManager.getInstance().getUserAvatar(user));
