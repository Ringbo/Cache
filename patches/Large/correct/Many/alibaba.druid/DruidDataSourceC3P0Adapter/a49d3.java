diff --git a/src/main/java/com/alibaba/druid/pool/DruidDataSourceC3P0Adapter.java b/src/main/java/com/alibaba/druid/pool/DruidDataSourceC3P0Adapter.java
index da2c969..713fa70 100644
--- a/src/main/java/com/alibaba/druid/pool/DruidDataSourceC3P0Adapter.java
+++ b/src/main/java/com/alibaba/druid/pool/DruidDataSourceC3P0Adapter.java
@@ -25,7 +25,7 @@
         this.setAcquireIncrement(3);
         this.setAcquireIncrement(30);
         this.setAcquireRetryDelay(1000);
-        this.setAutoCommitOnClose(false);
+        this.setAutoCommitOnClose(true);
         this.setAutomaticTestTable(null);
         this.setCheckoutTimeout(0);
         this.setDebugUnreturnedConnectionStackTraces(false);
