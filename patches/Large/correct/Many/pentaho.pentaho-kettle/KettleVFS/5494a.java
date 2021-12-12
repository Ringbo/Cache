diff --git a/src/be/ibridge/kettle/core/vfs/KettleVFS.java b/src/be/ibridge/kettle/core/vfs/KettleVFS.java
index 13e3e0d..dae2c7a 100644
--- a/src/be/ibridge/kettle/core/vfs/KettleVFS.java
+++ b/src/be/ibridge/kettle/core/vfs/KettleVFS.java
@@ -104,7 +104,7 @@
         FileObject fileObject = getFileObject(vfsFilename);
         fileObject.createFile();
         FileContent content = fileObject.getContent();
-        return content.getOutputStream();
+        return content.getOutputStream(append);
     }
     
     public static String getFilename(FileObject fileObject)
