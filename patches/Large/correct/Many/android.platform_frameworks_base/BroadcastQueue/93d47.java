diff --git a/services/core/java/com/android/server/am/BroadcastQueue.java b/services/core/java/com/android/server/am/BroadcastQueue.java
index 48d47a7..9b7d0b2 100644
--- a/services/core/java/com/android/server/am/BroadcastQueue.java
+++ b/services/core/java/com/android/server/am/BroadcastQueue.java
@@ -352,7 +352,7 @@
         }
         r.receiver = null;
         r.intent.setComponent(null);
-        if (r.curApp != null) {
+        if (r.curApp != null && r.curApp.curReceiver == r) {
             r.curApp.curReceiver = null;
         }
         if (r.curFilter != null) {
