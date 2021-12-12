diff --git a/services/java/com/android/server/power/PowerManagerService.java b/services/java/com/android/server/power/PowerManagerService.java
index cb6db3c..1a5f233 100644
--- a/services/java/com/android/server/power/PowerManagerService.java
+++ b/services/java/com/android/server/power/PowerManagerService.java
@@ -426,7 +426,7 @@
                     }
 
                     // stop the screensaver if we're now unplugged
-                    if (mPolicy != null) {
+                    if (mPolicy != null && wasPowered) {
                         mPolicy.stopScreenSaver();
                     }
                 }
