diff --git a/core/client/fs/src/main/java/alluxio/client/file/options/GetStatusOptions.java b/core/client/fs/src/main/java/alluxio/client/file/options/GetStatusOptions.java
index fc22376..f4c3cff 100644
--- a/core/client/fs/src/main/java/alluxio/client/file/options/GetStatusOptions.java
+++ b/core/client/fs/src/main/java/alluxio/client/file/options/GetStatusOptions.java
@@ -44,7 +44,7 @@
 
   private GetStatusOptions() {
     mCommonOptions = CommonOptions.defaults()
-        .setTtl(Configuration.getLong(PropertyKey.USER_FILE_LOAD_TTL))
+        .setTtl(Configuration.getMs(PropertyKey.USER_FILE_LOAD_TTL))
         .setTtlAction(Configuration.getEnum(PropertyKey.USER_FILE_LOAD_TTL_ACTION,
             TtlAction.class));
     mLoadMetadataType =
