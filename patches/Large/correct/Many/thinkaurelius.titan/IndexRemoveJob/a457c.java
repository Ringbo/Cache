diff --git a/titan-core/src/main/java/com/thinkaurelius/titan/graphdb/olap/job/IndexRemoveJob.java b/titan-core/src/main/java/com/thinkaurelius/titan/graphdb/olap/job/IndexRemoveJob.java
index 86acca1..db98260 100644
--- a/titan-core/src/main/java/com/thinkaurelius/titan/graphdb/olap/job/IndexRemoveJob.java
+++ b/titan-core/src/main/java/com/thinkaurelius/titan/graphdb/olap/job/IndexRemoveJob.java
@@ -164,7 +164,7 @@
                 try {
                     return indexSerializer.getIndexIdFromKey(k) == graphIndexId;
                 } catch (RuntimeException e) {
-                    log.debug("Filtering key {} due to exception", k, e);
+                    log.error("Filtering key {} due to exception", k, e);
                     return false;
                 }
             });
