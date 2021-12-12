diff --git a/src/main/java/org/elasticsearch/index/store/smbmmapfs/SmbMmapFsDirectoryService.java b/src/main/java/org/elasticsearch/index/store/smbmmapfs/SmbMmapFsDirectoryService.java
index 9d24828..47efbd0 100644
--- a/src/main/java/org/elasticsearch/index/store/smbmmapfs/SmbMmapFsDirectoryService.java
+++ b/src/main/java/org/elasticsearch/index/store/smbmmapfs/SmbMmapFsDirectoryService.java
@@ -43,6 +43,6 @@
     @Override
     protected Directory newFSDirectory(Path location, LockFactory lockFactory) throws IOException {
         logger.debug("wrapping MMapDirectory for SMB");
-        return new SmbDirectoryWrapper(new MMapDirectory(location, buildLockFactory()));
+        return new SmbDirectoryWrapper(new MMapDirectory(location, buildLockFactory(indexSettings)));
     }
 }
