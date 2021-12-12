diff --git a/services/core/java/com/android/server/LockSettingsService.java b/services/core/java/com/android/server/LockSettingsService.java
index 34c73d2..c946d09 100644
--- a/services/core/java/com/android/server/LockSettingsService.java
+++ b/services/core/java/com/android/server/LockSettingsService.java
@@ -1488,7 +1488,7 @@
             return VerifyCredentialResponse.OK;
         }
 
-        if (TextUtils.isEmpty(credential)) {
+        if (storedHash == null || TextUtils.isEmpty(credential)) {
             return VerifyCredentialResponse.ERROR;
         }
 
