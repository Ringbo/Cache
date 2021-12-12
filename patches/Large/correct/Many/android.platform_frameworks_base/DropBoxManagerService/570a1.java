diff --git a/services/core/java/com/android/server/DropBoxManagerService.java b/services/core/java/com/android/server/DropBoxManagerService.java
index a44cb72..3cf00bb 100644
--- a/services/core/java/com/android/server/DropBoxManagerService.java
+++ b/services/core/java/com/android/server/DropBoxManagerService.java
@@ -567,7 +567,7 @@
             this.flags = flags;
 
             long millis;
-            try { millis = Long.valueOf(name); } catch (NumberFormatException e) { millis = 0; }
+            try { millis = Long.parseLong(name); } catch (NumberFormatException e) { millis = 0; }
             this.timestampMillis = millis;
         }
 
