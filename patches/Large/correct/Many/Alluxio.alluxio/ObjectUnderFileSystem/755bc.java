diff --git a/core/common/src/main/java/alluxio/underfs/ObjectUnderFileSystem.java b/core/common/src/main/java/alluxio/underfs/ObjectUnderFileSystem.java
index d2eea94..669832a 100644
--- a/core/common/src/main/java/alluxio/underfs/ObjectUnderFileSystem.java
+++ b/core/common/src/main/java/alluxio/underfs/ObjectUnderFileSystem.java
@@ -186,7 +186,7 @@
     DeleteBuffer deleteBuffer = new DeleteBuffer();
     UnderFileStatus[] pathsToDelete = listInternal(path, ListOptions.defaults().setRecursive(true));
     if (pathsToDelete == null) {
-      LOG.error("Unable to delete {} because listInternal returns null", path);
+      LOG.warn("Unable to delete {} because listInternal returns null", path);
       return false;
     }
     for (UnderFileStatus pathToDelete : pathsToDelete) {
