diff --git a/core/server/master/src/main/java/alluxio/master/file/options/SyncMetadataOptions.java b/core/server/master/src/main/java/alluxio/master/file/options/SyncMetadataOptions.java
index 4a83f68..bb1a69a 100644
--- a/core/server/master/src/main/java/alluxio/master/file/options/SyncMetadataOptions.java
+++ b/core/server/master/src/main/java/alluxio/master/file/options/SyncMetadataOptions.java
@@ -48,7 +48,7 @@
   }
 
   // TODO(gpang): unused?
-  public SyncMetadataOptions(CommonOptions options) {
+  SyncMetadataOptions(CommonOptions options) {
     this();
     if (options != null) {
       mCommonOptions = CommonOptions.defaults().setSyncIntervalMs(options.getSyncIntervalMs());
