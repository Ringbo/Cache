diff --git a/graylog2-server/src/main/java/org/graylog2/periodical/BatchedElasticSearchOutputFlushThread.java b/graylog2-server/src/main/java/org/graylog2/periodical/BatchedElasticSearchOutputFlushThread.java
index 55c5b41..79d3d3a 100644
--- a/graylog2-server/src/main/java/org/graylog2/periodical/BatchedElasticSearchOutputFlushThread.java
+++ b/graylog2-server/src/main/java/org/graylog2/periodical/BatchedElasticSearchOutputFlushThread.java
@@ -53,7 +53,7 @@
 
     @Override
     public int getPeriodSeconds() {
-        return 30;
+        return 2;
     }
 
     @Override
