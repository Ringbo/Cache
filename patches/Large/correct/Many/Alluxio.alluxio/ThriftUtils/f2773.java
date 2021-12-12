diff --git a/core/common/src/main/java/tachyon/wire/ThriftUtils.java b/core/common/src/main/java/tachyon/wire/ThriftUtils.java
index 01afd0d..6cf3d15 100644
--- a/core/common/src/main/java/tachyon/wire/ThriftUtils.java
+++ b/core/common/src/main/java/tachyon/wire/ThriftUtils.java
@@ -98,7 +98,7 @@
     result.setFileId(fileInfo.getFileId());
     result.setName(fileInfo.getName());
     result.setPath(fileInfo.getPath());
-    result.setUfsPath(fileInfo.getPath());
+    result.setUfsPath(fileInfo.getUfsPath());
     result.setLength(fileInfo.getLength());
     result.setBlockSizeBytes(fileInfo.getBlockSizeBytes());
     result.setCreationTimeMs(fileInfo.getCreationTimeMs());
@@ -144,7 +144,7 @@
     result.setJob(fromThrift(lineageInfo.getJob()));
     result.setCreationTimeMs(lineageInfo.getCreationTimeMs());
     result.setParents(lineageInfo.getParents());
-    result.setChildren(lineageInfo.getParents());
+    result.setChildren(lineageInfo.getChildren());
     return result;
   }
 
