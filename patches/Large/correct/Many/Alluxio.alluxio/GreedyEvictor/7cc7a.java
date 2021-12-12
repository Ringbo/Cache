diff --git a/core/server/worker/src/main/java/alluxio/worker/block/evictor/GreedyEvictor.java b/core/server/worker/src/main/java/alluxio/worker/block/evictor/GreedyEvictor.java
index ab6f8ea..5b448e6 100644
--- a/core/server/worker/src/main/java/alluxio/worker/block/evictor/GreedyEvictor.java
+++ b/core/server/worker/src/main/java/alluxio/worker/block/evictor/GreedyEvictor.java
@@ -71,7 +71,7 @@
       }
     }
     if (selectedDirView == null) {
-      LOG.error("Failed to freeSpace: No StorageDirView has enough capacity of {} bytes",
+      LOG.warn("Failed to freeSpace: No StorageDirView has enough capacity of {} bytes",
           availableBytes);
       return null;
     }
