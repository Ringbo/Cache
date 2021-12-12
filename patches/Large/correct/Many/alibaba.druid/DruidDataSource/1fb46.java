diff --git a/src/main/java/com/alibaba/druid/pool/DruidDataSource.java b/src/main/java/com/alibaba/druid/pool/DruidDataSource.java
index ca316b7..a68ca21 100644
--- a/src/main/java/com/alibaba/druid/pool/DruidDataSource.java
+++ b/src/main/java/com/alibaba/druid/pool/DruidDataSource.java
@@ -548,7 +548,7 @@
         long nanos = unit.toNanos(timeout);
 
         for (;;) {
-            if (activeCount == maxActive) {
+            if (activeCount >= maxActive) {
                 long startNano = System.nanoTime();
                 notMaxActive.awaitNanos(nanos);
                 nanos -= (System.nanoTime() - startNano);
