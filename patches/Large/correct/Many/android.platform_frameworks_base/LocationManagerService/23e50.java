diff --git a/services/java/com/android/server/LocationManagerService.java b/services/java/com/android/server/LocationManagerService.java
index 62f9965..c52966a 100644
--- a/services/java/com/android/server/LocationManagerService.java
+++ b/services/java/com/android/server/LocationManagerService.java
@@ -1449,7 +1449,7 @@
         final int uid = Binder.getCallingUid();
         final long ident = Binder.clearCallingIdentity();
         try {
-            if (checkLocationAccess(uid, packageName, allowedResolutionLevel)) {
+            if (!checkLocationAccess(uid, packageName, allowedResolutionLevel)) {
                 return false;
             }
         } finally {
