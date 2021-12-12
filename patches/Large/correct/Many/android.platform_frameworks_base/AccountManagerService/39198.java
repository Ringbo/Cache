diff --git a/services/core/java/com/android/server/accounts/AccountManagerService.java b/services/core/java/com/android/server/accounts/AccountManagerService.java
index 7e90c92..c617616 100644
--- a/services/core/java/com/android/server/accounts/AccountManagerService.java
+++ b/services/core/java/com/android/server/accounts/AccountManagerService.java
@@ -5285,7 +5285,7 @@
                         == PackageManager.PERMISSION_GRANTED) {
                     // Checks runtime permission revocation.
                     final int opCode = AppOpsManager.permissionToOpCode(perm);
-                    if (opCode == AppOpsManager.OP_NONE || mAppOpsManager.noteOp(
+                    if (opCode == AppOpsManager.OP_NONE || mAppOpsManager.noteOpNoThrow(
                             opCode, uid, packageName) == AppOpsManager.MODE_ALLOWED) {
                         return true;
                     }
@@ -5306,7 +5306,7 @@
                     Log.v(TAG, "  caller uid " + callingUid + " has " + perm);
                 }
                 final int opCode = AppOpsManager.permissionToOpCode(perm);
-                if (opCode == AppOpsManager.OP_NONE || mAppOpsManager.noteOp(
+                if (opCode == AppOpsManager.OP_NONE || mAppOpsManager.noteOpNoThrow(
                         opCode, callingUid, opPackageName) == AppOpsManager.MODE_ALLOWED) {
                     return true;
                 }
