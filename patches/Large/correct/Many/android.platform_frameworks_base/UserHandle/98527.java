diff --git a/core/java/android/os/UserHandle.java b/core/java/android/os/UserHandle.java
index 5be72bc..094f004 100644
--- a/core/java/android/os/UserHandle.java
+++ b/core/java/android/os/UserHandle.java
@@ -158,7 +158,7 @@
      * @hide
      */
     public static boolean isCore(int uid) {
-        if (uid > 0) {
+        if (uid >= 0) {
             final int appId = getAppId(uid);
             return appId < Process.FIRST_APPLICATION_UID;
         } else {
