diff --git a/actor-sdk/sdk-core/core/core-shared/src/main/java/im/actor/core/Messenger.java b/actor-sdk/sdk-core/core/core-shared/src/main/java/im/actor/core/Messenger.java
index a32b85f..db36197 100644
--- a/actor-sdk/sdk-core/core/core-shared/src/main/java/im/actor/core/Messenger.java
+++ b/actor-sdk/sdk-core/core/core-shared/src/main/java/im/actor/core/Messenger.java
@@ -601,7 +601,7 @@
      */
     @ObjectiveCName("sendMessageWithPeer:withText:")
     public void sendMessage(@NotNull Peer peer, @NotNull String text) {
-        sendMessage(peer, text, null, null, false);
+        sendMessage(peer, text, null, null, true);
     }
 
     /**
