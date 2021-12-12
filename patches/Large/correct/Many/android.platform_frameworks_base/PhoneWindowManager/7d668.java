diff --git a/services/core/java/com/android/server/policy/PhoneWindowManager.java b/services/core/java/com/android/server/policy/PhoneWindowManager.java
index 7c75f77..9752a57 100644
--- a/services/core/java/com/android/server/policy/PhoneWindowManager.java
+++ b/services/core/java/com/android/server/policy/PhoneWindowManager.java
@@ -2499,7 +2499,7 @@
 
         // check if user has enabled this operation. SecurityException will be thrown if this app
         // has not been allowed by the user
-        final int mode = mAppOpsManager.checkOpNoThrow(outAppOp[0], callingUid, attrs.packageName);
+        final int mode = mAppOpsManager.noteOpNoThrow(outAppOp[0], callingUid, attrs.packageName);
         switch (mode) {
             case AppOpsManager.MODE_ALLOWED:
             case AppOpsManager.MODE_IGNORED:
