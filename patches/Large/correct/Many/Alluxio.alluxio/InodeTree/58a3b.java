diff --git a/core/server/master/src/main/java/alluxio/master/file/meta/InodeTree.java b/core/server/master/src/main/java/alluxio/master/file/meta/InodeTree.java
index e705478..5695ce3 100644
--- a/core/server/master/src/main/java/alluxio/master/file/meta/InodeTree.java
+++ b/core/server/master/src/main/java/alluxio/master/file/meta/InodeTree.java
@@ -1068,7 +1068,7 @@
                 status = ufs.getStatus(ufsUri);
               } catch (Exception e) {
                 throw new IOException(String.format("Cannot sync UFS directory %s: %s.", ufsUri,
-                    e.getMessage()), e);
+                    e.toString()), e);
               }
               if (status.isFile()) {
                 throw new InvalidPathException(String.format(
