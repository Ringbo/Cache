diff --git a/services/core/java/com/android/server/NetworkScoreService.java b/services/core/java/com/android/server/NetworkScoreService.java
index 22dbf44..5fe8b1a 100644
--- a/services/core/java/com/android/server/NetworkScoreService.java
+++ b/services/core/java/com/android/server/NetworkScoreService.java
@@ -927,7 +927,7 @@
                 try {
                     for (int i = 0; i < count; i++) {
                         consumer.accept(callbackList.getBroadcastItem(i),
-                                callbackList.getRegisteredCallbackCookie(i));
+                                callbackList.getBroadcastCookie(i));
                     }
                 } finally {
                     callbackList.finishBroadcast();
