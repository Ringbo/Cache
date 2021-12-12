diff --git a/services/core/java/com/android/server/power/PowerManagerService.java b/services/core/java/com/android/server/power/PowerManagerService.java
index 4d1ab4c..9786b42 100644
--- a/services/core/java/com/android/server/power/PowerManagerService.java
+++ b/services/core/java/com/android/server/power/PowerManagerService.java
@@ -2375,9 +2375,9 @@
             //
             // This preparation can take more than 20 seconds if
             // there's a very large update package, so lengthen the
-            // timeout.
+            // timeout.  We have seen 750MB packages take 3-4 minutes
             SystemProperties.set("ctl.start", "pre-recovery");
-            duration = 120 * 1000L;
+            duration = 300 * 1000L;
         } else {
             SystemProperties.set("sys.powerctl", "reboot," + reason);
             duration = 20 * 1000L;
