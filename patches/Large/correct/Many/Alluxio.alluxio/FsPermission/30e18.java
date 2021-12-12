diff --git a/common/src/main/java/tachyon/security/authorization/FsPermission.java b/common/src/main/java/tachyon/security/authorization/FsPermission.java
index 3b701ce..b992f13 100644
--- a/common/src/main/java/tachyon/security/authorization/FsPermission.java
+++ b/common/src/main/java/tachyon/security/authorization/FsPermission.java
@@ -148,8 +148,7 @@
   public static FsPermission getUMask(TachyonConf conf) {
     int umask = Constants.DEFAULT_TFS_PERMISSIONS_UMASK;
     if (conf != null) {
-      umask = conf.getInt(Constants.TFS_PERMISSIONS_UMASK_KEY,
-          Constants.DEFAULT_TFS_PERMISSIONS_UMASK);
+      umask = conf.getInt(Constants.TFS_PERMISSIONS_UMASK_KEY);
     }
     return new FsPermission((short)umask);
   }
