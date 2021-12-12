diff --git a/core/server/master/src/main/java/alluxio/master/file/DefaultFileSystemMaster.java b/core/server/master/src/main/java/alluxio/master/file/DefaultFileSystemMaster.java
index 35adf13..a2a5a5c 100644
--- a/core/server/master/src/main/java/alluxio/master/file/DefaultFileSystemMaster.java
+++ b/core/server/master/src/main/java/alluxio/master/file/DefaultFileSystemMaster.java
@@ -306,7 +306,7 @@
     mAsyncPersistHandler = AsyncPersistHandler.Factory.create(new FileSystemMasterView(this));
     mPermissionChecker = new PermissionChecker(mInodeTree);
 
-    registry.add(DefaultFileSystemMaster.class, this);
+    registry.add(FileSystemMaster.class, this);
     Metrics.registerGauges(this);
   }
 
