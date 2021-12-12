diff --git a/services/print/java/com/android/server/print/PrintManagerService.java b/services/print/java/com/android/server/print/PrintManagerService.java
index 0575a5e..7400dde 100644
--- a/services/print/java/com/android/server/print/PrintManagerService.java
+++ b/services/print/java/com/android/server/print/PrintManagerService.java
@@ -734,7 +734,7 @@
             }
             if (mContext.checkCallingPermission(Manifest.permission.INTERACT_ACROSS_USERS_FULL)
                     != PackageManager.PERMISSION_GRANTED
-                ||  mContext.checkCallingPermission(Manifest.permission.INTERACT_ACROSS_USERS)
+                &&  mContext.checkCallingPermission(Manifest.permission.INTERACT_ACROSS_USERS)
                     != PackageManager.PERMISSION_GRANTED) {
                 if (userId == UserHandle.USER_CURRENT_OR_SELF) {
                     return callingUserId;
@@ -746,8 +746,7 @@
             if (userId == UserHandle.USER_CURRENT || userId == UserHandle.USER_CURRENT_OR_SELF) {
                 return mCurrentUserId;
             }
-            throw new IllegalArgumentException("Calling user can be changed to only "
-                    + "UserHandle.USER_CURRENT or UserHandle.USER_CURRENT_OR_SELF.");
+            return userId;
         }
 
         private String resolveCallingPackageNameEnforcingSecurity(String packageName) {
