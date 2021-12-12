diff --git a/services/java/com/android/server/LockSettingsService.java b/services/java/com/android/server/LockSettingsService.java
index cd746cf..35e7afa 100644
--- a/services/java/com/android/server/LockSettingsService.java
+++ b/services/java/com/android/server/LockSettingsService.java
@@ -154,11 +154,11 @@
     }
 
     private final void checkWritePermission(int userId) {
-        mContext.checkCallingOrSelfPermission(PERMISSION);
+        mContext.enforceCallingOrSelfPermission(PERMISSION, "LockSettingsWrite");
     }
 
     private final void checkPasswordReadPermission(int userId) {
-        mContext.checkCallingOrSelfPermission(PERMISSION);
+        mContext.enforceCallingOrSelfPermission(PERMISSION, "LockSettingsRead");
     }
 
     private final void checkReadPermission(String requestedKey, int userId) {
