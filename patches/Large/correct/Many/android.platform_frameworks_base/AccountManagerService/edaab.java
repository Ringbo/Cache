diff --git a/services/core/java/com/android/server/accounts/AccountManagerService.java b/services/core/java/com/android/server/accounts/AccountManagerService.java
index 7c12577d..42d17f8 100644
--- a/services/core/java/com/android/server/accounts/AccountManagerService.java
+++ b/services/core/java/com/android/server/accounts/AccountManagerService.java
@@ -3899,7 +3899,12 @@
                 ResolveInfo resolveInfo = pm.resolveActivityAsUser(intent, 0, mAccounts.userId);
                 ActivityInfo targetActivityInfo = resolveInfo.activityInfo;
                 int targetUid = targetActivityInfo.applicationInfo.uid;
-                if (PackageManager.SIGNATURE_MATCH != pm.checkSignatures(authUid, targetUid)) {
+                if (!GrantCredentialsPermissionActivity.class.getName().equals(
+                        targetActivityInfo.getClass().getName())
+                        && !CantAddAccountActivity.class
+                                .equals(targetActivityInfo.getClass().getName())
+                        && PackageManager.SIGNATURE_MATCH != pm.checkSignatures(authUid,
+                                targetUid)) {
                     String pkgName = targetActivityInfo.packageName;
                     String activityName = targetActivityInfo.name;
                     String tmpl = "KEY_INTENT resolved to an Activity (%s) in a package (%s) that "
