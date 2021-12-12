diff --git a/services/java/com/android/server/am/UriPermission.java b/services/java/com/android/server/am/UriPermission.java
index e3347cb..c5b1c7b 100644
--- a/services/java/com/android/server/am/UriPermission.java
+++ b/services/java/com/android/server/am/UriPermission.java
@@ -59,11 +59,11 @@
         if ((modeFlagsToClear&Intent.FLAG_GRANT_WRITE_URI_PERMISSION) != 0) {
             globalModeFlags &= ~Intent.FLAG_GRANT_WRITE_URI_PERMISSION;
             modeFlags &= ~Intent.FLAG_GRANT_WRITE_URI_PERMISSION;
-            if (readOwners.size() > 0) {
+            if (writeOwners.size() > 0) {
                 for (UriPermissionOwner r : writeOwners) {
                     r.removeWritePermission(this);
                 }
-                readOwners.clear();
+                writeOwners.clear();
             }
         }
     }
