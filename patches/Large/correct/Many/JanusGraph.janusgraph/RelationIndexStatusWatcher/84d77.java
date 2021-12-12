diff --git a/titan-core/src/main/java/com/thinkaurelius/titan/graphdb/database/management/RelationIndexStatusWatcher.java b/titan-core/src/main/java/com/thinkaurelius/titan/graphdb/database/management/RelationIndexStatusWatcher.java
index 35b522c..f4a9717 100644
--- a/titan-core/src/main/java/com/thinkaurelius/titan/graphdb/database/management/RelationIndexStatusWatcher.java
+++ b/titan-core/src/main/java/com/thinkaurelius/titan/graphdb/database/management/RelationIndexStatusWatcher.java
@@ -68,7 +68,7 @@
             if (timedOut) {
                 LOGGER.info("Timed out ({}) while waiting for index {} (relation type {}) to reach status {}",
                         timeout, relationIndexName, relationTypeName, status);
-                return new RelationIndexStatusReport(true, relationIndexName, relationTypeName, actualStatus, status, t.elapsed());
+                return new RelationIndexStatusReport(false, relationIndexName, relationTypeName, actualStatus, status, t.elapsed());
             }
 
             Thread.sleep(poll.getLength(TimeUnit.MILLISECONDS));
