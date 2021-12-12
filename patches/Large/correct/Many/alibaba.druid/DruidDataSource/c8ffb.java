diff --git a/src/main/java/com/alibaba/druid/pool/DruidDataSource.java b/src/main/java/com/alibaba/druid/pool/DruidDataSource.java
index 862872f..4cda151 100644
--- a/src/main/java/com/alibaba/druid/pool/DruidDataSource.java
+++ b/src/main/java/com/alibaba/druid/pool/DruidDataSource.java
@@ -3210,7 +3210,7 @@
             map.put("ActiveCount", this.getActiveCount());
             map.put("PoolingCount", this.getPoolingCount());
             map.put("LockQueueLength", this.getLockQueueLength());
-            map.put("WaitThreadCount", this.getNotEmptyWaitThreadPeak());
+            map.put("WaitThreadCount", this.getNotEmptyWaitThreadCount());
 
             // 10 - 14
             map.put("InitialSize", this.getInitialSize());
