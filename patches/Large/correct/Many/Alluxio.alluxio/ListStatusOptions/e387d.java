diff --git a/core/client/fs/src/main/java/alluxio/client/file/options/ListStatusOptions.java b/core/client/fs/src/main/java/alluxio/client/file/options/ListStatusOptions.java
index b73cfe6..9747d74 100644
--- a/core/client/fs/src/main/java/alluxio/client/file/options/ListStatusOptions.java
+++ b/core/client/fs/src/main/java/alluxio/client/file/options/ListStatusOptions.java
@@ -45,7 +45,7 @@
 
   private ListStatusOptions() {
     mCommonOptions = CommonOptions.defaults()
-        .setTtl(Configuration.getLong(PropertyKey.USER_FILE_LOAD_TTL))
+        .setTtl(Configuration.getMs(PropertyKey.USER_FILE_LOAD_TTL))
         .setTtlAction(Configuration.getEnum(PropertyKey.USER_FILE_LOAD_TTL_ACTION,
             TtlAction.class));
     mLoadMetadataType =
