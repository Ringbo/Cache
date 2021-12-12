diff --git a/core/client/src/main/java/alluxio/client/file/BaseFileSystem.java b/core/client/src/main/java/alluxio/client/file/BaseFileSystem.java
index d1e4c62..a911fcb 100644
--- a/core/client/src/main/java/alluxio/client/file/BaseFileSystem.java
+++ b/core/client/src/main/java/alluxio/client/file/BaseFileSystem.java
@@ -263,7 +263,7 @@
       throw new FileNotFoundException(
           ExceptionMessage.CANNOT_READ_DIRECTORY.getMessage(status.getName()));
     }
-    return FileInStream.create(status, options.toInStreamOptions(), mContext);
+    return FileInStream.create(status, options.toInStreamOptions(), mFileSystemContext);
   }
 
   @Override
