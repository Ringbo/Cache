diff --git a/clients/unshaded/src/main/java/tachyon/client/file/TachyonFileSystem.java b/clients/unshaded/src/main/java/tachyon/client/file/TachyonFileSystem.java
index 370f876..f6d1786 100644
--- a/clients/unshaded/src/main/java/tachyon/client/file/TachyonFileSystem.java
+++ b/clients/unshaded/src/main/java/tachyon/client/file/TachyonFileSystem.java
@@ -206,7 +206,7 @@
       throws IOException {
     FileSystemMasterClient masterClient = mContext.acquireMasterClient();
     try {
-      return masterClient.loadFileInfoFromUfs(path.getPath(), ufsPath.getPath(), -1L, recursive);
+      return masterClient.loadFileInfoFromUfs(path.getPath(), ufsPath.toString(), -1L, recursive);
     } finally {
       mContext.releaseMasterClient(masterClient);
     }
