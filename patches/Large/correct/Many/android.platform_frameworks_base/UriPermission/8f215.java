diff --git a/services/core/java/com/android/server/am/UriPermission.java b/services/core/java/com/android/server/am/UriPermission.java
index 284086d..91daf77 100644
--- a/services/core/java/com/android/server/am/UriPermission.java
+++ b/services/core/java/com/android/server/am/UriPermission.java
@@ -180,7 +180,7 @@
     /**
      * @return if mode changes should trigger persisting.
      */
-    boolean revokeModes(int modeFlags) {
+    boolean revokeModes(int modeFlags, boolean includingOwners) {
         final boolean persistable = (modeFlags & Intent.FLAG_GRANT_PERSISTABLE_URI_PERMISSION) != 0;
         modeFlags &= (Intent.FLAG_GRANT_READ_URI_PERMISSION
                 | Intent.FLAG_GRANT_WRITE_URI_PERMISSION);
@@ -193,7 +193,7 @@
                 persistedModeFlags &= ~Intent.FLAG_GRANT_READ_URI_PERMISSION;
             }
             globalModeFlags &= ~Intent.FLAG_GRANT_READ_URI_PERMISSION;
-            if (mReadOwners != null) {
+            if (mReadOwners != null && includingOwners) {
                 ownedModeFlags &= ~Intent.FLAG_GRANT_READ_URI_PERMISSION;
                 for (UriPermissionOwner r : mReadOwners) {
                     r.removeReadPermission(this);
@@ -207,7 +207,7 @@
                 persistedModeFlags &= ~Intent.FLAG_GRANT_WRITE_URI_PERMISSION;
             }
             globalModeFlags &= ~Intent.FLAG_GRANT_WRITE_URI_PERMISSION;
-            if (mWriteOwners != null) {
+            if (mWriteOwners != null && includingOwners) {
                 ownedModeFlags &= ~Intent.FLAG_GRANT_WRITE_URI_PERMISSION;
                 for (UriPermissionOwner r : mWriteOwners) {
                     r.removeWritePermission(this);
