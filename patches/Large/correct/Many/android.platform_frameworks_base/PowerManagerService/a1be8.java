diff --git a/services/core/java/com/android/server/power/PowerManagerService.java b/services/core/java/com/android/server/power/PowerManagerService.java
index 9786b42..9371222 100644
--- a/services/core/java/com/android/server/power/PowerManagerService.java
+++ b/services/core/java/com/android/server/power/PowerManagerService.java
@@ -2357,7 +2357,7 @@
     /**
      * Low-level function to reboot the device. On success, this
      * function doesn't return. If more than 20 seconds passes from
-     * the time a reboot is requested (120 seconds for reboot to
+     * the time a reboot is requested (900 seconds for reboot to
      * recovery), this method returns.
      *
      * @param reason code to pass to the kernel (e.g. "recovery"), or null.
@@ -2375,9 +2375,11 @@
             //
             // This preparation can take more than 20 seconds if
             // there's a very large update package, so lengthen the
-            // timeout.  We have seen 750MB packages take 3-4 minutes
+            // timeout.  We have seen 750MB packages take 3-4 minutes.
+            // Bump up the limit again to 900s for really large packages.
+            // Bug: 23629892.
             SystemProperties.set("ctl.start", "pre-recovery");
-            duration = 300 * 1000L;
+            duration = 900 * 1000L;
         } else {
             SystemProperties.set("sys.powerctl", "reboot," + reason);
             duration = 20 * 1000L;
