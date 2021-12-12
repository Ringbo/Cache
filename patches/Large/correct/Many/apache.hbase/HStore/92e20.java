diff --git a/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/HStore.java b/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/HStore.java
index 8f8f98a..c4ea2b1 100644
--- a/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/HStore.java
+++ b/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/HStore.java
@@ -727,7 +727,7 @@
         LOG.warn("Failed flushing store file, retring num=" + i, e);
         lastException = e;
       }
-      if (lastException != null) {
+      if (lastException != null && i < (flushRetriesNumber - 1)) {
         try {
           Thread.sleep(pauseTime);
         } catch (InterruptedException e) {
