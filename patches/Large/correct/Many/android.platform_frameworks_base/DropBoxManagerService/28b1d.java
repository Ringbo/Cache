diff --git a/services/core/java/com/android/server/DropBoxManagerService.java b/services/core/java/com/android/server/DropBoxManagerService.java
index 2454487..421a8a5 100644
--- a/services/core/java/com/android/server/DropBoxManagerService.java
+++ b/services/core/java/com/android/server/DropBoxManagerService.java
@@ -607,7 +607,7 @@
             this.flags = flags;
 
             long millis;
-            try { millis = Long.valueOf(name); } catch (NumberFormatException e) { millis = 0; }
+            try { millis = Long.parseLong(name); } catch (NumberFormatException e) { millis = 0; }
             this.timestampMillis = millis;
         }
 
