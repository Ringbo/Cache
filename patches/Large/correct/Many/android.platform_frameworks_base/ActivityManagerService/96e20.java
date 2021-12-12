diff --git a/services/core/java/com/android/server/am/ActivityManagerService.java b/services/core/java/com/android/server/am/ActivityManagerService.java
index 927a7b6..d8724b2 100644
--- a/services/core/java/com/android/server/am/ActivityManagerService.java
+++ b/services/core/java/com/android/server/am/ActivityManagerService.java
@@ -20453,8 +20453,8 @@
 
     @Override
     public boolean isUserRunning(int userId, int flags) {
-        if (checkCallingPermission(INTERACT_ACROSS_USERS)
-                != PackageManager.PERMISSION_GRANTED) {
+        if (userId != UserHandle.getCallingUserId() && checkCallingPermission(
+                INTERACT_ACROSS_USERS) != PackageManager.PERMISSION_GRANTED) {
             String msg = "Permission Denial: isUserRunning() from pid="
                     + Binder.getCallingPid()
                     + ", uid=" + Binder.getCallingUid()
