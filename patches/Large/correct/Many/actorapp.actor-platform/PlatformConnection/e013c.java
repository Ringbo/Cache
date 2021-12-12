diff --git a/library/actor-js/src/main/java/im/actor/model/js/providers/websocket/PlatformConnection.java b/library/actor-js/src/main/java/im/actor/model/js/providers/websocket/PlatformConnection.java
index 2a979a0..de4affb 100644
--- a/library/actor-js/src/main/java/im/actor/model/js/providers/websocket/PlatformConnection.java
+++ b/library/actor-js/src/main/java/im/actor/model/js/providers/websocket/PlatformConnection.java
@@ -60,7 +60,7 @@
             Log.d(TAG, "onConnected:isClosed");
             return;
         }
-        if (!isOpened) {
+        if (isOpened) {
             Log.d(TAG, "onConnected:isOpened");
             return;
         }
