diff --git a/services/core/java/com/android/server/TelephonyRegistry.java b/services/core/java/com/android/server/TelephonyRegistry.java
index a06bb30..19a4851 100644
--- a/services/core/java/com/android/server/TelephonyRegistry.java
+++ b/services/core/java/com/android/server/TelephonyRegistry.java
@@ -362,10 +362,10 @@
         }
 
         try {
-            mContext.enforceCallingPermission(
+            mContext.enforceCallingOrSelfPermission(
                     android.Manifest.permission.READ_PRIVILEGED_PHONE_STATE,
                     "addOnSubscriptionsChangedListener");
-            // SKIP checking for run-time permission since obtained PRIVILEGED
+            // SKIP checking for run-time permission since caller or self has PRIVILEGED permission
         } catch (SecurityException e) {
             mContext.enforceCallingOrSelfPermission(
                     android.Manifest.permission.READ_PHONE_STATE,
@@ -481,9 +481,10 @@
 
             if ((events & ENFORCE_PHONE_STATE_PERMISSION_MASK) != 0) {
                 try {
-                    mContext.enforceCallingPermission(
+                    mContext.enforceCallingOrSelfPermission(
                             android.Manifest.permission.READ_PRIVILEGED_PHONE_STATE, null);
-                    // SKIP checking for run-time permission since obtained PRIVILEGED
+                    // SKIP checking for run-time permission since caller or self has PRIVILEGED
+                    // permission
                 } catch (SecurityException e) {
                     if (mAppOps.noteOp(AppOpsManager.OP_READ_PHONE_STATE, Binder.getCallingUid(),
                             callingPackage) != AppOpsManager.MODE_ALLOWED) {
@@ -661,10 +662,10 @@
     }
 
     private boolean canReadPhoneState(String callingPackage) {
-        if (mContext.checkCallingPermission(
+        if (mContext.checkCallingOrSelfPermission(
                 android.Manifest.permission.READ_PRIVILEGED_PHONE_STATE) ==
                 PackageManager.PERMISSION_GRANTED) {
-            // SKIP checking for run-time permission since obtained PRIVILEGED
+            // SKIP checking for run-time permission since caller or self has PRIVILEGED permission
             return true;
         }
         boolean canReadPhoneState = mContext.checkCallingOrSelfPermission(
@@ -1589,9 +1590,10 @@
 
         if ((events & ENFORCE_PHONE_STATE_PERMISSION_MASK) != 0) {
             try {
-                mContext.enforceCallingPermission(
+                mContext.enforceCallingOrSelfPermission(
                         android.Manifest.permission.READ_PRIVILEGED_PHONE_STATE, null);
-                // SKIP checking for run-time permission since obtained PRIVILEGED
+                // SKIP checking for run-time permission since caller or self has PRIVILEGED
+                // permission
             } catch (SecurityException e) {
                 mContext.enforceCallingOrSelfPermission(
                         android.Manifest.permission.READ_PHONE_STATE, null);
