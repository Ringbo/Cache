diff --git a/core/server/master/src/main/java/alluxio/master/file/meta/UfsSyncUtils.java b/core/server/master/src/main/java/alluxio/master/file/meta/UfsSyncUtils.java
index 6dcd232..036075f 100644
--- a/core/server/master/src/main/java/alluxio/master/file/meta/UfsSyncUtils.java
+++ b/core/server/master/src/main/java/alluxio/master/file/meta/UfsSyncUtils.java
@@ -120,7 +120,7 @@
     private boolean mLoadMetadata;
     private boolean mSyncChildren;
 
-    public SyncPlan() {
+    SyncPlan() {
       mDelete = false;
       mLoadMetadata = false;
       mSyncChildren = false;
