diff --git a/core/common/src/main/java/alluxio/security/authorization/PermissionStatus.java b/core/common/src/main/java/alluxio/security/authorization/PermissionStatus.java
index 0ce7b8d..cff3cb9 100644
--- a/core/common/src/main/java/alluxio/security/authorization/PermissionStatus.java
+++ b/core/common/src/main/java/alluxio/security/authorization/PermissionStatus.java
@@ -90,7 +90,7 @@
    * @see FileSystemPermission#applyUMask(FileSystemPermission)
    */
   public PermissionStatus applyUMask(FileSystemPermission umask, Configuration configuration) {
-    if (!SecurityUtils.isSecurityEnabled(configuration)) {
+    if (!SecurityUtils.isAuthorizationEnabled(configuration)) {
       return new PermissionStatus(mUserName, mGroupName, mPermission);
     }
     FileSystemPermission newFileSystemPermission = mPermission.applyUMask(umask);
