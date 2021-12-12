diff --git a/core/java/android/os/BatteryStats.java b/core/java/android/os/BatteryStats.java
index 77e4808..dc271d8 100644
--- a/core/java/android/os/BatteryStats.java
+++ b/core/java/android/os/BatteryStats.java
@@ -235,8 +235,11 @@
      * New in version 29:
      *   - Process states re-ordered. TOP_SLEEPING now below BACKGROUND. HEAVY_WEIGHT introduced.
      *   - CPU times per UID process state
+     * New in version 30:
+     *   - Uid.PROCESS_STATE_FOREGROUND_SERVICE only tracks
+     *   ActivityManager.PROCESS_STATE_FOREGROUND_SERVICE.
      */
-    static final int CHECKIN_VERSION = 29;
+    static final int CHECKIN_VERSION = 30;
 
     /**
      * Old version, we hit 9 and ran out of room, need to remove.
@@ -694,17 +697,17 @@
         // total time a uid has had any processes running at all.
 
         /**
-         * Time this uid has any processes in the top state (or above such as persistent).
+         * Time this uid has any processes in the top state.
          */
         public static final int PROCESS_STATE_TOP = 0;
         /**
-         * Time this uid has any process with a started out bound foreground service, but
+         * Time this uid has any process with a started foreground service, but
          * none in the "top" state.
          */
         public static final int PROCESS_STATE_FOREGROUND_SERVICE = 1;
         /**
          * Time this uid has any process in an active foreground state, but none in the
-         * "top sleeping" or better state.
+         * "foreground service" or better state. Persistent and other foreground states go here.
          */
         public static final int PROCESS_STATE_FOREGROUND = 2;
         /**
