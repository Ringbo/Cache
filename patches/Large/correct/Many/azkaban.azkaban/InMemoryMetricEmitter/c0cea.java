diff --git a/azkaban-common/src/main/java/azkaban/metric/inmemoryemitter/InMemoryMetricEmitter.java b/azkaban-common/src/main/java/azkaban/metric/inmemoryemitter/InMemoryMetricEmitter.java
index 4512a6c..febff63 100644
--- a/azkaban-common/src/main/java/azkaban/metric/inmemoryemitter/InMemoryMetricEmitter.java
+++ b/azkaban-common/src/main/java/azkaban/metric/inmemoryemitter/InMemoryMetricEmitter.java
@@ -151,7 +151,7 @@
       InMemoryHistoryNode currentNode = ite.next();
       double value = ((Number) currentNode.getValue()).doubleValue();
       // remove all elements which lies in 95% value band
-      if (value > mean + statisticalDeviationFactor * std && value < mean - statisticalDeviationFactor * std) {
+      if (value < mean + statisticalDeviationFactor * std && value > mean - statisticalDeviationFactor * std) {
         ite.remove();
       }
     }
