diff --git a/services/core/java/com/android/server/LockSettingsService.java b/services/core/java/com/android/server/LockSettingsService.java
index fbcb62a..3c529ba 100644
--- a/services/core/java/com/android/server/LockSettingsService.java
+++ b/services/core/java/com/android/server/LockSettingsService.java
@@ -1398,7 +1398,7 @@
             return VerifyCredentialResponse.OK;
         }
 
-        if (TextUtils.isEmpty(credential)) {
+        if (storedHash == null || TextUtils.isEmpty(credential)) {
             return VerifyCredentialResponse.ERROR;
         }
 
