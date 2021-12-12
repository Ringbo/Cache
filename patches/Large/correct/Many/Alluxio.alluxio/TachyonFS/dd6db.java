diff --git a/clients/unshaded/src/main/java/tachyon/client/TachyonFS.java b/clients/unshaded/src/main/java/tachyon/client/TachyonFS.java
index 1d84345..a70ef6f 100644
--- a/clients/unshaded/src/main/java/tachyon/client/TachyonFS.java
+++ b/clients/unshaded/src/main/java/tachyon/client/TachyonFS.java
@@ -331,7 +331,7 @@
     if (blockSizeByte > 0) {
       return (int) mFSMasterClient.createFile(path.getPath(), blockSizeByte, recursive);
     } else {
-      return (int) mFSMasterClient.loadFileInfoFromUfs(path.getPath(), ufsPath.getPath(),
+      return (int) mFSMasterClient.loadFileInfoFromUfs(path.getPath(), ufsPath.toString(),
           blockSizeByte, recursive);
     }
   }
