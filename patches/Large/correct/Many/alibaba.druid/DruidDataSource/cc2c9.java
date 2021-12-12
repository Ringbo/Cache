diff --git a/src/main/java/com/alibaba/druid/pool/DruidDataSource.java b/src/main/java/com/alibaba/druid/pool/DruidDataSource.java
index b26f0f9..3831a40 100644
--- a/src/main/java/com/alibaba/druid/pool/DruidDataSource.java
+++ b/src/main/java/com/alibaba/druid/pool/DruidDataSource.java
@@ -3401,7 +3401,7 @@
             map.put("ActiveCount", this.getActiveCount());
             map.put("PoolingCount", this.getPoolingCount());
             map.put("LockQueueLength", this.getLockQueueLength());
-            map.put("WaitThreadCount", this.getNotEmptyWaitThreadPeak());
+            map.put("WaitThreadCount", this.getNotEmptyWaitThreadCount());
 
             // 10 - 14
             map.put("InitialSize", this.getInitialSize());
