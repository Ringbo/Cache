diff --git a/storage-hbase/src/main/java/org/apache/kylin/storage/hbase/cube/v2/CubeHBaseRPC.java b/storage-hbase/src/main/java/org/apache/kylin/storage/hbase/cube/v2/CubeHBaseRPC.java
index 1e2fbd6..2e82140 100644
--- a/storage-hbase/src/main/java/org/apache/kylin/storage/hbase/cube/v2/CubeHBaseRPC.java
+++ b/storage-hbase/src/main/java/org/apache/kylin/storage/hbase/cube/v2/CubeHBaseRPC.java
@@ -293,7 +293,7 @@
         if (BackdoorToggles.getQueryTimeout() != -1) {
             coopTimeout = BackdoorToggles.getQueryTimeout();
         } else {
-            coopTimeout = cubeSeg.getConfig().getQueryCoprocessorTimeoutSeconds() * 1000;
+            coopTimeout = cubeSeg.getConfig().getQueryCoprocessorTimeoutSeconds() * 1000L;
         }
         
         int rpcTimeout;
