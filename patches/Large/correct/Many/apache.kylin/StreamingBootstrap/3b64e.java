diff --git a/job/src/main/java/org/apache/kylin/job/streaming/StreamingBootstrap.java b/job/src/main/java/org/apache/kylin/job/streaming/StreamingBootstrap.java
index cad8423..36f7dcf 100644
--- a/job/src/main/java/org/apache/kylin/job/streaming/StreamingBootstrap.java
+++ b/job/src/main/java/org/apache/kylin/job/streaming/StreamingBootstrap.java
@@ -165,7 +165,7 @@
                         for (BlockingQueue<StreamMessage> onePartition : oneCluster) {
                             try {
                                 alldata.put(onePartition.take());
-                                if (totalMessage++ % 10000 == 1) {
+                                if (totalMessage++ % 10000 == 0) {
                                     logger.info("Total stream message count: " + totalMessage);
                                 }
                             } catch (InterruptedException e) {
