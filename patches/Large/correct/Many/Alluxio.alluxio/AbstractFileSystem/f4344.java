diff --git a/core/client/src/main/java/alluxio/hadoop/AbstractFileSystem.java b/core/client/src/main/java/alluxio/hadoop/AbstractFileSystem.java
index 813c501..46330dd 100644
--- a/core/client/src/main/java/alluxio/hadoop/AbstractFileSystem.java
+++ b/core/client/src/main/java/alluxio/hadoop/AbstractFileSystem.java
@@ -465,7 +465,7 @@
       URIStatus status = statuses.get(k);
       // TODO(hy): Replicate 3 with the number of disk replications.
       ret[k] = new FileStatus(status.getLength(), status.isFolder(), 3, status.getBlockSizeBytes(),
-          status.getCreationTimeMs(), status.getCreationTimeMs(), null, null, null,
+          status.getLastModificationTimeMs(), status.getCreationTimeMs(), null, null, null,
           new Path(mAlluxioHeader + status.getPath()));
     }
     return ret;
