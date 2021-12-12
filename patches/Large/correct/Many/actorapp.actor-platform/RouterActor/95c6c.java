diff --git a/actor-sdk/sdk-core/core/core-shared/src/main/java/im/actor/core/modules/messaging/router/RouterActor.java b/actor-sdk/sdk-core/core/core-shared/src/main/java/im/actor/core/modules/messaging/router/RouterActor.java
index 81f76a7..887e33d 100644
--- a/actor-sdk/sdk-core/core/core-shared/src/main/java/im/actor/core/modules/messaging/router/RouterActor.java
+++ b/actor-sdk/sdk-core/core/core-shared/src/main/java/im/actor/core/modules/messaging/router/RouterActor.java
@@ -740,7 +740,7 @@
             UpdateMessageRead read = (UpdateMessageRead) update;
             Peer peer = convert(read.getPeer());
             if (isValidPeer(peer)) {
-                onMessageRead(peer, read.getReadDate());
+                onMessageRead(peer, read.getStartDate());
             }
             return Promise.success(null);
         } else if (update instanceof UpdateMessageReadByMe) {
